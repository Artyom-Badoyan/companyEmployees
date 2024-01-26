package javaCore.karenHomeWorck.homeWork15;

public interface Commands {
    String EXIT = "0";
    String ADD_EMPLOYEE = "1";
    String ADD_COMPANY = "2";
    String PRINT_ALL_EMPLOYEE = "3";
    String PRINT_ALL_COMPANIES = "4";
    String SEARCH_EMPLOYEE_BY_EMPLOYEE_ID = "5";
    String SEARCH_EMPLOYEE_BY_COMPANY_ID = "6";
    String SEARCH_EMPLOYEE_BY_SALARY_RANGE = "7";
    String CHANGE_EMPLOYEE_POSITION_BY_ID = "8";
    String PRINT_ONLY_ACTIVE_EMPLOYEES = "9";
    String INACTIVE_EMPLOYEE_BY_ID = "10";
    String ACTIVE_EMPLOYEE_BY_ID = "11";

    static void printCommands() {
        System.out.println("please input " + EXIT + " for exit");
        System.out.println("please input " + ADD_EMPLOYEE + " add employee");
        System.out.println("please input " + ADD_COMPANY + " add company");
        System.out.println("please input " + PRINT_ALL_EMPLOYEE + " print all employee");
        System.out.println("please input " + PRINT_ALL_COMPANIES + " print all companies");
        System.out.println("please input " + SEARCH_EMPLOYEE_BY_EMPLOYEE_ID + " search employee by employeeID");
        System.out.println("please input " + SEARCH_EMPLOYEE_BY_COMPANY_ID + " search employee by company id");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_SALARY_RANGE + " for search employee by salary range");
        System.out.println("Please input " + CHANGE_EMPLOYEE_POSITION_BY_ID + " for change employee position by id");
        System.out.println("Please input " + PRINT_ONLY_ACTIVE_EMPLOYEES + " for print only active employees");
        System.out.println("Please input " + INACTIVE_EMPLOYEE_BY_ID + " for inactive employee by id");
        System.out.println("Please input " + ACTIVE_EMPLOYEE_BY_ID + " for activate employee by id");
    }
}