package conditional_statement;

public class OrOperator01 {
    public static void main(String[] args) {

        String name="Ram";
        String city="Jaipur";

        //  TRUE||TRUE= TRUE (1+1=1)
        if(name=="Ram" || city=="jaipur")
        {
            System.out.println("Correct Information");
        }
        else
        {
            System.out.println("Incorrect Information");
        }
        //  TRUE||FALSE=TRUE (1+0=1)

        if(name=="Ram" || city=="Patna")
        {
            System.out.println("Correct Information ");
        }
        else
        {
            System.out.println("Incorrect Information");
        }
        //  FASLE||TRUE=TRUE (0+1=1)
        if(name=="Rajat" || city=="Jaipur")
        {
            System.out.println("Coorect Information");
        }
        else
        {
            System.out.println("Incorrect Information");
        }
        //  FALSE|| FALSE= FALSE(0+0=0)
        if(name=="Raj" || city=="Banglore")
        {
            System.out.println("Coreeect Information");
        }
        else
        {
            System.out.println("Incorrect Information");
        }





    }
}
