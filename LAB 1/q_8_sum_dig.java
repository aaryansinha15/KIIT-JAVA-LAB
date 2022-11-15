import java.util.Scanner;

public class q_8_sum_dig
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        int num;
        int digit; //number to store last digit
        int sum =0; // number to store sum of digit
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        while(num>0)
        {
            digit=num%10; 
            sum+=digit;
            num=num/10;
        }
        System.out.println("The sum of digits are: " + sum);
    }
}