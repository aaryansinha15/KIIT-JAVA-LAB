import java.util.Scanner;

public class Q_2demo 
{
    public static void main (String[] args)
    {
        try{
        int z=0;
        int c=4/z;
        System.out.println("Not executed");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero error");
        }
        System.out.println("Outside catch block");

    }

}
