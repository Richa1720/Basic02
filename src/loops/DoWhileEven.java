package loops;

public class DoWhileEven {
    public static void main(String[] args) {

        System.out.println("Even Numbers are : ");
        int a=1;
        do{
            if(a%2!=1) {

                System.out.print(a + "\t");

            }a++;
        }
        while(a<=50);

        System.out.println();


        System.out.println("Reverse even numbers are : ");
        int b=50;
        do{
            if(a%2!=1)
            {
                System.out.print(a+"\t");
            }a--;

        }while(a>=1);
    }
}
