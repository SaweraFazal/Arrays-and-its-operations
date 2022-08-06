package lab5;

public class Gradebook {
	private String coursename;
	private int[][] grades; 
	public Gradebook(String coursename,int[][] grades)//constructor
	{
		this.coursename=coursename;
	    this.grades=grades;
	}
	
	public String getCoursename() {
		return coursename;
	}
	
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
public void processGrades()
{
	outputGrade();
	System.out.printf("%n%s %d%n%s %d%n%n","lowest grade in the grade book is",getMinimum(),"highest grade in the grade book is",getMaximum());
	outputBarChart();
	}
public int getMinimum() {
	int lowGrade=grades[0][0];
	//loop through rows of grades array
	for(int[] studentgrades:grades) {
		//loop through columns of current row
		for (int grade:studentgrades) {
			if(grade<lowGrade)
				lowGrade=grade;
		}
	}

return lowGrade;
		}
public int getMaximum()
{
int highGrade=grades[0][0];
for (int[] studentgrades :grades) {
	for(int grade:studentgrades)
	{
		if (grade>highGrade)
		highGrade=grade;
	}
}
return highGrade;
}
//average grade for particular set of grades
public double getAverage(int[] setofgrades)
{
	int total=0;
	//sum grades for 1 student
	for(int grade: setofgrades)
		total+=grade;
	return (double) total/setofgrades.length;
	}
//output bar chart displaying overall grade 
public void outputBarChart() {
	System.out.println("overall grade distribution: ");
	int[] frequency =new int[11];
	for (int[] studentgrades:grades) {
		for(int grade:studentgrades)
			++frequency[grade/10];
	}
for(int  count=0; count<frequency.length;count++)
{
	if(count==10)
		System.out.printf("%5d: ",100);
	else
		System.out.printf("%02d-%02d: ", count*10,count*10+9);
	//bar of *****
	for(int stars=0;stars<frequency[count];stars++)
		System.out.print("*");
	System.out.println();
	}
}
public void outputGrade()
{
System.out.printf("the grades are: %n%n");
System.out.print("             ");//align columns heads
//create column heads for each tests
for(int test=0; test<grades[0].length;test++)
	System.out.printf("Test %d ", test +1);
System.out.println("average");
//create rows/columns of text representing array grades
for (int student =0; student<grades.length;student++) {
	System.out.printf("Student %2d" ,  student+1);
	for (int test:grades[student])
		System.out.printf("%8d ", test);
	double average=getAverage(grades[student]);
	System.out.printf("%9.2f%n ", average);
	
}
}
}
