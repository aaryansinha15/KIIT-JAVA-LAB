// 1. Write a Java program to generate an ArrayIndexOutofBoundsException and handle it
// using catch statement.

import java.util.Scanner;

public class q1
{
    public static void main (String[] args) 
    {
        int arr[]={4,6,7,3,1,8,4,9};
        System.out.println("The array is ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(" "+arr[i]);
        }
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the array for checking the exception ");
        try
        {
            int ind=input.nextInt();
            System.out.println(arr[ind] +" " + "is at index"+ " " + ind + " "+"of the array ");
        }
        catch (ArrayIndexOutOfBoundsException e1)
        {
            System.out.println(e1);
        }
        System.out.println("End of the code\n");
    }


}
