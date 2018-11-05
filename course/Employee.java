package eiden.persons;

public class Employee extends Person {
    protected int salary;

    public  Employee (int age, String name, int salary) {
        super(age, name);
        this.salary = salary;

    }
    public  Employee (int age, String name) {
        this(age, name, 0);

    }
    public int getSalary () {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < 1 || salary > 2147483646) {
            throw new IllegalArgumentException("Illegal salary setting: " + salary);
        }
        this.salary = salary;
    }


}
