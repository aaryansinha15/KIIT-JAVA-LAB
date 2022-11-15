interface PersonalLoan
{
    void find_Simple_Interest(float p, int y);

}
class Bank1 implements PersonalLoan
{
    static double interest_rate;

    public void find_Simple_Interest(float p,int y)
    {
        interest_rate= (p*y*.10);
        System.out.println(interest_rate+"\n");
    }
}
class Bank2 implements PersonalLoan
{
    static double interest_rate;
    public void find_Simple_Interest(float p,int y)
    {
        interest_rate= (p*y*.15);
        System.out.println(interest_rate+"\n");
    }
}
public class LOAN 
{
    public static void main(String args[])
    {
        Bank1 b1=new Bank1();
        
        Bank2 b2=new Bank2();

        System.out.print("The interest from the first bank is :");
        b1.find_Simple_Interest(75,8);

        System.out.print("The interest from the second bank is :");
        b2.find_Simple_Interest(75,8);
    }
}