import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        try{ 
            System.out.println("This program will print the result of a/b");
            Scanner sc = new Scanner(System.in); 
            System.out.print("Enter value of a: ");
            int data1 = sc.nextInt();
            System.out.print("Enter value of b: ");
            int data2 = sc.nextInt();  
            sc.close();
            System.out.println(data1/data2);            
        }  
        catch(ArithmeticException e1){ 
           System.out.println(e1); 
        }  
        finally{
            System.out.println("Inside finally block");
        }  
        System.out.println("End of the Code");  
    }  
}