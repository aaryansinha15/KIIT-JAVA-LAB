import java.util.Scanner;

public class array_2d {

    public static void main(String [] args)
    {
        System.out.println("Please Enter the size of row and column respectively");
        int row,column;
        Scanner input= new Scanner(System.in);
        
        row= input.nextInt();
        column=input.nextInt();
         System.out.println("Please enter the elements inside the 2_d array");
        int array_2d[][]=new int[row][column];;
        // 3 is for rows and 4 is for columns
      for(int i=0; i<row; i++)
      {
          for(int j=0; j<column; j++)
          {
              array_2d[i][j]=input.nextInt();
          }
      }
      System.out.println("-----------");
      System.out.println("Output");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(array_2d[i][j] +" ");
            }
            System.out.println();
       
        }

    }
    
}
