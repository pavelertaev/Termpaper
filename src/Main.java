public class Main {
    public static void main(String[] args) {
        //Курсовая работа Описание проекта
        //*Описание задачи:*
        //
        //Напишите программу, которая занимается учетом сотрудников и помогает кадрам и бухгалтерии автоматизировать процессы.
        //
        //С помощью вашей программы бухгалтерия и отдел кадров смогут узнавать следующую информацию:
        System.out.println("Курсовая");
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 26000, "отдел 1");
        employees[1] = new Employee("Иванов Степан Иванович", 28000, "отдел 2");
        employees[2] = new Employee("Петров Иван Иванович", 31000, "отдел 3");
        employees[3] = new Employee("Сергеев Иван Иванович", 35000, "отдел 4");
        employees[4] = new Employee("Иванова Анна Ивановна", 40000, "отдел 5");
        employees[5] = new Employee("Семенов Сергей Викторович", 34000, "отдел 5");
        employees[6] = new Employee("Андреев Павел Иванович", 32000, "отдел 4");
        employees[7] = new Employee("Сидорова Ирина Павловна", 31000, "отдел 2");
        employees[8] = new Employee("Зубова Елена Семеновна", 29000, "отдел 2");
        employees[9] = new Employee("Захаров Сергей Анатольевич", 38000, "отдел 1");


        printBookEmployees(employees);
        System.out.println("Общая сумма всех затрат на зарплаты " + getSumSalary(employees));
        System.out.println("Сотрудник с минимальной зарплатой "+ getMinSalaryEmployee(employees));
        System.out.println("Сотрудник с максимальной зарплатой " + getMaxSalaryEmployee(employees));
        System.out.println("Среднее значение зарплат "+ getAverageSalaryEmployee(employees));


    }

    public static void printBookEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }
    }

    public static double getSumSalary(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum += employees[i].getSalary();
            }
        }
        return sum;

    }

    public static Employee getMinSalaryEmployee(Employee[] employees) {
        double minSalary = Integer.MAX_VALUE;
        Employee target = null;
        for (Employee employee : employees) {
            if (employee != null)
                if (minSalary > employee.getSalary()) {
                    target = employee;
                    minSalary = employee.getSalary();
                }
        }
        return target;
    }

    public static Employee getMaxSalaryEmployee(Employee[] employees) {
        double maxSalary = Integer.MIN_VALUE;
        Employee target = employees[0];
        for (Employee employee : employees) {
            if (employee != null)
                if (maxSalary < employee.getSalary()) {
                    target = employee;
                    maxSalary = employee.getSalary();
                }
        }
        return target;
    }

    public static double getAverageSalaryEmployee(Employee[] employees) {
        int employeeAvarage = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                employeeAvarage++;
            }
        }
        return getSumSalary(employees) / employeeAvarage;
    }
}