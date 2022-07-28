
//Write a Program to check Age and city  of Voter : age should be greater than 18 and if city is in (DELHI , MUMBAI, CHENNAI, BANGALORE) then print Metro City

package conditional_statement;

public class NestIfElse {
    public static void main(String[] args) {
        int age;
        String city;

        age=18;
        city="Mumbai";

        if (age>=18)
        {
            if(city=="Delhi" || city=="Mumbai" || city=="Chennai" || city=="Banglore")
            {
                System.out.println("Voter is eligible for voting in metro city");
            }
            else
            {
                System.out.println("Voter is not eligible for voting in metro city");
            }

        }
        else
        {
            System.out.println("Not eligible for voting");
        }

    }
}

