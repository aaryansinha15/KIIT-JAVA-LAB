import java.util.Scanner;

public class q_7_dec_bina
{ 
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n;
        int[] bnum=  new int[1000]; 
        int i = 0; 
        System.out.println("Enter the number :");
        n=input.nextInt();
        while (n > 0)  
        { 
            bnum[i] = n % 2; 
            n = n / 2; 
            i++; 
        } 
        for (int j = i - 1; j >= 0; j--) 

            System.out.print(bnum[j]); 
    } 
}