//3- CREATE A METHOD TO PRINT PRIME NUMBER(1 TO 100)

package method_calculator;

public class PrimeMethod01 {

    public void primemethod()
    {
        for(int n=1;n<=100;n++)
        {
            int temp=0;
            for(int a=1;a<=n;a++)
            {
                if(n%a==0)
                {
                    temp++;
                }
            }//inner loop
            if(temp==2)
            {
                System.out.print(n+"\t");
            }

        }
    }//method closed

    public static void main(String[] args) {

        PrimeMethod01 obj1=new PrimeMethod01();
        obj1.primemethod();

    }


}
