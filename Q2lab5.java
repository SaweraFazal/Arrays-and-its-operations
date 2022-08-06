package lab5;

import java.util.Arrays;
import java.util.Scanner;

public class Q2lab5 {

	static Scanner console = new Scanner(System. in );
    
	public static void main(String args[]) {
	      System.out.println("Enter the required size of the array :: ");
	      Scanner s = new Scanner(System.in);
	      int size = s.nextInt();
	      int myArray[] = new int [size];
	      System.out.println("Enter the elements of the array one by one ");
	      for(int i=0; i<size; i++) {
	         myArray[i] = s.nextInt();
	      }
	      System.out.println("Contents of the array are: "+Arrays.toString(myArray));
	   
	
        int option;
        do 
        {
            System.out.println("Menu ");
            System.out.println("1. Read Array");
            System.out.println("2. Display Array");
            System.out.println("3. Search an Item in Array");
            System.out.println("4. Sort the Array");
            System.out.println("5. Exit");
            System.out.print("Select an Option : ");
            option = console.nextInt();
        
            switch (option) 
            {
                case 1:
                    readArray(myArray);
                    break;
                case 2:
                    displayArray(myArray);
                    break;
                case 3:
                    System.out.print("Enter the number you want to search: ");
                    int item = console.nextInt();
                    int index = searchArray(myArray, item);
                    if (index == -1) 
                    {
                        System.out.println("Item not found");
                    }
                    else 
                    {
                        System.out.println("Item found at position " + (index + 1));
                    }
                    break;
                case 4:
                    System.out.println("Sorted array :");
                    sortArray(myArray);
                    displayArray(myArray);
                    break;
            }
        } while (option != 5);
    }
    
    static void readArray(int[] array) 
    {
        for (int i = 0; i < array.length; i++)
        {
           array[i] = console.nextInt();
        }
    }

    static void displayArray(int[] array) 
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static int searchArray(int[] array, int data) 
    {
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] == data)
            {
                return i;
            }
        }        
        return -1;
    }
    
    static void sortArray(int[] array) 
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            for(int j = 0; j < array.length -i-1; j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }          
    }
    

}



