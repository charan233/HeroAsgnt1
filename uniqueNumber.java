import java.io.*;   
import java.util.*; 
import java.util.Scanner;  
class uniqueNumber.java
{

    public static void printData(int arr[], int n){


        for (int i = 0; i < n; i++)
		{


            int j;
            for (j = 0; j < i; j++)
            {
                if(arr[i] == arr[j])
                {
                    break;
                }
            }


            if(i == j)
            {
                System.out.print( arr[j] + " ");
                
            }
        }
    }              
    
	public static void main (String args[])
	{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }	

		printData(arr, n);



	}
}