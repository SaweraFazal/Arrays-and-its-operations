package lab5;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class P8 {
	public static void main(String[] args) {
		int[] a= {1,2,7,4,5};
		int temp=0;
		//display elements of array a before sorting
		System.out.println("elements of array a before sorting:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		//sorting elements in ascending order
		for (int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[j];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		//elements of array after sorting
		System.out.println("elements of array a after sorting in ascending order:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		int[] b=  {4,3,6,8,1};
		int btemp=0;
		//display element of b array before sorting
		System.out.println("elements of b array before sorting");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		//sorting b elements in descending order
		for (int i=0;i<b.length;i++) {
		for(int j=i+1;j<b.length;j++) {
			if(b[i]<b[j]) {
				btemp=b[i];
				b[i]=b[j];
				b[j]=btemp;
			}
		}
		}
		System.out.println();
		//elements of array after sorting
		System.out.println("elements of b array after sorting: ");
		for (int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		
			 int[] c = new int [a+b];
			 Arrays.sort(c);
			 for(int element: a) {
					a[i] = element;
					i++;
				}
				
				for(int element: b) {
					b[i] = element;
					i++;
				}		
				Arrays.sort(c);
		}
		}
		
	


