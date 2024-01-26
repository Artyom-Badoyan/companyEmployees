package javaCore.karenHomeWorck.homeWork15;


import javaCore.karenHomeWorck.homeWork15.model.Company;
import javaCore.karenHomeWorck.homeWork15.model.Employee;
import javaCore.karenHomeWorck.homeWork15.storage.CompanyStorage;
import javaCore.karenHomeWorck.homeWork15.storage.EmployeeStorage;
import javaCore.karenHomeWorck.homeWork15.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static CompanyStorage companyStorage = new CompanyStorage();


    public static void main(String[] args) {

        boolean isRun = true;

        while (isRun) {
            Commands.printCommands();
            String commands = scanner.nextLine();
            switch (commands) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case ADD_COMPANY:
                    addCompany();
                    break;
                case PRINT_ALL_EMPLOYEE:
                    employeeStorage.print();
                    break;
                case PRINT_ALL_COMPANIES:
                    companyStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_EMPLOYEE_ID:
                    getEmployeeById();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY_ID:
                    searchEmployeeByCompanyId();
                    break;
                case SEARCH_EMPLOYEE_BY_SALARY_RANGE:
                    searchEmployeeBySalaryRange();
                    break;
                case CHANGE_EMPLOYEE_POSITION_BY_ID:
                    changePositionByEmployeeId();
                    break;
                case PRINT_ONLY_ACTIVE_EMPLOYEES:
                    employeeStorage.printByStatus(true);
                    break;
                case INACTIVE_EMPLOYEE_BY_ID:
                    inActivateEmployee();
                    break;
                case ACTIVE_EMPLOYEE_BY_ID:
                    activateEmployee();
                    break;
                default:
                    System.out.println("Wrong commands. Please try again!!!");
            }
        }
    }

    private static void searchEmployeeByCompanyId() {
        companyStorage.print();
        System.out.println("please input company id");
        String companyId = scanner.nextLine();
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById != null) {
            employeeStorage.searchEmployeeByCompany(companyById);
        } else {
            System.out.println("Company does not exists!");
        }
    }

    private static void addCompany() {
        System.out.println("Please input Company id,name,address,phoneNumber");
        String companyDataStr = scanner.nextLine();
        String[] companyData = companyDataStr.split(",");
        String companyId = companyData[0];
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById == null) {
            Company company = new Company(companyId, companyData[1], companyData[2], companyData[3]);
            companyStorage.add(company);
            System.out.println("Company was added!");
        } else {
            System.out.println("Company with " + companyId + " already exists!");
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
            employee.getCompany().setEmployeeCount(employee.getCompany().getEmployeeCount() + 1);
            employee.setActive(true);
            System.out.println("Status changed!");
        }
    }


    private static void inActivateEmployee() {
        employeeStorage.printByStatus(true);
        System.out.println("Please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null || !employee.isActive()) {
            System.out.println("Wrong employee ID, or employee is inactive. Please try again!");
        } else {
            employee.getCompany().setEmployeeCount(employee.getCompany().getEmployeeCount() - 1);
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
        try {
            double minPrice = Double.parseDouble(salaryRange[0]);
            double maxPrice = Double.parseDouble(salaryRange[1]);
            if (maxPrice < minPrice) {
                System.out.println("minPrice should be less then maxPrice");
                return;
            }
            employeeStorage.searchBySalaryRange(minPrice, maxPrice);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect number values. Please try again!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please input min and max salary!");
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
        if (companyStorage.getSize() == 0) {
            System.out.println("Please add company first!");
            return;
        }
        companyStorage.print();
        System.out.println("Please choose company id");
        String companyId = scanner.nextLine();
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById != null) {
            try {
                System.out.println("please input employee name,surname,employeeId,salary,position,dateOfBirthday(19/01/2024)");
                String employeeDataStr = scanner.nextLine();
                String[] employeeData = employeeDataStr.split(",");
                String employeeId = employeeData[2];
                Employee employeeById = employeeStorage.getEmployeeById(employeeId);
                if (employeeById == null) {
                    Employee employee = new Employee(employeeData[0], employeeData[1],
                            employeeId, Double.parseDouble(employeeData[3]),
                            companyById, employeeData[4], new Date(), DateUtil.stringToDate(employeeData[5]));
                    employeeStorage.add(employee);
                    companyById.setEmployeeCount(companyById.getEmployeeCount() + 1);
                    System.out.println("Employee was added!");
                } else {
                    System.out.println("Employee with " + employeeId + " id already exists");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Incorrect employee data. Please input employee name,surname,employeeId,salary,position,dateOfBirthday(19/01/2024)");
            } catch (NumberFormatException e) {
                System.out.println("Incorrect number values. Please try again!");
            } catch (ParseException e) {
                System.out.println("Incorrect Date employee. Please try again!");
            }
        } else {
            System.out.println("Wrong company id. Please try again!");
        }
    }
}
