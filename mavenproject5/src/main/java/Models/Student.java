/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author huyhk
 */
public class Student {

    private String id;
    private String name;
    private StudentType type;
    private double gpa;

    public Student() {
    }

    public Student(String id, String name, StudentType type, double gpa) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public StudentType getType() {
        return type;
    }

    public double getGpa() {
        return gpa;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(StudentType type) {
        this.type = type;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Type: " + type + ", GPA: " + gpa;
    }
}
