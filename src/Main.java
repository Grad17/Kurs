public class Main {
    private static final Employee[] EMPLOYEES = new  Employee[10];

    private static void typeAllEmployees() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }
    private static int countAllMonthSalary() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum += employee.getSalary();
        }
    return sum;
    }
    private static void countMinSalary() {
        Employee emp = EMPLOYEES[0];
        for (Employee employee : EMPLOYEES) {
            if (emp.getSalary() > employee.getSalary())
                emp = employee;
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + emp.getSalary() + " " + emp.getFullName() + " #" + emp.getId());
    }
    private static void countMaxSalary() {
        Employee emp = EMPLOYEES[0];
        for (Employee employee : EMPLOYEES) {
            if (emp.getSalary() < employee.getSalary())
                emp = employee;
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + emp.getSalary() + " " + emp.getFullName() + " #" + emp.getId());
    }

    private static void averageSalary() {
        double sum = countAllMonthSalary();
        double average = sum / EMPLOYEES.length;
        System.out.println("Средняя зарплата: " + average);
    }

    private static void countAllFullNameEmployees() {
        for (Employee employee : EMPLOYEES) {
            System.out.println("Сотрудники предприятия: " + employee.getFullName());
        }
    }

    private static void salaryIndexation(double percent) {

        double newSalary;
        for (Employee employee : EMPLOYEES) {
            newSalary = employee.getSalary() + (employee.getSalary() * percent / 100);
            System.out.println("Проиндексированная зарплата: " + newSalary);
        }
    }
    private static void typeMaxSalaryDep(int department) {
        Employee emp = EMPLOYEES[0];
        for (Employee employee : EMPLOYEES) {
            if (department == employee.getDepartment() && emp.getSalary() < employee.getSalary()) {
                emp = employee;
                System.out.println("Максимальная зарплата по отделу у сотрудника: " + employee.getFullName() + ", " + employee.getSalary());
            }
        }
    }
    private static void typeMinSalaryDep(int department) {
        Employee emp = EMPLOYEES[0];
        for (Employee employee : EMPLOYEES) {
            if (department == employee.getDepartment() && emp.getSalary() > employee.getSalary()) {
                emp = employee;
                System.out.println("Минимальная зарплата по отделу у сотрудника: " + employee.getFullName() + ", " + employee.getSalary());
            }
        }
    }
    private static void countAllMonthSalaryDep(int department) {
        String allSalDep = null;
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            if (department == employee.getDepartment()) {
                sum += employee.getSalary();
                allSalDep = "Сумма затрат на зарплату в месяц по отделу: " + sum;
            }
        }
        System.out.println(allSalDep);
    }
    private static void averageSalaryDep(int department) {
        double sum = 0;
        double iterationCount = 0;
        for (Employee employee : EMPLOYEES) {
            if (department == employee.getDepartment()) {
                sum += employee.getSalary();
                iterationCount ++;
            }
        }
        double average = sum / iterationCount;
        System.out.println("Средняя зарплата по отделу: " + average);
    }
    private static void salaryIndexDep(int department, int percent) {
        double newSalary;
        for (Employee employee : EMPLOYEES) {
            if (department == employee.getDepartment()) {
                newSalary = employee.getSalary() + (employee.getSalary() * percent / 100);
                System.out.println("Проиндексированная зарплата отдела: " + newSalary);
            }
        }
    }
    private static void countAllFullNameDep(int department) {
        for (Employee employee : EMPLOYEES) {
            if (department == employee.getDepartment()) {
                System.out.println("Сотрудники отдела: " + employee.getFullName() + ", " + employee.getSalary() + ", " + employee.getId());
            }
        }
    }
    private static void findSalaryLess(int salary) {
        for (Employee employee : EMPLOYEES) {
            if (salary > employee.getSalary()) {
                System.out.println("Сотрудники с зарплатой ниже указанной: #" + employee.getId() + ", ФИО: " + employee.getFullName() + ", Зарплата: " + employee.getSalary());
            }
        }
    }
    private static void findSalaryMore(int salary) {
        for (Employee employee : EMPLOYEES) {
            if (salary <= employee.getSalary()) {
                System.out.println("Сотрудники с зарплатой выше указанной: #" + employee.getId() + ", ФИО: " + employee.getFullName() + ", Зарплата: " + employee.getSalary());
            }
        }
    }
    public static void main(String[] args) {

        EMPLOYEES[0] = new Employee("Пупкин Василий Олегович", 1, 101_000);
        EMPLOYEES[1] = new Employee("Чушкин Владеяр Арсениевич", 1, 102_500);
        EMPLOYEES[2] = new Employee("Сахаров Петр Алексеевич", 2, 98_000);
        EMPLOYEES[3] = new Employee("Кузин Кузьма Ибрагимович", 2, 80_500);
        EMPLOYEES[4] = new Employee("Иванова Ирина Николаевна", 3, 150_000);
        EMPLOYEES[5] = new Employee("Галицина Виктория Антоновна", 4, 120_000);
        EMPLOYEES[6] = new Employee("Щукин Матвей Сергеевич", 4, 80_000);
        EMPLOYEES[7] = new Employee("Петриченко Ольга Михайловна", 4, 110_000);
        EMPLOYEES[8] = new Employee("Люпин Евгений Евпатович", 5, 39_000);
        EMPLOYEES[9] = new Employee("Астапова Лидия Тарасовна", 5, 58_000);

        typeAllEmployees();            /*Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).*/
        countAllMonthSalary();         /*Посчитать сумму затрат на зарплаты в месяц.*/
        System.out.println("Сумма всех затрат на зарплату в месяц: " + countAllMonthSalary());
        countMinSalary();              /*Найти сотрудника с минимальной зарплатой. */
        countMaxSalary();              /*Найти сотрудника с максимальной зарплатой.*/
        averageSalary();               /*Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).*/
        countAllFullNameEmployees();   /*Получить Ф. И. О. всех сотрудников (вывести в консоль).*/
        salaryIndexation(10);            /*Индексация зп на процент*/
        typeMaxSalaryDep(4);          /*максимальная по отделу*/
        typeMinSalaryDep(1);          /*минимальная по отделу*/
        countAllMonthSalaryDep(5);    /*Месячные траты на отдел*/
        averageSalaryDep(4);          /*Средняя зп по отделу*/
        salaryIndexDep(2,1);   /*Проиндексированная зарплата отдела*/
        countAllFullNameDep(4);       /*Сотрудники отдела*/
        findSalaryLess(100_000);                /*Поиск зп ниже указанной*/
        findSalaryMore(90_000);
    }
}