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
        int elementCount =0;
        for (Employee value : employee) {
            if (value.getSalary() > maxSalary) {
                maxSalary = value.getSalary();
                if (value != null) {
                    elementCount ++;
                }
            }
        }
        System.out.println("Максимальная зарплата " + maxSalary);
    }
    public static void minSalary(Employee[] employee) {
        double minSalary = employee[0].getSalary();
        int elementCount =0;
        for (Employee value : employee) {
            if (value.getSalary() < minSalary) {
                minSalary = value.getSalary();
                if (value != null) {
                    elementCount ++;
                }
            }
        }
        System.out.println("Минимальная зарплата  " + minSalary);
    }
    public static double averageSalary(Employee[] employee) {
        int elementCount =0;
        for (Employee value : employee) {
            if (value != null) {
                elementCount++;
            }
        }
        return  EmployeeAction.sum(employee) / elementCount;
    }
    public static void printAverageSalary(Employee[] employee) {
        System.out.println("Cредняя зарплата " + averageSalary(employee));
    }
    public static void printNameSurnamePatronymic(Employee[]employee) {
        for (Employee value : employee) {
            System.out.println(value.getSurname() + " " + value.getName() + " " + value.getPatronymic());
        }

    }
}






