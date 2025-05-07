package org.example.instanceOf;

public class Student extends Person {
    private String university;
    private String course;

    public Student(String name, String surname, int age, String university, String course) {
        super(name, surname, age);
        this.university = university;
        this.course = course;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
