import java.util.Scanner;

public class q_3_fact
{
    public static void main (String[] args)
    {
        System.out.println("Enter a number: ");
        int fact=1;
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        while(num>0)
        {
            fact= fact*num--;
        }
        System.out.print("The factorial of "+num);
        System.out.println("is coming out to be "+fact);   
    }
}