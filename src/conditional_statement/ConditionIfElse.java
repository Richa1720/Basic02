package conditional_statement;

public class ConditionIfElse {
    public static void main(String[] args) {

        int age=18;
        //To do IF(CONDITION){code} Else{code}
        if(age>=18)
        {
            System.out.println("Eligible for voting");
        }
        else//(age<18)
        {
            System.out.println("Not eligible for voting");
        }

        String city="Agra";
        if(city=="Agra")
        {
            System.out.println("Person belongs to Agra");
        }
        else//(city!="Agra")
        {
            System.out.println("Person does not belongs to Agra");
        }
    }
}
