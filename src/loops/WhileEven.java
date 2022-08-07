package loops;

public class WhileEven {
    public static void main(String[] args) {

        System.out.println("Even numbers are : ");

        int a=1;

        while(a<=50)
        {

            if(a%2!=1)
            {
                System.out.print(a+"\t");

            } a++;
        }
    }
}
