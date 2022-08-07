package loops;

public class ForPrime1 {
    public static void main(String[] args) {

        int num=15;
        boolean flag=false;
        for(int a=2;a<num;a++)
        {
            if (num % a == 0) {
                flag = true;
                break;
            }
        }

            if(!flag)
            {
                System.out.println("Prime NUmber");
            }
            else
            {
                System.out.println("Not a Prime Number");
            }

    }
}
