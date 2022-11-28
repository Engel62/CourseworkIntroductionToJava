public class EmployeeAction {
    public double sum(Employee[] employee) {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
        }
      return sum;
    }

    public void printSum(Employee[] employee) {
        System.out.println("Сумму затрат на зарплаты " + sum(employee));
    }
    }

