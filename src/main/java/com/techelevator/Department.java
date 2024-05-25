package com.techelevator;

public class Department {

    private String name;

    private int departmentId;

    public String getName() {
        return name;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public Department(int departmentId, String name) {
        this.name = name;
        this.departmentId = departmentId;
    }
}
