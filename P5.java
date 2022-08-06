public class P5 {
	static int findelements(int arr[], int n,int key)
	{
		for(int i=0;i<n;i++)
			if (arr[i]==key)
				return i;
				return -1;
		}
public static void main(String args[])
{
int arr[]= {12,34,10,6,48};
int n=arr.length;
int key=6;
int position=findelements(arr,n,key);
if (position==-1)
	System.out.println("element not found");
else
System.out.println ("element found at position"+(position +1));
}
}

