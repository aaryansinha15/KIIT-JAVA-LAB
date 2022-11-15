import java.util.Scanner;

class rational{
    int num;
    int denum;
    rational(int r,int s){
        num=r;
        denum=s;
    }
    rational add(rational r11)
    {
        rational res=new rational(0,0);
        res.num=0;
        res.denum=0;
        res.num=(num*r11.denum)+(r11.denum*num);
        res.denum=denum*r11.denum;
        return res;
    }
    rational subtract(rational r11)
    {
        rational res =new rational(0,0);
        res.num=0;
        res.denum=0;
        res.num=(num*r11.denum)-(r11.denum*num);
        res.denum=denum*r11.denum;
        return res;
    }
    rational mul(rational r11)
    {
        rational res=new rational (0,0);
        res.num=num*r11.num;
        res.denum=denum*r11.denum;
        return res;
    }
    rational divide(rational r11)
    {
        rational res=new rational (0,0);
        res.num=num*r11.denum;
        res.denum=denum*r11.num;
        return res;
    }
    boolean check(rational r11)
    {
        if(num/denum==r11.num/r11.denum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void show()
    {
        System.out.println(num+"/"+denum);
    }
}


public class rationalDemo {
    public static void main(String [] args){
         int n1,n2,m1,m2;
         System.out.println("Input two values for r1 class");
         Scanner input=new Scanner(System.in);
         n1=input.nextInt();
         n2=input.nextInt();
         System.out.println("Input two values for r2 class");
         m1=input.nextInt();
         m2=input.nextInt();         
        rational r1=new rational(n1,n2);
        rational r2=new rational(m1,m2);
        rational Add_res;
        Add_res=r1.add(r2);
        // value return
        rational Sub_res;
        Sub_res =r1.subtract(r2);
        // value return
        rational mul_res;
        mul_res=r1.mul(r2);
        //
        rational div_res;
        div_res=r1.divide(r2);

        System.out.println("The value of r1: "+r1.num+"/"+r1.denum);
        System.out.println("The value of r2: "+r2.num+"/"+r2.denum);
        if(Add_res.num==0){
            System.out.println("The sum of r1 and r2: 0");    
        }
        else{
            System.out.println("The sum of r1 and r2: "+Add_res.num+"/"+Add_res.denum);
        }

        if(Sub_res.num==0){
            System.out.println("The difference of r1 and r2: 0");    
        }
        else{
            System.out.println("The difference of r1 and r2: "+Sub_res.num+"/"+Sub_res.denum);
        }

        if(mul_res.num==0){
            System.out.println("The product of r1 and r2: 0");    
        }
        else{
            System.out.println("The product of r1 and r2: "+mul_res.num+"/"+mul_res.denum);
        }
        if(div_res.num==0){
            System.out.println("The division of r1 and r2: 0");    
        }
        else if(div_res.num==div_res.denum){
            System.out.println("The division of r1 and r2: 1");
        }
        else{
            System.out.println("The division of r1 and r2: "+div_res.num+"/"+div_res.denum);
        }
        


    }    
}
