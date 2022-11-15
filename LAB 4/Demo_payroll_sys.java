import java.util.Scanner;

class Employee
{
    float  payment;
    int hours;
    Employee(){
     payment=0;
    }
    Employee(float sal){
     payment=sal;
       
    }
}
class salaried_employees extends Employee{
    salaried_employees(float p){
    super(p);
}
void display(){
    System.out.println("fixed salary is" +payment);
}
}
class houremployee extends Employee{
    int hours;
houremployee(float p){
    super(p);
}
void get(int hrs){
    hours=hrs;
}
 void calsalary(){
     payment=(hours *payment)/40;
     System.out.println("the hourly salary of employee inthe week is:" +payment);
 }
}
class basicmployee extends Employee{
    float sales;
    basicmployee(float p){
        super(p);
    }
    void get(float sale){
        sales=sale;
    }
     void calsalary(){
         payment=payment+(10*sales)/100;
         System.out.println("the comission salary of employee inthe week is:" +payment);
     }
}
class currentemployee extends Employee{
    currentemployee(float p){
        super(p);
    }
     void calsalary(){
         payment=(10 *payment)/100;
         System.out.println("the current salary of employee inthe week is:" +payment);
     }
}
public class Demo_payroll_sys {
    public static void main(String args[]){
        System.out.println("---------------------------");
        Scanner input = new Scanner(System.in);
        float fxp;
        fxp = input.nextFloat();

        System.out.println("Please Enter the fixed salary of employee");
salaried_employees fixed=new salaried_employees(fxp);
        fixed.display();
             
        System.out.println("Please Enter the salary of hourly employee");

        float hxp;
         hxp=input.nextFloat();

        houremployee hour=new houremployee(2000);
        System.out.println("Please enter the hour of the employee");
        int hrs;
        hrs=input.nextInt();
        hour.get(hrs);
        hour.calsalary();
        System.out.println("Please enter the salary of the basic employee");
         float bxp;
         bxp=input.nextFloat();
        basicmployee basic=new basicmployee(bxp);
        
        basic.get(200);
        basic.calsalary();
        currentemployee current=new currentemployee(4000);
        current.calsalary();
    }
}
