//CREATE A METHOD WHICH MAKES CUBE OF NUMBER A*A*A

package method_calculator;


import sun.awt.image.BufferedImageDevice;

import java.awt.image.ImagingOpException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CubeMethod {

    public void cube()throws IOException
    {
        InputStreamReader richa= new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(richa);
        System.out.println("Enter any number : ");
        int a=Integer.parseInt(br.readLine());
        System.out.println("Cube of a is : "+(a*a*a));
    }

    public static void main(String[] args) throws IOException
    {

        CubeMethod obj1 = new CubeMethod();
        obj1.cube();

    }

}
