//Write a program to print All number  between 1 to 10 except 3 and 9.

package break_continue_debug;

public class BreakContinueDebug {

    public static void main(String[] args) {

       for(int a=1;a<=10;a++)
       {
           System.out.println("For loop is running "+a);
           if(a==5)
           {
               break;
           }

       }

       for(int b=1;b<=5;b++)
       {

           if(b==4)
           {
               continue;
           }
           System.out.println("For loop is running ....."+b);
       }

    }
}
