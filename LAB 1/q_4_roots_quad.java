import java.util.Scanner;
public class q_4_roots_quad {  

public static void main(String args[])
{
        Scanner input= new Scanner(System.in);
        float x, z, y;
	double root1, root2, imaginary, disc;
	System.out.println("Enter three values for the Quadratic Equation :  ");
  	x=input.nextInt();
  	z=input.nextInt();
  	y=input.nextInt();
  	disc= (z * z) - (4 *x *y);	
  	if(disc > 0)
  	{
  		root1 = (-z + Math.pow(disc, 0.5)) / (2 * x);
  		root2 = (-z - Math.pow(disc, 0.5)) / (2 * x);
		System.out.println("Two Real Roots Exists: ="+root1+"and"+root2);
  	}
  	else if(disc == 0)
  	{
  		root1 = root2 = -z / (2 * x);
  		System.out.println("Two Distinct Real Roots Exists: ="+root1);
  	}
  	else if(disc < 0)
  	{	System.out.println("Imaginary Roots");

  	}
  	
 }
}