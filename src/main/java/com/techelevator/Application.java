package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    private List<Department> departments = new ArrayList<>();


    private List<Employee> employees = new ArrayList<>();

    private Map<String,Project> projects = new HashMap<>();

    /**
     * The main entry point in the application
     * @param args
     */
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    private void run() {
        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!
        employees.get(1).raiseSalary(10.0);

        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();
    }

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {
        departments.add(new Department(1, "Marketing"));
        departments.add(new Department(2, "Sales"));
        departments.add(new Department(3,"Engineering"));
    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        for (Department d: departments){
            System.out.println(d.getName());
        }
    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {
//  ***   Employee newEmployee = new Employee();
//        newEmployee.setEmployeeId(1);
//        newEmployee.setFirstName("Dean");
//        newEmployee.setLastName("Johnson");
//        newEmployee.setEmail("djohnson@teams.com");
//        newEmployee.setDepartment(departments.get(2));
//        newEmployee.setHireDate("08/21/2020");
//
//        employees.add(newEmployee);

        employees.add(new Employee(1,"Dean","Johnson","djohnson@teams.com",departments.get(2),"08/21/2020"));
        employees.add(new Employee(2,"Angie","Smith","asmith@teams.com",departments.get(2),"08/21/2020"));
        employees.add(new Employee(3,"Margaret","Thompson","mthompson@teams.com",departments.get(0),"08/21/2020"));

    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
        for (Employee e: employees){
            System.out.print(e.getFullName());
            System.out.print(" (" + e.getSalary() + ") ");
            System.out.println((e.getDepartment().getName()));
        }
    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {


    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {

    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");

    }

}
