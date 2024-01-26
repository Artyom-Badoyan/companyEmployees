package javaCore.karenHomeWorck.homeWork11;

import java.util.Scanner;

public class EmployeeDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {

        boolean isRun = true;

        while (isRun) {

            System.out.println("please input 0 for exit");
            System.out.println("please input 1 add employee");
            System.out.println("please input 2 print all employee");
            System.out.println("please input 3 search employee by employeeID");
            System.out.println("please input 4 search employee by company name");

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
                default:
                    System.out.println("Wrong commands. Please try again!!!");
            }
        }
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

    private static void addEmployee() {
        System.out.println("please input employee name,surname,employeeId,salary,companyName,position");
        String employeeDataStr = scanner.nextLine();
        String[] employeeData = employeeDataStr.split(",");
        String employeeId = employeeData[2];
        Employee employeeById = employeeStorage.getEmployeeById(employeeId);
        if (employeeById == null) {
            Employee employee = new Employee(employeeData[0], employeeData[1], employeeId, Double.parseDouble(employeeData[3]), employeeData[4], employeeData[5]);
            employeeStorage.add(employee);
            System.out.println("Employee was added!");
        } else {
            System.out.println("Employee with " + employeeId + " id already exists");
        }
    }
}
