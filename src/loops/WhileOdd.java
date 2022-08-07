package loops;

public class WhileOdd {
    public static void main(String[] args) {

        System.out.println("Odd Numbers are : ");

        int a=50;
        while(a<=100)
        {
            if(a%2==1)
            {
                System.out.print(a+"\t");
            }
            a++;
        }
    }
}
