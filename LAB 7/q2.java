// 2. A subclass exception must appear before super-class exception. Justify this with 
// suitable Java programs.

import java.util.Scanner;
public class q2 
{

    public static void main (String args[])
    {
        int a;
        System.out.println("Please enter the value of a ");
        Scanner input= new Scanner(System.in);
        try 
        {
            a=input.nextInt();   
            // expression for checking 
            int check=a/0;
            System.out.println("Answer for check is"+check); 
        }
        // subclass exception
        catch (ArithmeticException e1)
        {
            System.out.println("Subclass ArithmeticException Occured");
        }
        // superclass exception
        catch (Exception e2)
        {
            System.out.println("Superclass Exception Occured");
        }
        System.out.println("End of the code\n");



        
    }
    
}
