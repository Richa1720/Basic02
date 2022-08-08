//write a Program to print table of 3 but do not print 27

package break_continue_debug;

public class PrintNo02 {
    public static void main(String[] args) {


        for(int a=3;a<=30;a=a+3)
        {
            if(a==27)
            {
                System.out.println("continue activated");
                continue;
            }
            System.out.println(a);
        }
    }

}
