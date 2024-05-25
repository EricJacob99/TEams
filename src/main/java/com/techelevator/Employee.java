package com.techelevator;

public class Employee {
    private long employeeId;

    private String firstName;

    private String lastName;

    private String email;

    private double salary;

    private String hireDate;

    private Department department;

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public static double STARTING_SALARY = 60000.00;

    public Employee(long employeeId, String firstName, String lastName, String email, String hireDate, Department department) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hireDate = hireDate;
        this.department = department;
    }

    public Employee() {
        Employee newEmployee = new Employee();

    }
    public String getFullName(){
        return this.firstName + " " + this.lastName;

    }

    public double raiseSalary(double percent){
        return this.salary * percent;
    }

}
