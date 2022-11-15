import java.util.Scanner;

class Shape
{
    float dim_1;
    float dim_2;
   Shape()
   {
     dim_1 = 0;
     dim_2=0;
   }

   Shape(float x, float y)
   {
       dim_1=x;
       dim_2=y;
   }
}

class Triangle extends Shape
{
    Triangle()
    {
        super();
    }
    Triangle(float s1,float s2)
    { 
        super(s1,s2);
    }
    void area(float x,float y)
    {
         float result =0.5f *x * y;
        System.out.println("The are of Triangle is " + result);

    }
}

class  Rectangle extends Shape
{
    Rectangle()
    {
        super();
    }
    Rectangle(float r1,float r2)
    {
        super(r1,r2);
    }
    void area(float x,float y)
    {
        double result_2= x*y;
        System.out.println("The are of Rectangle is " + result_2);
    }
}


public class Demo_shape_q1 {
    public static void main(String[] args)
    {
        float t1,t2;
        float r1,r2;

        System.out.println("Please enter the values for Triangle");
        Triangle t= new Triangle();

        Scanner input= new Scanner(System.in);

        t1=input.nextInt();
        t2=input.nextInt();
        
        System.out.println("Therefore the area of the triangle is ");
        t.area(t1,t2);
        System.out.println("");

        System.out.println("Please Enter the values for Rectangle");
        Rectangle r= new Rectangle();
        r1=input.nextInt();
        r2=input.nextInt();

        System.out.println("Therefore the area of the Rectangle is ");
        r.area(r1,r2);
    }
    
}
