public class Employee {
    private final String name;
    private final String surname;
    private final String patronymic;
    private int department;
    private int salary;
    private static int counter = 0;
    private int id;

    public Employee(String name, String surname, String patronymic, int department, int salary) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        counter++;
        id = counter;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public int getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return id + " " + surname + " " + name + " " + patronymic + " " + department + " " + salary ;
    }
    public int getId() {
        return id;
    }

}
