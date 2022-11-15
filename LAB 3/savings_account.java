class Interest_rate
{
    static double annualInterest;
    double savingsBalance;
    long accountNumber;
   
    Interest_rate(double annualInterest, double savingsBalance, long accountNumber)
     {
         this.annualInterest=annualInterest;
         this.savingsBalance=savingsBalance;
         this.accountNumber=accountNumber;
     }

     double calculate_Monthly_Interest()
     {
         double monthly_interest;
        
         monthly_interest = (savingsBalance * annualInterest)/(12*100);

         savingsBalance += monthly_interest; 
         return monthly_interest;       
    }

    static void modify_Interest_Rate(double new_rate)
    {
          annualInterest=new_rate;
    }

    void display()
    {
        System.out.println("Therefore the annualInterest receiving is " +annualInterest);
        System.out.println("Current savingsBalance is "+savingsBalance);
        System.out.println("Account Number is " +accountNumber);
          System.out.println("-------------------------");
          System.out.println("The monthly_interest recieving is "+calculate_Monthly_Interest());
          System.out.println("-----------------");
          System.out.println("The updated savingsBalance is "+savingsBalance);
    }
}


public class savings_account {
    public static void main(String[] args)
    {
        System.out.println("-----------------------");
        System.out.println("For 4% the interest rate will be");
        Interest_rate i1=new Interest_rate(4,5000,20051796);
        i1.display();
        System.out.println("-----------------------");

        System.out.println("For 5% the interest rate will be");
        Interest_rate i2=new Interest_rate(5,5000,1110238);
        i2.display();
        
    }
    
}
