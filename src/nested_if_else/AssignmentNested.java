//Write a Program to check marks and section of student : marks shoulbe greater than 33 and section should be in (ART, SCIENCE) and print passed with marks and section
//marks>60 first division with Science
//marks>45> second
//marks>33 third

package nested_if_else;

public class AssignmentNested {
    public static void main(String[] args) {

     int marks=45;
     String sec="Art";
     if(marks>60)
     {
         System.out.println("First division with science");
     }
     else if(marks>45)
     {
         System.out.println("Second division");
     }
     else if(marks>33)
     {
         System.out.println("Third");
     }
    }
}
