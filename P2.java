import java.util.*;
public class P2 {
	public int find_max(int[] myarray) {
	int max_val=0;
	for(int i=0; i<myarray.length;i++) {
		if(myarray[i]>max_val) {
		 max_val=myarray[i];	
		}
	}		
	return max_val;
	}
 
	public static void main(String args[]) {
	int[] myarray= {43,54,23,65,78,85,88,92,10};
System.out.println("input arrays:"+ Arrays.toString(myarray));	
	P2 obj=new P2();
	System.out.println("max value in the given array is"+obj.find_max(myarray));
	}
}


