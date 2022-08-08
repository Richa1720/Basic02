//To know the division of student on the basis of marks by using multiple if
package conditional_statement;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AssignmentIf1 {

    public static void main(String[] args)throws IOException {


        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the marks : ");
        int marks=Integer.parseInt(br.readLine());

        if(marks>70)
            System.out.println("First Division");

        if(marks>50 && marks<=70)
            System.out.println("Second Division");

        if(marks>40 && marks<=50)
            System.out.println("Third Division");
    }
}
