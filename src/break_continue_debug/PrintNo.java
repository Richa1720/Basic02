//Write a program to print All number  between 1 to 10 except 3 and 9.


package break_continue_debug;

public class PrintNo {
    public static void main(String[] args) {

       for(int a=1;a<=10;a++)
       {

           if(a==3 || a==9)
           {

               continue;
           }

           System.out.println(a);
       }

    }
}
