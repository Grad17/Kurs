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
        int sum = countAllMonthSalary();
        int average = sum / EMPLOYEES.length;
        System.out.println("Средняя зарплата: " + average);
    }

    private static void countAllFullNameEmployees() {
        for (Employee employee : EMPLOYEES) {
            System.out.println("Сотрудники предприятия: " + employee.getFullName());
        }
    }

    public static void main(String[] args) {

        EMPLOYEES[0] = new Employee("Пупкин Василий Олегович", 1, 101_000);
        EMPLOYEES[1] = new Employee("Чушкин Владеяр Арсениевич", 1, 102_500);
        EMPLOYEES[2] = new Employee("Сахаров Петр Алексеевич", 2, 98_000);
        EMPLOYEES[3] = new Employee("Кузин Кузьма Ибрагимович", 2, 80_500);
        EMPLOYEES[4] = new Employee("Иванова Ирина Николаевна", 3, 150_000);
        EMPLOYEES[5] = new Employee("Галицина Виктория Антоновна", 4, 110_000);
        EMPLOYEES[6] = new Employee("Щукин Матвей Сергеевич", 4, 109_000);
        EMPLOYEES[7] = new Employee("Петриченко Ольга Михайловна", 4, 110_500);
        EMPLOYEES[8] = new Employee("Люпин Евгений Евпатович", 5, 39_000);
        EMPLOYEES[9] = new Employee("Астапова Лидия Тарасовна", 5, 58_000);

        typeAllEmployees();            /*Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).*/
        countAllMonthSalary();         /*Посчитать сумму затрат на зарплаты в месяц.*/
        System.out.println("Сумма всех затрат на зарплату в месяц: " + countAllMonthSalary());
        countMinSalary();              /*Найти сотрудника с минимальной зарплатой. */
        countMaxSalary();              /*Найти сотрудника с максимальной зарплатой.*/
        averageSalary();               /*Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).*/
        countAllFullNameEmployees();   /*Получить Ф. И. О. всех сотрудников (вывести в консоль).*/
    }
}