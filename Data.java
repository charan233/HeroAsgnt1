import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.*;
class Data
{

    public static void main(String args[]){}
    
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {

            a[i]=sc.nextInt();

        }
        int dif=a[0]-0;
        for(int i=0;i<n;i++)
        {
            
            if(dif<(a[i]-i))
            {
                while((a[i]-i)!=dif)
                {

                    System.out.print((dif+i)+" ");
                    dif++;

                } 
            }           
        }   
        

    }

}