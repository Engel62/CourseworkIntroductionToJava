public class EmployeeAction {
    public static double sum(Employee[] employee) {
        int sum = 0;
        for (Employee value : employee) {
            sum = sum + value.getSalary();
        }
        return sum;
    }
    public static void printSum(Employee[] employee) {
        System.out.println("Сумму затрат на зарплаты " + sum(employee));
    }
    public static void printAllEmployees(Employee[] employee) {
        for (Employee value : employee) {
            System.out.println(value);
        }
    }
    public static void maxSalary(Employee[] employee) {
        double maxSalary = 0;
        for (Employee value : employee) {
            if (value.getSalary() > maxSalary) {
                maxSalary = value.getSalary();
            }
        }
        System.out.println("Максимальная зарплата " + maxSalary);
    }
    public static void minSalary(Employee[] employee) {
        double minSalary = 100000;
        for (Employee value : employee)
            if (value.getSalary() < minSalary) {
                minSalary = value.getSalary();
            }
        System.out.println("Минимальная зарплата  " + minSalary);
    }
    public static double averageSalary(Employee[] employee) {
        double averageSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                averageSalary = EmployeeAction.sum(employee) / employee.length;
            }
        }
        return  averageSalary;
    }

    public static void printAverageSalary(Employee[] employee) {
        System.out.println("Cредняя зарплата " + averageSalary(employee));
    }
    public static void printNameSurnamePatronymic(Employee[]employee) {
    }
}






