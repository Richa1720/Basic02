//1- String array : Names
//   for , whil e, advance

package array_and_advance_forloop;

public class Array01 {
    public static void main(String[] args) {

        //To do datatype varName [] = {value1,value2,........value N};

        String name[]={"Hrithik","Richard","V","Elon","Aditya","Siddharth","yang"};

                for(int a=0; a<name.length; a++)
                {
                  if(a==2)
                    {
                         break;
                    }

                    //To do varName[Index]

                    System.out.println(name[a]);
                }

                System.out.println("\n");

                //While loop Starts

                int a=0;
                while(a<name.length)
                {
                    System.out.println("printing names with while loop : "+name[a]);
                    a++;
                }

                System.out.println("\n");

                //Advanced for loop
                // TO DO  for(datatype varName : ArrayName) { code }

                for(String var:name)
                {
                    System.out.println("Advanced for loop : "+var);
                }
    }
}
