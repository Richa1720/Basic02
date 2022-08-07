package parameterized_constructor;

public class EngineerConst {
    String name;
    String dept;
    double salary;

    public EngineerConst(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {

        EngineerConst obj1=new EngineerConst("Nicole","Electrical",1500000.0);
        System.out.println("Name : "+obj1.name+"\nDepartment : "+obj1.dept+"\nSalary : "+obj1.salary);
        obj1.setDept("Computer Science");
        System.out.println("updated department is : "+obj1.getDept());
        System.out.println();

        EngineerConst obj2=new EngineerConst("Linda","Electronic",1700000.0);
        System.out.println("Name : "+obj2.name+"\nDepartment : "+obj2.dept+"\nSalary : "+obj2.salary);
        obj2.setSalary(2000000.00);
        System.out.println("Updated Salary : "+obj2.getSalary());
        System.out.println();

        EngineerConst obj3=new EngineerConst("Elle","Computer Science",1000000.00);
        System.out.println("Name : "+obj3.name+"\nDepartment : "+obj3.dept+"'\nSalary : "+obj3.salary);
        obj3.setName("Shaily");
        System.out.println("Updated Name : "+obj3.getName());

    }

}
