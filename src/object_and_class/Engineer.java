package object_and_class;

public class Engineer {

    String branch="Computer Science";
    String lang="JAVA";
    int year=4;
    double salary=70000.0;

    public static void main(String[] args) {

        //TO DO ClassName ObjName = new ClassName();     Object Creation
         Engineer varshu =new Engineer();

        System.out.println("Branch : "+varshu.branch);
        System.out.println("language : "+varshu.lang);
        System.out.println("Year : "+varshu.year);
        System.out.println("Salary : "+varshu.salary);
        System.out.println();

        Engineer richu = new Engineer();

        System.out.println("Branch : "+richu.branch);
        System.out.println("language : "+richu.lang);
        System.out.println("Year : "+richu.year);
        System.out.println("Salary : "+richu.salary);






    }

}
