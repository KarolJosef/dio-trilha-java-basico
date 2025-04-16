package rh;
public sealed abstract class Employee permits Manager, Salesman {

    protected String code;
    protected String name;
    protected int age;
    protected double salary;

    public Employee(int age,
                    String code,
                    String name,
                    double salary) {
        this.age = age;
        this.code = code;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }
    
    

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public abstract double  getfullSalary();
    
}
