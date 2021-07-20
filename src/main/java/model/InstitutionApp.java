package model;

import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@ToString
public class InstitutionApp {
    public static void main(String[] args) {
        Teacher stackLead = new Teacher("Gadibia Daro");
        Teacher programAssociate = new Teacher("Jane Angelo");
        Teacher stackAssociate1 = new Teacher("Stephen Adehor");
        Teacher stackAssociate2 = new Teacher("Olusola Alao");
        Teacher stackAssociate3 = new Teacher("Ose");


        Student decadev1 = new Student("Hope Chijuka");
        Student decadev2 = new Student("Toby Bolarinwa");
        Student decadev3 = new Student("Shadrach Adamu");
        Student decadev4 = new Student("Goodluck Nwoko");
        Student decadev5 = new Student("Ose");

        Set<String> teacherSet = new HashSet<>();
        teacherSet.add(stackLead.getNameOfTeacher());
        teacherSet.add(programAssociate.getNameOfTeacher());
        teacherSet.add(stackAssociate1.getNameOfTeacher());
        teacherSet.add(stackAssociate2.getNameOfTeacher());
        teacherSet.add(stackAssociate3.getNameOfTeacher());
        System.out.println(teacherSet);

        Set<String> studentSet = new HashSet<>();
        studentSet.add(decadev1.getNameOfStudent());
        studentSet.add(decadev2.getNameOfStudent());
        studentSet.add(decadev3.getNameOfStudent());
        studentSet.add(decadev4.getNameOfStudent());
        studentSet.add(decadev5.getNameOfStudent());
        System.out.println(studentSet);

        //to implement union of both teacherSet and studentSet
        System.out.println();
        Set<String> unionSet = new HashSet<>(teacherSet);
        unionSet.addAll(studentSet);
        System.out.println("Union of both sets");
        System.out.println(unionSet);


        //to implement intersection of teacherSet and studentSet
        System.out.println();
        Set<String> intersectionSet = new HashSet<>(teacherSet);
        intersectionSet.retainAll(studentSet);
        System.out.println("Intersection of both sets");
        System.out.println(intersectionSet);
    }
}
