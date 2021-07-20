package model;

import lombok.ToString;

@ToString
public class Teacher {
    private String nameOfTeacher;

    public Teacher(String nameOfTeacher) {
        this.nameOfTeacher = nameOfTeacher;
    }

    public String getNameOfTeacher() {
        return nameOfTeacher;
    }

    public void setNameOfTeacher(String nameOfTeacher) {
        this.nameOfTeacher = nameOfTeacher;
    }
}
