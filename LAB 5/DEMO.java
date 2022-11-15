// import java.util.Scanner;
// interface Area
// {
//     void findArea();
// }

// class Triangle implements Area {
//     float base, height;
//     Triangle(){
//         base=height=0.0f;
//     }
//     Triangle(float b, float h){
//         base=b;
//         height=h;
//     }
//     public void findArea(){
//         float a=0.5f*base*height;
//         System.out.println("Area of Triangle is" +" "+a);
//     }
// }
// class Rectangle implements Area {
//     float width, height;
//     Rectangle(){
//         width=height=0.0f;
//     }
//      Rectangle(float w, float h){
//         width=w;
//         height=h;
//     }
//     public void findArea(){
//         float a=width*height;
//         System.out.println("Area of Rectangle is" +" "+a);
//     }
// }

// class DEMO
// {
//     public static void main(String args[]){
//         Area a = new Triangle(6.0f,8.0f);
//         a.findArea();
//         a = new Rectangle (5.00f,23.0f);
//         a.findArea();
//     }
// }



interface  Area{
    void findArea();
}

class Triangle implements Area {
    float base, height;
    Triangle(){
        base=height=0.0f;
    }
    Triangle(float b, float h){
        base=b;
        height=h;
    }
    public void findArea(){
        float a=0.5f*base*height;
        System.out.println("Area of Triangle is"+a);
    }
}
class Rectangle implements Area {
    float width, height;
    Rectangle(){
        width=height=0.0f;
    }
     Rectangle(float w, float h){
        width=w;
        height=h;
    }
    public void findArea(){
        float a=width*height;
        System.out.println("Area of Rectangle is"+a);
    }
}
class DEMO{
    public static void main(String args[]){
        Area a= new Triangle(3.0f,4.0f);
        a.findArea();
        a= new Rectangle (5.00f,10.0f);
        a.findArea();
    }
}