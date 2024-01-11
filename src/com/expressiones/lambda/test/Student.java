package com.expressiones.lambda.test;

public class Student {
    private int id;
    private String cedula;
    private String names;
    private String lastName;
    private String  subject;
    private double  note;
    private int age;

    public Student() {

    }

    public Student(int id, String cedula, String names, String lastName, String subject, double note, int age) {
        this.id = id;
        this.cedula = cedula;
        this.names = names;
        this.lastName = lastName;
        this.subject = subject;
        this.note = note;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String toString() {
        return "Student{" +
                "id=" + id +
                ", cedula='" + cedula + '\'' +
                ", names='" + names + '\'' +
                ", lastName='" + lastName + '\'' +
                ", subject='" + subject + '\'' +
                ", note=" + note +
                ", age=" + age +
                '}';
    }
}
