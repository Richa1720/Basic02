package method_program;

public class EngineerMethod {



    public void studyMethod()
    {
        System.out.println("****Study Method****");
    }
    public void repairMethod()
    {
        System.out.println("****Repair Method****");
    }
    public void developMethod()
    {
        System.out.println("****Develop Method****");
    }

    public static void main(String[] args) {

        EngineerMethod object=new EngineerMethod();
        object.studyMethod();
        object.repairMethod();
        object.developMethod();
    }
}
