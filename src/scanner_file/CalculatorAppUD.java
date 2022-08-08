package scanner_file;

import java.util.Scanner;


public class CalculatorAppUD {

    public int add(int a, int b)
    {
       int output=a+b;
       return output;
    }

    public int sub(int a ,int b)
    {
        int output=a-b;
        return output;
    }

    public int mul(int a,int b)
    {
        int output=a*b;
        return output;
    }

    public int div(int a,int b)
    {
        int output=a/b;
        return output;
    }

    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);

        CalculatorAppUD obj2 = new CalculatorAppUD();


       String flag="Y";
        while(flag.equals("Y"))
        {
            System.out.println("Enter your operation : 1-add , 2-sub, 3-mul and 4-div ....");
            int choice=obj.nextInt();

            System.out.println("Enter the value of a : ");
            int a= obj.nextInt();   //it reads integer  input
            System.out.println("Enter the value of b : ");
            int b=obj.nextInt();    //it reads integer input

            if(choice==1)
            {
                int result1 = obj2.add(a,b);
                System.out.println("Addition is : "+result1);
            }
            else if(choice==2)
            {
                int result2 = obj2.sub(a,b);
                System.out.println("Substraction is : "+result2);
            }
            else if(choice==3)
            {
                int result3 = obj2.mul(a,b);
                System.out.println("Multiplication is : "+result3);
            }
            else if(choice==4)
            {
                int result4 = obj2.div(a,b);
                System.out.println("Division is : "+result4);

            }

            System.out.println("Press Y to continue or press any button to exit from the calculator ");
            Scanner obj3=new Scanner(System.in);
            flag=obj3.nextLine();


          }
    }
}
