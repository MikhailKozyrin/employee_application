public class Main {

    static Employee[] employees = new Employee[10];

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double calculateSalarySum() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee getMinSalary() {
        double minSalary = -1;
        Employee minSalaryEmpl = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                minSalary = employees[i].getSalary();
                minSalaryEmpl = employees[i];
                index = i;
                break;
            }
        }
        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null) {
                if (minSalary > employees[i].getSalary()) {
                    minSalary = employees[i].getSalary();
                    minSalaryEmpl = employees[i];

                }
            }
        }
        return minSalaryEmpl;
    }

    public static Employee getMaxSalary() {
        double maxSalary = -1;
        Employee maxSalaryEmpl = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                maxSalary = employees[i].getSalary();
                maxSalaryEmpl = employees[i];
                index = i;
                break;
            }
        }
        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null) {
                if (maxSalary < employees[i].getSalary()) {
                    maxSalary = employees[i].getSalary();
                    maxSalaryEmpl = employees[i];

                }
            }
        }
        return maxSalaryEmpl;
    }

    public static double averageSalary() {
        if (employees.length != 0) {
            return calculateSalarySum()/employees.length;
        } else {
            return 0;
        }

    }

    public static void printFullName() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public static double salaryIndexing() {
        int procent = 10;
        double multipier = procent / (100 * 1.0);


        return multipier;
    }



    public static void main(String[] args) {

        employees[0] = new Employee("Козырин Михаил Андреевич", 1, 158300);
        employees[1] = new Employee("Тюфяков Никита Вячеславович", 1, 189000);
        employees[2] = new Employee("Абрамов Дмитрий Олегович", 2, 69800);
        employees[3] = new Employee("Анохина Любовь Руслановна", 3, 154000);
        employees[4] = new Employee("Маринцева Анастасия Олеговна", 5, 122300);
        employees[5] = new Employee("Бахарева Диана Вячеславовна", 4, 105450);
        employees[6] = new Employee("Архипов Никита Дмитриевич", 3, 99780);
        employees[7] = new Employee("Курляк Ксения Витальевна", 2, 70500);
        employees[8] = new Employee("Ким Юлия Андреевна", 4, 126450);
        employees[9] = new Employee("Рохин Рамин Раминович", 5, 133450);

        printEmployees();
        System.out.println();
        System.out.println("Сумма затрат на зарплаты в месяц: " + calculateSalarySum());
        System.out.println("Минимальная зарпата. " + getMinSalary());
        System.out.println("Максимальная зарпата. " + getMaxSalary());
        System.out.println("Средняя зарплата у сотрудников: " + averageSalary());
        System.out.println();
        System.out.println("Список Ф.И.О сотрудников:");
        printFullName();

    }

}


