import java.util.Scanner;
public class q_9_prime_check {
    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        int num;
        int isPrime =1;
        Scanner input = new Scanner(System.in);
        num=input.nextInt();      
        if(num == 0 || num==1)
        {
            System.out.println("Not a prime number");
        }
        for(int i=2; i*i<num;i++)
            {
                if(num%i==0)
                {
                    isPrime=0;
                }        
            }
            if(isPrime==1)
            {
                System.out.println("The number is prime number");
            }
            else
            {
                System.out.println("The number is not prime number");
            }
        }
    }
    
