import java.util.Scanner;

public class q_2_ar_peri_rect 
{
    public static void main (String[] args)
    {
        int l,b;
        // to calculate area and peri for rectangle
        System.out.println("Enter the value for length");
        Scanner input= new Scanner(System.in);
        l = input.nextInt();
        System.out.println("Enter the value for breadth");
        b=input.nextInt();

        int area;

        area = l*b;
        System.out.println("Area of rectangle is " + area);

        int peri;
        peri = 2*(l+b);
        System.out.println("Perimeter of Rectangle is " + peri); 
   }
}
