//Write a program to check given number is prime or not

package Nestedifelse;

public class PrimeNestedIf {
    public static void main(String[] args) {

     int num=10,a;
     int temp=0;
     for(a=1;a<=num;a++)
     {
         if(num%a==0)
         {
             temp++;
         }
     }//for closed
        if(temp==2)
        {
            System.out.println("PRIME NUMBER");
        }
        else
        {
            System.out.println("NON-PRIME NUMBER");
        }
    }
}
