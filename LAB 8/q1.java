import java.util.Scanner;
import java.lang.*;
class NoTriangleFormException extends Exception
{
    NoTriangleFormException()
    {
        super();
    }
   public String toString()
    {
        return "No Triangle Formed";
    }
}
class Triangle
{
    int a,b,c;
    Triangle(int x1,int y1,int z1) throws NoTriangleFormException
    {
        if(((x1+y1)>z1) && ((z1+x1)>y1))
        {
            a=x1;
            b=y1;
            c=z1;
        }
        else{
        throw new NoTriangleFormException();
        }
    }
    void find_Area(int x1,int y1,int z1)
    {
        a=x1;
        b=y1;
        c=z1;
        double s=(a+b+c)/2;
        double areas=s*(s-a)*(s-b)*(s-c);
        double area=Math.sqrt(areas);
        System.out.println("the area of the triangle is: "+area);

    }
    void find_Perimeter()
    {
 int perime=a+b+c;
 System.out.println("perimeter of the triangle is: "+perime);
    }

}



public class q1
{
    public static void main(String[] args)
    {
        int p,q,r;
        System.out.println("Enter three numbers");
        Scanner input= new Scanner(System.in);
        p=input.nextInt();
        q=input.nextInt();
        r=input.nextInt();
        try{
            Triangle t1=new Triangle(p,q,r);
            t1.find_Area(3,4,5);
            t1.find_Perimeter();
        }
        catch(NoTriangleFormException e1)
        {
            System.out.println(e1);
        }
       
    }


}