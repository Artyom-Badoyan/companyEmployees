package javaCore.karenHomeWorck.homeWork11;

public class Employee {

    private String name;
    private String surname;
    private String employeeId;
    private double salary;
    private String company;
    private String position;

    public Employee(String name, String surname, String employeeId, double salary, String company, String position) {
        this.name = name;
        this.surname = surname;
        this.employeeId = employeeId;
        this.salary = salary;
        this.company = company;
        this.position = position;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (Double.compare(getSalary(), employee.getSalary()) != 0) return false;
        if (getName() != null ? !getName().equals(employee.getName()) : employee.getName() != null) return false;
        if (getSurname() != null ? !getSurname().equals(employee.getSurname()) : employee.getSurname() != null)
            return false;
        if (getEmployeeId() != null ? !getEmployeeId().equals(employee.getEmployeeId()) : employee.getEmployeeId() != null)
            return false;
        if (getCompany() != null ? !getCompany().equals(employee.getCompany()) : employee.getCompany() != null)
            return false;
        return getPosition() != null ? getPosition().equals(employee.getPosition()) : employee.getPosition() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getSurname() != null ? getSurname().hashCode() : 0);
        result = 31 * result + (getEmployeeId() != null ? getEmployeeId().hashCode() : 0);
        temp = Double.doubleToLongBits(getSalary());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getCompany() != null ? getCompany().hashCode() : 0);
        result = 31 * result + (getPosition() != null ? getPosition().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
