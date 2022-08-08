//Write a Program to print even number and if number increased to 20 then exit from loop (1 to 50)

package break_continue_debug;

public class PrintNo01
{
    public static void main(String[] args)
    {

        for(int a=1;a<=50;a++)
        {
            if(a%2==0)
            {
                System.out.println(a);
            }
            if(a>20)
            {
                System.out.println("My break statement activated");
                break;
            }
        }


    }
}
