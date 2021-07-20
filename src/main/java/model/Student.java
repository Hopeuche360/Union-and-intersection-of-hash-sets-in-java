package model;

import lombok.ToString;

@ToString
public class Student {
    private String nameOfStudent;

    public Student(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }
}
