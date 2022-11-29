import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee [0] = new Employee("Иван", "Иванов", "Иванович",1,20500);
        employee [1] = new Employee("Александр", "Васечкин", "Васильевич",1,23500);
        employee [2] = new Employee("Петр", "Петров", "Алексеевич",2,24500);
        employee [3] = new Employee("Мария", "Петрова", "Андреевна",2,26560);
        employee [4] = new Employee("Екатерина", "Иванова", "Ивановна",3,27530);
        employee [5] = new Employee("Евгений", "Хром", "Петрович",3,19800);
        employee [6] = new Employee("Стаислав", "Егин", "Евгеньевич",4,29554);
        employee [7] = new Employee("Артем", "Сидоров", "Сергеевич",4,30500);
        employee [8] = new Employee("Игорь", "Андреев", "Петрович",5,15000);
        employee [9] = new Employee("Владислав", "Терешин", "Александрович",5,65300);

        EmployeeAction.printAllEmployees(employee);
        EmployeeAction.printSum(employee);
        EmployeeAction.maxSalary(employee);
        EmployeeAction.minSalary(employee);
        EmployeeAction.printAverageSalary(employee);
        EmployeeAction.printNameSurnamePatronymic(employee);

    }
}