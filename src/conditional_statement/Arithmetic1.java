package conditional_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arithmetic1 {

    public static void main(String[] args)throws IOException {

        InputStreamReader raj =new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(raj);
        System.out.println("Enter the value of a : ");
        int a=Integer.parseInt(br.readLine());
        System.out.println("Enter the value of b : ");
        int b=Integer.parseInt(br.readLine());

        int sum=a+b;
        System.out.println("Addition of a and b : "+sum);
        int sub=a-b;
        System.out.println("Subtraction of a and b : "+sub);
        int mul=a*b;
        System.out.println("Multiplication of a and b : "+mul);
        int div=a/b;
        System.out.println("Division of a and b : "+div);
        int mod=a%b;
        System.out.println("Modulus of a and b : "+mod);


    }
}
