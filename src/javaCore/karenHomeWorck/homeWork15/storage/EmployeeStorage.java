package javaCore.karenHomeWorck.homeWork15.storage;


import javaCore.karenHomeWorck.homeWork15.model.Company;
import javaCore.karenHomeWorck.homeWork15.model.Employee;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        } else {
            employees[size++] = employee;
        }
    }

    private void extend() {
        Employee[] temp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, temp, 0, size);
        employees = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i] + " ");
        }
    }

    public void printByStatus(boolean isActive) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.isActive() == isActive) {
                System.out.println(employees[i] + " ");
            }
        }
    }

    public Employee getEmployeeById(String id) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getEmployeeId().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    public void searchEmployeeByCompany(Company company) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getCompany().equals(company)) {
                System.out.println(employee);
            }
        }
    }

    public void searchBySalaryRange(double minPrice, double maxPrice) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() >= minPrice && employee.getSalary() <= maxPrice) {
                System.out.println(employee);
            }
        }
    }
}

