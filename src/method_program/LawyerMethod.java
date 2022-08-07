package method_program;

public class LawyerMethod {

    public void hearingMethod()
    {
        System.out.println("****Hearing Method****");
    }
    public void agreementMethod()
    {
        System.out.println("****Agreement Method****");
    }
    public void caseMethod()
    {
        System.out.println("****Case Method****");
    }
    public static void main(String[] args) {

        LawyerMethod object=new LawyerMethod();
        object.hearingMethod();
        object.agreementMethod();
        object.caseMethod();
    }
}
