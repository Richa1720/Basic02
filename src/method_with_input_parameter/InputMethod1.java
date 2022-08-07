//WAP to take input parameters in method

package method_with_input_parameter;

public class InputMethod1 {

    public void square(int a)
    {
        int result=a*a;
        System.out.println("Square of number : "+result);
    }
    public void cube(int a)
    {
        System.out.println("Cube of number : "+(a*a*a));
    }
    public void prime(int num)
    {
        int temp=0;
        for(int a=1;a<=num;a++) {
            if (num % a == 0) {
                temp++;
            }

        }
            if(temp==2)
            {
                System.out.println("Prime Number");
            }
            else
            {
                System.out.println("Non-Prime Number");
            }



    }
    public void evenOdd(int num)
    {
        if(num%2==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }

    public static void main(String[] args) {

        InputMethod1 obj1=new InputMethod1();
        obj1.square(5);
        obj1.cube(5);
        obj1.prime(7);
        obj1.evenOdd(8);

    }
}
