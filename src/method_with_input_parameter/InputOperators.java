package method_with_input_parameter;

public class InputOperators {


    public void add(int a,int b)
    {
        int result=a+b;
        System.out.println("Addition of two numbers is : "+result);
    }
    public void sub(int a,int b)
    {
        int result=a-b;
        System.out.println("Subtraction of two numbers is : "+result);
    }

    public void mul(int a,int b)
    {
        int result=a*b;
        System.out.println("Multiplication of two numbers is : "+result);
    }

    public void div(int a, int b)
    {
        int result=a/b;
        System.out.println("Division of two numbers is : "+result);
    }

    public static void main(String[] args) {

        InputOperators object=new InputOperators();

        object.add(10,35);
        object.sub(60,45);
        object.mul(20,5);
        object.div(69,3);
    }

}
