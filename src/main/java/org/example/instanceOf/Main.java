package org.example.instanceOf;

public class Main {
    public static void main(String[] args) {
        Programmer_student programmerStudent = new Programmer_student("David", "Gvaliya", 24,
                "PGU", "Information security", "18VO2");
        System.out.println(programmerStudent instanceof Person);//Студент-программист является наследником Person
        System.out.println(programmerStudent instanceof Student);//Студент-программист является наследником Student
        System.out.println(programmerStudent.getClass().equals(Programmer_student.class));
    }
}
