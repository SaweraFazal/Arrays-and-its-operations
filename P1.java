public class P1 {
private static void printArray(Integer[] intArray) {
	System.out.println("array contents printed through method:");
	for(Integer val:intArray)
		System.out.println(val+" ");
}
public static void main(String[] arg) {
	Integer[] intArray= {10,20,30,40,50,60,70,80};
	printArray(intArray);
}
}
