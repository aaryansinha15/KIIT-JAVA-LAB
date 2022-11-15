interface Two_D {
    void find_area();
}

interface Three_D extends Two_D 
{
    void find_volume();
}

class CUBOID implements Two_D, Three_D 
{
    float l, w, h;

    CUBOID() 
    {
        this.l = this.w = this.h = 0.0f;
    }

    CUBOID(float l, float w, float h) 
    {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public void find_area() 
    {
        float area = (2 * l * w) + (2 * w * h) + (2 * l * h);
        System.out.println("Surface area of Cuboid is " + area + " sq. units.");
    }

    public void find_volume() 
    {
        float vol = l * w * h;
        System.out.println("Volume of Cuboid is " + vol + " cubic units.\n");
    }
}

class CUBE implements Two_D, Three_D 
{
    float side;

    CUBE() 
    {
        side = 0.0f;
    }

    CUBE(float s) 
    {
        side = s;
    }

    public void find_area() 
    {
        float area = 6 * side * side;
        System.out.println("Surface area of Cube is " + area + " sq. units.");
    }

    public void find_volume() 
    {
        float vol = side * side * side;
        System.out.println("Volume of Cube is " + vol + " cubic units.");
    }
}

public class figure
{
    public static void main(String[] args) 
    {
        CUBOID C = new CUBOID(5.6f, 5.6f, 5.6f);
        C.find_area();
        C.find_volume();

        CUBE c = new CUBE(2.8f);
        c.find_area();
        c.find_volume();
    }
}