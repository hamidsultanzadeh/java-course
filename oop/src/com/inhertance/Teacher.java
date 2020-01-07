package com.inhertance;

public class Teacher extends Person {

    private Double salary;

    public Teacher(String name, String surname, Integer age, Double salary) {
        super(name, surname, age);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
