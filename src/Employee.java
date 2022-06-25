public class Employee {

    private final String fullName;
    private int department;
    private int salary;
    private final int id;
    private static int counterId;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counterId++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Ф.И.О. " + fullName +
                ", Номер отдела " + department +
                ", Зарплата сотрудника " + salary +
                ", Идентификационный номер #" + id;
    }
}