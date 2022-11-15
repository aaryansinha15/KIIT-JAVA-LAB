 class Triangle {
    int breadth, height;

    Triangle() {
        breadth = height = 0;
    }

    Triangle(int a, int c) {
        breadth = a;
        height = c;
    }

    float findArea() {
        return (0.5f * breadth * height);
    }

    public String toString() {
        return (breadth + " " + height);
    }

}

public class  Q_4demo {

    public static void main(String args[]) {
        Triangle t1 = new Triangle(25, 50);

        System.out.println(t1);

    }
}