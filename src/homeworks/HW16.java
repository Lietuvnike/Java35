package homeworks;

public class HW16 {
    public static void main(String[] args) {
        Employee employee = new Employee("Bob", 45, "+3706856958", "Dtreet", 1000, "Worker");
        Manager manager = new Manager("Nick", 45, "+23423423", "Street", 2000, "Sales");

        employee.printSalary();
        manager.printSalary();
    }
}
