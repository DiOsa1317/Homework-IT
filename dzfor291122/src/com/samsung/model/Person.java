package com.samsung.model;

public class Person {
    private int age;
    private String name;
    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "(" + getName() + ", " + getAge() + ")";
    }

    public String work() {
        return "None";
    }
}
