package array_and_advance_forloop;

public class ArrayMarks02 {
    public static void main(String[] args) {

        //To do datatype varName [] = {value1,value2,........value N};

        int marks[]={50,70,80,60,80,75,65,76,67,56,90};

        //For loop

        for(int a=0; a<marks.length; a++)
        {
            System.out.println("Printing marks with for loop : "+marks[a]);
        }

        System.out.println();

        //while loop

        int a=0;
        while(a<marks.length)
        {
            System.out.println("printing marks with while loop : "+marks[a]);
            a++;
        }

        System.out.println();

        //Advanced for loop
        // TO DO  for(datatype varName : ArrayName) { code }

        for(int var:marks)
        {
            System.out.println("Advanced for loop activated : "+var);
        }


    }
}
