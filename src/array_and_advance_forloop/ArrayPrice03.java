package array_and_advance_forloop;

public class ArrayPrice03 {
    public static void main(String[] args) {

        //To do datatype varName [] = {value1,value2,........value N};

        double price[]={55000.00,60000.89,40000.55,75000,33000.50,90000.50};//ye jo yellow aa rha...upr right side me...iski wjeh se aa rhe red....jiske bhi java class me ye yellow aayega uski wjeh se pura package red ho gya .....smjh agya????
        for(int a=0;a<price.length;a++)
        {
            System.out.println("Printing salary (for loop) : "+price[a]);
        }
        System.out.println();

        //while loop

        int a=0;
        while(a<price.length)
        {
            System.out.println("Printing salary (while loop) : "+price[a]);
            a++;
        }

        System.out.println();

        //Advanced for loop
        // TO DO  for(datatype varName : ArrayName) { code }

        for(double var:price)
        {
            System.out.println("Advanced for loop activated : "+var);
        }


    }
}
