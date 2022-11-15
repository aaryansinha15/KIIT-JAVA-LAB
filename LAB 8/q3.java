import java.util.Scanner;

class StackFullException extends Exception{
    StackFullException() {
        super();
    }
    public String toString(){
        return "Stack is full";
    }
}
class StackEmptyException extends Exception{
    StackEmptyException() {
        super();
    }
    public String toString(){
        return "Stack is Empty";
    }
}
class Stack{
    int stackSize,top=-1;
    int[] arr;
    Stack(int stackSize){
        this.stackSize=stackSize;
        arr = new int[stackSize];
    }
     
    public void push(int element) throws StackFullException {
        if(top>=stackSize-1)
            throw new StackFullException();
        else
            arr[++top] = element;
    }
    public int pop() throws StackEmptyException{
        if(top==-1)
            throw new StackEmptyException();
        else
            return arr[top--];
    }
}
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = sc.nextInt();
        Stack S = new Stack(size);

        boolean flag=true; 

        System.out.println("\nPress 1 to push()");
            System.out.println("Press 2 to Pop()");
            System.out.println("Press 3 to Exit");

        while(flag){
            System.out.print("\nEnter your chocie: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to push into the stack: ");
                    int num = sc.nextInt(); 
                    try{
                        S.push(num);
                    }
                    catch(StackFullException e){
                        System.out.println("Exception Occured: "+e);
                    }  
                break;
                case 2:
                    try{
                        System.out.println(S.pop()+" has been poped out from the stack");
                    }
                    catch(StackEmptyException e){
                        System.out.println("Exception Occured: "+e);
                    }
                    break;
                case 3:
                    System.out.println("Exiting...\n");
                    flag=false;
                break;
                default:
                    System.out.println("Wrong Chocie!! Please Enter again\n");
            }
        }
        sc.close();
    }
}