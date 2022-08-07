package parameterized_constructor;

public class DoctConstructor {
    String name;
    int expe;
    double salary;

    public DoctConstructor(String name, int expe, double salary) {
        this.name = name;
        this.expe = expe;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExpe() {
        return expe;
    }

    public void setExpe(int expe) {
        this.expe = expe;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {

        DoctConstructor obj1=new DoctConstructor("Ram",7,350000.50);
        System.out.println("Name : "+obj1.name +"\nExperience : "+obj1.expe+ " \nSalary : "+obj1.salary);
        obj1.setName("Shri Ram");
        System.out.println("First Doctor name : "+obj1.getName());
        System.out.println();

        DoctConstructor obj2=new DoctConstructor("Shiva",5,550000.0);
        System.out.println("Name : "+obj2.name+ "\nExperience : "+obj2.expe+ " \nSalary : "+obj2.salary);
        obj2.setExpe(8);
        System.out.println("Second Doctor experience : "+obj2.getExpe());
        System.out.println();

        DoctConstructor obj3=new DoctConstructor("Vishnu",10,650000.50);
        System.out.println("Name : "+obj3.name +"\nExperience : " +obj3.expe+ "\nSalary : "+obj3.salary);
        obj3.setSalary(750000.00);
        System.out.println("Third Doctor Salary : "+obj3.getSalary());



    }

}
