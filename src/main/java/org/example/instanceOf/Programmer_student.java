package org.example.instanceOf;

public class Programmer_student extends Student{
    private String group;

    public Programmer_student(String name, String surname, int age, String university, String course, String group) {
        super(name, surname, age, university, course);
        this.group = group;
    }
}
