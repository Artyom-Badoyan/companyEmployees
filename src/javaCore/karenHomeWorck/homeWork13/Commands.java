package javaCore.karenHomeWorck.homeWork13;

public interface Commands {
    String EXIT = "0";
    String ADD_EMPLOYEE = "1";
    String PRINT_ALL_EMPLOYEE = "2";
    String SEARCH_EMPLOYEE_BY_EMPLOYEE_ID = "3";
    String SEARCH_EMPLOYEE_BY_COMPANY_NAME = "4";
    String SEARCH_EMPLOYEE_BY_SALARY_RANGE = "5";
    String CHANGE_EMPLOYEE_POSITION_BY_ID = "6";
    String PRINT_ONLY_ACTIVE_EMPLOYEES = "7";
    String INACTIVE_EMPLOYEE_BY_ID = "8";
    String ACTIVE_EMPLOYEE_BY_ID = "9";

    static void printCommands() {
        System.out.println("please input " + EXIT + " for exit");
        System.out.println("please input " + ADD_EMPLOYEE + " add employee");
        System.out.println("please input " + PRINT_ALL_EMPLOYEE + " print all employee");
        System.out.println("please input " + SEARCH_EMPLOYEE_BY_EMPLOYEE_ID + " search employee by employeeID");
        System.out.println("please input " + SEARCH_EMPLOYEE_BY_COMPANY_NAME + " search employee by company name");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_SALARY_RANGE + " for search employee by salary range");
        System.out.println("Please input " + CHANGE_EMPLOYEE_POSITION_BY_ID + " for change employee position by id");
        System.out.println("Please input " + PRINT_ONLY_ACTIVE_EMPLOYEES + " for print only active employees");
        System.out.println("Please input " + INACTIVE_EMPLOYEE_BY_ID + " for inactive employee by id");
        System.out.println("Please input " + ACTIVE_EMPLOYEE_BY_ID + " for activate employee by id");
    }
}