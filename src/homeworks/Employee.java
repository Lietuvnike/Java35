package homeworks;

public class Employee extends Member {

    private String specialization;

    public Employee(String name, int age, String phoneNumber, String address, int salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    public void printSalary() {
        System.out.println("Salary for " + name + " is " + salary + ".");
    }
}

