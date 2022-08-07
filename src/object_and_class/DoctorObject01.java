package object_and_class;

public class DoctorObject01 {

        String stream="Eyes";
        int charge=600;
        double income=200000.50;

    public static void main(String[] args) {

         //TO DO ClassName ObjName = new ClassName();     Object Creation

        DoctorObject01 obj1 =new DoctorObject01();


        System.out.println("Doctor speciality : "+obj1.stream);
        System.out.println("Doctor charges : "+obj1.charge);
        System.out.println("Doctor income : "+obj1.income);

    }



}
