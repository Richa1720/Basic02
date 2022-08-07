package loops;

public class DoWhileTable {
    public static void main(String[] args) {

       // do{
//code to be executed / loop body
//update statement
        //}while (condition);

         int num=10,result;
         int a=1;
         do{
             result=num*a;
             System.out.println("Table of ten is : "+num +"*" +a +"=" +result);
             a++;
         }
         while(a<=10);

    }
}
