public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Sergey", "Ivanov", "Petrovich", 1, 30000);
        employees[1] = new Employee("Oleg", "Ivanovich", "Semenov", 4, 35000);
        employees[2] = new Employee("Alexander", "Petrov", "Mikhailovich", 2, 46000);
        employees[3] = new Employee("Roman", "Samsonov", "Ivanovich", 3, 37000);
        employees[4] = new Employee("Igor", "Romanov", "Sergeevich", 5, 40000);
        employees[5] = new Employee("Semyon", "Tum", "Yurievich", 1, 44000);
        employees[6] = new Employee("Artem", "Sergeev", "Stanislavovich", 3, 44000);
        employees[7] = new Employee("Petr", "Romanov", "Vasilievich", 5, 42000);
        employees[8] = new Employee("Sergey", "Savelyev", "Olegovich", 4, 33000);
        employees[9] = new Employee("Maxim", "Badulen", "Dmitrievich", 2, 49000);

    }
    private static void printEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    private static int salariesSum() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
    private static Employee minSalary() {
        int min = employees[0].getSalary();
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                index = i;
            }
        }
        return employees[index];
    }
    private static Employee maxSalary() {
        int max = employees[0].getSalary();
        int index = 0;
        for (int i = 0; i > employees.length; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                index = i;
            }
        }
        return employees[index];
    }
    public double averageSalary() {
        double average = (double) salariesSum() / employees.length;
        return average;
    }
    public static void print() {
        for (Employee employee : employees) {
            System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getSurName());
        }
    }
}
