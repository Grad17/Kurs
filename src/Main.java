public class Main {
    static Employee[] employees = new  Employee[10];
    public static void typeAllEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static void countAllMonthSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        System.out.println("Сумма всех затрат на зарплату в месяц: " + sum);
    }
    public static void countMinSalary(Employee[] employees) {
        if (employees.length > 0) {
            Employee emp = employees[0];
            for (Employee employee : employees) {
                if (emp.getSalary() > employee.getSalary())
                    emp = employee;
            }
            System.out.println("Сотрудник с минимальной зарплатой: " + emp.getSalary() + " " + emp.getFullName() + " #" + emp.getId());
        }
    }
    public static void countMaxSalary(Employee[] employees) {
        if (employees.length > 0) {
            Employee emp = employees[0];
            for (Employee employee : employees) {
                if (emp.getSalary() < employee.getSalary())
                    emp = employee;
            }
            System.out.println("Сотрудник с максимальной зарплатой: " + emp.getSalary() + " " + emp.getFullName() + " #" + emp.getId());
        }
    }
    public static void averageSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        int result = sum / employees.length;
        System.out.println("Средняя зарплата: " + result);
    }
    //    {
//        int sum = countAllMonthSalary(employees);           /* С этим вариантом выводится две строки "Сумма всех затрат на зарплату в месяц" не смог ничего с этим сделать*/
//        int average = sum / employees.length;
//        System.out.println("Средняя зарплата: " + average);
//    }
    public static void countAllFullNameEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("Сотрудники предприятия: " + employee.getFullName());
        }
    }
    public static void main(String[] args) {

        employees[0] = new Employee("Пупкин Василий Олегович", 1, 101_000);
        employees[1] = new Employee("Чушкин Владеяр Арсениевич", 1, 102_500);
        employees[2] = new Employee("Сахаров Петр Алексеевич", 2, 98_000);
        employees[3] = new Employee("Кузин Кузьма Ибрагимович", 2, 80_500);
        employees[4] = new Employee("Иванова Ирина Николаевна", 3, 150_000);
        employees[5] = new Employee("Галицина Виктория Антоновна", 4, 110_000);
        employees[6] = new Employee("Щукин Матвей Сергеевич", 4, 109_000);
        employees[7] = new Employee("Петриченко Ольга Михайловна", 4, 110_500);
        employees[8] = new Employee("Люпин Евгений Евпатович", 5, 39_000);
        employees[9] = new Employee("Астапова Лидия Тарасовна", 5, 58_000);

        typeAllEmployees(employees);            /*Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).*/
        countAllMonthSalary(employees);         /*Посчитать сумму затрат на зарплаты в месяц.*/
        countMinSalary(employees);              /*Найти сотрудника с минимальной зарплатой. */
        countMaxSalary(employees);              /*Найти сотрудника с максимальной зарплатой.*/
        averageSalary(employees);               /*Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).*/
        countAllFullNameEmployees(employees);   /*Получить Ф. И. О. всех сотрудников (вывести в консоль).*/
    }
}