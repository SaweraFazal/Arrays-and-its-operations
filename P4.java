
public class P4 {
	public static void main(String[] args) {
	final int n=10;
	int[] random_numbers;
	random_numbers=create_random(n);
	System.out.println("the array of  random numbers: ");
	for (int i =0; i<random_numbers.length;i++) {
		System.out.print(random_numbers[i]+ " ");		
	}	
	}

public static int[] create_random(int n)
{
	int[] random_array=new int[n];
for (int i=0;i<random_array.length;i++)
{
	random_array[i]=(int)(Math.random()*10);
	}
return random_array;
}
}
