public class Employee {
    private String fullName;
    private final int  id;
    private int departmentNumber;
    private double salary;
    private static int counter;

    public Employee(String fullName, int departmentNumber, double salary) {
        this.fullName = fullName;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
        id = ++counter;
    }

    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public int getSalary() {
        return (int) salary;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник: "  + fullName  + ", id сотрудника = " + id + ", Отдел №: " + departmentNumber + ", зарплата в месяц: " + salary;
    }
}
