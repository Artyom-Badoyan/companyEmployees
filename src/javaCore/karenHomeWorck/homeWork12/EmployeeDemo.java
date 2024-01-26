package javaCore.karenHomeWorck.homeWork12;

import javaCore.karenHomeWorck.homeWork12.model.Employee;
import javaCore.karenHomeWorck.homeWork12.storage.EmployeeStorage;
import javaCore.karenHomeWorck.homeWork12.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();


    public static void main(String[] args) throws ParseException {

        employeeStorage.add(new Employee("Artyom", "Badoyan", "A001", 500, "Lentex",
                "Mexanik", new Date(), DateUtil.stringToDate("04/02/2024")));
        employeeStorage.add(new Employee("Karen", "Margaryan", "A002", 300, "Alex",
                "Mexanik", new Date(), DateUtil.stringToDate("10/05/2024")));
        employeeStorage.add(new Employee("Poxos", "Poxosyan", "A003", 800, "It0",
                "Developer", new Date(), DateUtil.stringToDate("15/03/2024")));

        boolean isRun = true;

        while (isRun) {
            printCommands();
            String commands = scanner.nextLine();
            switch (commands) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addEmployee();
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    getEmployeeById();
                    break;
                case "4":
                    System.out.println("please input company name");
                    String company = scanner.nextLine();
                    employeeStorage.searchEmployeeByCompanyName(company);
                    break;
                case "5":
                    searchEmployeeBySalaryRange();
                    break;
                case "6":
                    changePositionByEmployeeId();
                    break;
                case "7":
                    employeeStorage.printByStatus(true);
                    break;
                case "8":
                    inActivateEmployee();
                    break;
                case "9":
                    activateEmployee();
                    break;
                default:
                    System.out.println("Wrong commands. Please try again!!!");
            }
        }
    }

    private static void activateEmployee() {
        employeeStorage.printByStatus(false);
        System.out.println("Please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null || employee.isActive()) {
            System.out.println("Wrong employee ID, or employee is active. Please try again!");
        } else {
            employee.setActive(true);
            System.out.println("Status changed!");
        }
    }

    private static void printCommands() {
        System.out.println("please input 0 for exit");
        System.out.println("please input 1 add employee");
        System.out.println("please input 2 print all employee");
        System.out.println("please input 3 search employee by employeeID");
        System.out.println("please input 4 search employee by company name");
        System.out.println("Please input 5 for search employee by salary range");
        System.out.println("Please input 6 for change employee position by id");
        System.out.println("Please input 7 for print only active employees");
        System.out.println("Please input 8 for inactive employee by id");
        System.out.println("Please input 9 for activate employee by id");
    }

    private static void inActivateEmployee() {
        employeeStorage.printByStatus(true);
        System.out.println("Please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null || !employee.isActive()) {
            System.out.println("Wrong employee ID, or employee is inactive. Please try again!");
        } else {
            employee.setActive(false);
            System.out.println("Status changed!");
        }
    }

    private static void changePositionByEmployeeId() {
        employeeStorage.printByStatus(true);
        System.out.println("Please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("Wrong employee ID, please try again!");
        } else {
            System.out.println("please input new position name");
            String position = scanner.nextLine();
            employee.setPosition(position);
            System.out.println("Position changed!");
        }
    }

    private static void searchEmployeeBySalaryRange() {
        System.out.println("Please input minPrice, maxPrice");
        String salaryRangeStr = scanner.nextLine();
        String[] salaryRange = salaryRangeStr.split(",");
        double minPrice = Double.parseDouble(salaryRange[0]);
        double maxPrice = Double.parseDouble(salaryRange[1]);
        if (maxPrice < minPrice) {
            System.out.println("minPrice should be less then maxPrice");
            return;
        }
        employeeStorage.searchBySalaryRange(minPrice, maxPrice);

    }

    private static void getEmployeeById() {
        System.out.println("please input employee Id");
        String employeeId = scanner.nextLine();
        Employee employeeById = employeeStorage.getEmployeeById(employeeId);
        if (employeeById == null) {
            System.out.println("Employee with " + employeeId + " id does not exists");
        } else {
            System.out.println(employeeById);
        }
    }

    private static void addEmployee() throws ParseException {
        System.out.println("please input employee name,surname,employeeId,salary,companyName,position,dateOfBirthday(19/01/2024)");
        String employeeDataStr = scanner.nextLine();
        String[] employeeData = employeeDataStr.split(",");
        String employeeId = employeeData[2];
        Employee employeeById = employeeStorage.getEmployeeById(employeeId);
        if (employeeById == null) {
            Employee employee = new Employee(employeeData[0], employeeData[1],
                    employeeId, Double.parseDouble(employeeData[3]),
                    employeeData[4], employeeData[5], new Date(), DateUtil.stringToDate(employeeData[6]));
            employeeStorage.add(employee);
            System.out.println("Employee was added!");
        } else {
            System.out.println("Employee with " + employeeId + " id already exists");
        }
    }
}
