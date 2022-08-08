package conditional_statement;

public class NotLogicalOperator {
    public static void main(String[] args) {

        int marks=14;

       /* //!(TRUE)= FALSE
        if(marks>=33)
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("Fail");
        }*/

        if(!(marks>=33))
        {
            System.out.println("PASS");
        }
        if(!(marks<33))
        {
            System.out.println("FAIL");
        }
    }
}
