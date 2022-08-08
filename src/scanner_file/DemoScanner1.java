package scanner_file;
import java.util.Scanner;



public class DemoScanner1 {

    public static void main(String[] args) {

        //Step 1 create object of Scanner class

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name=obj.nextLine();  //It read String input
        System.out.println("Your name is : "+name);

        System.out.print("Enter your age is : ");
        int age=obj.nextInt();   //It reads integer input
        System.out.println("Age is : "+age);

        System.out.print("Enter the price : ");
        double price=obj.nextDouble();  //it reads double input
        System.out.println("Price is : "+price);





    }
}
