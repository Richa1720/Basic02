package loops;

public class DoWhileOdd {
    public static void main(String[] args) {

        System.out.println("Odd Numbers are : ");
        int a=50;
        do{
            if(a%2==1)
            {
                System.out.print(a+"\t");
            }a++;
        }while(a<=100);
    }
}
