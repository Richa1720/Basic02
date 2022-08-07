package object_and_class;

public class Student {

    String name="Sanjana";
    String branch="Computer Science";
    int year= 1;
    double fee=70000.00;

    public static void main(String[] args) {

        Student obj1=new Student();
        System.out.println("Student Name : "+obj1.name);
        System.out.println("Student branch : "+obj1.branch);
        System.out.println("Student year : "+obj1.year);
        System.out.println("Student fee : "+obj1.fee);

        System.out.println();

        Student obj2=new Student();
        System.out.println("Student Name : "+obj2.name);
        System.out.println("Student branch : "+obj2.branch);
        System.out.println("Student year : "+obj2.year);
        System.out.println("Student fee : "+obj2.fee);



    }

}
