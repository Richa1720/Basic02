package method_with_input_parameter;

public class MethodWithReturnType {

    public int add(int a,int b)
    {
        int result=a+b;
        return result;
    }
    public int sub(int a, int b)
    {
        int result=a-b;
        return result;
    }
    public int mul(int a, int b)
    {
        int result=a*b;
        return result;
    }
    public double div(int a,int b)
    {
        double result=(double)a/b;
        return result;
    }
    public int mod(int a, int b)
    {
        int result=a%b;
        return result;
    }

    public static void main(String[] args) {

        MethodWithReturnType richu=new MethodWithReturnType();
        int result=richu.add(4,6);
        System.out.println("Addition : "+result);
        int output=richu.sub(10,6);
        System.out.println("Subtraction : "+output);
        int final1=richu.mul(5,5);
        System.out.println("Multiplication : "+final1);
        double end=richu.div(40,3);
        System.out.println("Division : "+end);

       // int raj=richu.mod(64,8);
        //System.out.println("Modulus : "+raj);
        //int raj=;
        System.out.println("Modulus : "+richu.mod(64,8));
    }

}
