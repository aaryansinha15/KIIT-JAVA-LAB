import java.util.Scanner;
class NegativeAmountException extends Exception {
    NegativeAmountException() {
        super();
    }

    public String toString() {
        return "Negative Amount Exception";
    }
}

class MinimumAmountException extends Exception {
    MinimumAmountException() {
        super();
    }

    public String toString() {
        return "Minimum Amount Exception";
    }
}

class Account {
    String name;
    int accno;
    float balance;

    Account() {
    }

    Account(String x, int y, int z) throws NegativeAmountException, MinimumAmountException {
        if (z < 0)
            throw new NegativeAmountException();
        else if (z < 2000.00f) {
            throw new MinimumAmountException();
        } else {
            name = x;
            accno = y;
            balance = z;
        }
    }
    void withdraw(float cash) throws NegativeAmountException,MinimumAmountException{
        if(cash<0)
            throw new NegativeAmountException();
        else if((balance-cash)<2000.00f){
            throw new MinimumAmountException();
        }
        else{
            balance-=cash;
        }
    }
    void deposit(float cash) throws NegativeAmountException{
        if(cash<0)
            throw new NegativeAmountException();
        else
            balance+=cash;
    }
}

public class q2 {
    public static void main(String x[]){
        try{
            Account a=new Account("abc",123,1100);
            a.deposit(2500);
            a.withdraw(500);
        }
        catch(NegativeAmountException e){
            System.out.println(e);
        }
        catch(MinimumAmountException e){
            System.out.println(e);
        }
        System.out.println("No error");
    }
}