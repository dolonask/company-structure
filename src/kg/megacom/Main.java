package kg.megacom;

public class Main {

    public static void main(String[] args) {


        Company company = new Company("MegaCom");



        Position positionDirector = new Position("Директор",50000, 200000);
        Position positionDepHead = new Position("Руководитель департамента",50000, 200000);
        Position positionDivHead = new Position("Руководитель",50000, 200000);


        Employee employeeDirector = new Employee("Жаныбек", 1000000,positionDirector);
        Employee employeeDepHead = new Employee("Майрам", 1000000,positionDepHead);
        Employee employeeDivHead = new Employee("Жумагуль", 1000000,positionDivHead);

        StructureUnit dit = new Directory("ДИТ", employeeDirector,company);
        StructureUnit department = new Department("ДРИТ",employeeDepHead, dit );
        StructureUnit division = new Division("Отдел разработок",employeeDivHead, department );


        Position positionProgrammer = new Position("Программист",50000, 200000, division);



        Employee employee = new Employee("Dolon",10000, positionProgrammer);


        printInfo(employee);
        printInfo(employeeDirector);



    }

    private static void printInfo(Employee employee) {

        System.out.println("ФИО: " + employee.getName());
        System.out.println("Зарплата: " + employee.getSalary());
        System.out.println("Должность: " + employee.getPosition().getName());
        System.out.println("Отдел: " + employee.getPosition().getUnit().getName());

        System.out.println("Департамент: " + employee.getPosition().getUnit().getDepartment().getName());
        System.out.println("Дирекция: " + employee.getPosition().getDivision().getDepartment().getDirectory().getName());
        System.out.println("Компания: " + employee.getPosition().getDivision().getDepartment().getDirectory().getCompany().getName());

    }


}
