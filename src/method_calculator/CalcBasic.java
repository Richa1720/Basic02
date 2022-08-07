package method_calculator;

public class CalcBasic {

    public void sub()
    {
        int a=40;
        int b=25;
        int result=a-b;
        System.out.println("Subtraction is : "+result);

    }
    public void divide()
    {
        int a=40;
        int b=10;
        double result=(double)a/b;
        System.out.println("Division : "+result);
    }

    public static void main(String[] args) {

        CalcBasic obj1=new CalcBasic();
        obj1.sub();
        obj1.divide();
    }

}
