//WAP to print multiple conditions in if by using logical AND operator

package conditional_statement;

public class MultipleConditionIf {

    public static void main(String[] args) {

        String brand = "Asus";
        int ram = 8;
        //                 TRUE & TRUE= TRUE (1X1=1)
        if(brand == "Asus" && ram == 8) {
            System.out.println("Good Configuration");
        } else {
            System.out.println("Bad Configuration");
        }

        //				   TRUE & FALSE=FALSE(1X0=0)

        if(brand == "Asus" && ram == 4) {
            System.out.println("Good Configuration");
        } else {
            System.out.println("bad configuration");
        }
        //                 	 FALSE& TRUE =FALSE(0X1=0)

        if(brand == "hp" && ram == 8)
        {
            System.out.println("Good Configuration");
        } else
        {
            System.out.println("bad configuration");
        }
        //                    FALSE&FALSE= FALSE(0X0=0)
        if(brand == "Dell" && ram == 4)
        {
            System.out.println("Good Configuration");
        } else
        {
            System.out.println("bad configuration");
        }


        }

    }