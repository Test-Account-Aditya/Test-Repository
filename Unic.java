/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int arrayWithDuplicates[] = new int[n];
		System.out.println("Enter "+n+" elements:");
		for(int i=0;i<n;i++)
		{
		    arrayWithDuplicates[i] = sc.nextInt();
		}
		System.out.println("Your Entered Array is: ");
		for(int i=0;i<n;i++)
		{
		    System.out.print(arrayWithDuplicates[i]+" ");
		} 
           
        int len = arrayWithDuplicates.length;   
           
        int[] distinctArray = new int[20];  
          
        int index = 0;  
           
        for (int i = 0; i < len; i++)   
        {   
            int flag = 0;  
            for (int j = 0; j < i; j++){  
                if (arrayWithDuplicates[i] == arrayWithDuplicates[j]){   
                    flag = 1;  
                    break;   
                }  
            }  
            if (flag == 0){   
                distinctArray[index] = arrayWithDuplicates[i];  
                index++; 
            }  
        }  
        
        System.out.println();
        for(int i = 0; i < index; i++)  
            System.out.print( distinctArray[i] + " "); 
	}
}
