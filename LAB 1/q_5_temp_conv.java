import java.util.Scanner;
 public class q_5_temp_conv
 {
  public static void main(String args[])
   { double farh, cel;
     Scanner input = new Scanner(System.in);
     System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius\n 2.Celsius to Fahrenheit");
      int ch = input.nextInt();
       switch (ch)
        {
             case 1: System.out.println("Enter Fahrenheit temperature"); 
             farh = input.nextDouble(); 
             cel = (farh - 32) * 5 / 9;
              System.out.println("Celsius temperature is = " + cel); 
              break;
               case 2: System.out.println("Enter Celsius temperature"); 
               cel = input.nextDouble();
                farh = ((9 * cel) / 5) + 32;
                 System.out.println("Fahrenheit temperature is = " + farh);
                  break; 
                  default: System.out.println("please choose valid choice");
                 }
        }
    }