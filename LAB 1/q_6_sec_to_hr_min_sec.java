import java.util.Scanner;

public class q_6_sec_to_hr_min_sec
{
    public static void main(String[] args)
    {
        System.out.println("Time conversion");
        System.out.println("Enter the value for seconds");
        int sec1,hr,min,sec2;
        Scanner input = new Scanner(System.in);
        sec1=input.nextInt();
        hr=sec1/3600;
        min=(sec1%3600)/60;
        sec2=sec1%60;

        System.out.println("The convserion of seconds to hr:min:sec is ");
        System.out.println(hr+":"+min+":"+sec2);

    }
}
