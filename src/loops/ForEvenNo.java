package loops;

public class ForEvenNo {
    public static void main(String[] args) {
        System.out.println("Even numbers are : ");
        for(int a=1;a<=50;a++)
        {

            if(a%2!=1)
            {

                System.out.print(a+"\t");
            }
            else
            {
                System.out.println(a);
            }

        }
    }
}
