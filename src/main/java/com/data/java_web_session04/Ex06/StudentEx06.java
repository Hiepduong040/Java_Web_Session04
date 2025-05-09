package com.data.java_web_session04.Ex06;

public class StudentEx06 {
    int id;
    String name;
    int age;
    double gpa;

    public StudentEx06(int id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGpa() { return gpa; }
}