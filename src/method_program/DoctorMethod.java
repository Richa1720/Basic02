package method_program;

public class DoctorMethod {
    String name;
    String dept;
    String spec;

    public void checkupMethod()
    {
        System.out.println("****Checkup Method****");
    }
    public void eatMethod()
    {
        System.out.println("****Eat Method****");
    }
    public void visitMethod()
    {
        System.out.println("****Visit Method****");
    }

    public static void main(String[] args) {

        DoctorMethod obj1=new DoctorMethod();
        obj1.checkupMethod();
        obj1.eatMethod();
        obj1.visitMethod();


    }

    
}
