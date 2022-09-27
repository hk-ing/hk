package chapter10.abstract_;

abstract public class Employee {
    private String name;
    private String ID;
    private double salary;

    public Employee(String name, String ID, double salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }
    public abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class Manager extends Employee{
    private double bonus;

    public Manager(String name, String ID, double salary, double bonus) {
        super(name, ID, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理"+getName()+"工作中");
    }
}
class CommonEmployer extends Employee{
    public CommonEmployer(String name, String ID, double salary) {
        super(name, ID, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工"+getName()+"工作中");
    }
}
