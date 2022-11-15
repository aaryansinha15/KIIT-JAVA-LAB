class point
{
    int r,s;
    // private data members
    point(){
        r=s=0;
    }
    point(int a, int b)
    {
        r=a;
        s=b;
    }
    point(point z)
    {
        r=z.r;
        s=z.s;
    }
    float finddistance()
    {
        // fd to bbe calculated from the distance(0,0)
        float fd = (float)Math.sqrt(r*r+s*s);
        return fd;
    }
    float finddistance(int r1, int y1)
    {
        // fd to bbe calculated from the distance x1,y1
        float fd = (float)Math.sqrt((r-r1)*(r-r1)+(s-y1)*(s-y1));
        return fd;
    }
    float finddistance(point z)
    {
        // fd to bbe calculated from the distance  of point type
        float fd = (float)Math.sqrt((r-z.r)*(r-z.r)+(s-z.s)*(s-z.s));
        return fd;
    }
    void show(){
        System.out.println("Value of r-coordinate : "+r);
        System.out.println("Value of y-coordinate : "+s);
    }
}

public class PointDemo{
    public static void main(String args[]){
        point p1 = new point();
        point p2 = new point(9,3);
        point p3 = new point(p2);
        System.out.println("-----------------");
        System.out.println("For P1 object");
        p1.show();
        System.out.println("-------------------------");
        System.out.println("For P2 object");
        p2.show();
        System.out.println("--------------------");
        System.out.println("For P3 object");       
         p3.show();
        System.out.println("--------------------");
        System.out.println("Finding Distance using default constructor");
        System.out.println(p2.finddistance());
        System.out.println("------------");
        System.out.println("Finding Distance using parameterized constructor");
        System.out.println(p2.finddistance(1,1));
        System.out.println("---------------");
        System.out.println("Finding Distance using class type variable constructor");
        System.out.println(p2.finddistance(p1));
    }
}
