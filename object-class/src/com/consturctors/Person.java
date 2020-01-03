package com.consturctors;

public class Person {

    private String name;
    private String surname;
    private Integer age;

    public Person() {
        this("undefined","undefined",-1);
        System.out.println("You called first constructor");
    }

    public Person(String name, String surname, Integer age) {
        System.out.println("You called second constructor");
        this.name = name;
        this.surname = surname;
        this.age = age;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
