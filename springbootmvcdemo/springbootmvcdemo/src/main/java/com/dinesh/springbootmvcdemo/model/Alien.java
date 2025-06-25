package com.dinesh.springbootmvcdemo.model;

import org.springframework.stereotype.Component;

public class Alien {

    private String name;
    private int age;
    private String technology;



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    @Override
    public String toString() {
        return "Alien [age=" + age + ", name=" + name + ", technology=" + technology + "]";
    }
}
