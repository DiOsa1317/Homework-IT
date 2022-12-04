package com.samsung.model;

public class Employee extends Person {
    private String company;
    public Employee(String name, int age, String company) {
        super(name, age);
        this.company=company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String toString() {
        return "(" + getName() + ", " + getAge() + ", " + getCompany() + ")";
    }

    @Override
    public String work() {
        return "Manager";
    }
}
