package loops;

public class ForOddNo {
    public static void main(String[] args) {

        System.out.println("Odd number list is : ");
        for(int a=50;a<=100;a++)
        {
            if(a%2==1)
            {
                System.out.print(a+"\t");
            }
        }
    }
}
