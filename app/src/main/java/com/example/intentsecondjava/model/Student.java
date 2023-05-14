package com.example.intentsecondjava.model;





import java.io.Serializable;

public class Student implements Serializable {
    private String name ;
    private int age;

    public Student (int age,String name){
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
