public class Employee {
    private final String name;
    private final int department;
    private final int salary;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }

}
