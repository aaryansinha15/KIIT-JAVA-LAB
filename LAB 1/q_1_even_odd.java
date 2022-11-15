import java.util.Scanner;

class q_1_even_odd
{
    public static void main (String [] args)
    {  
        // to check a number is even or odd
        System.out.println("Checking if even or odd");
        System.out.println("Enter a number");
         Scanner input = new Scanner(System.in);
         int num= input.nextInt();
         System.out.println("You entered " +num);
         
         if(num%2==0)
         {
             System.out.println("This is an Even number");
         }
         else
         System.out.println("This is an Odd number");

            
         
    }
}