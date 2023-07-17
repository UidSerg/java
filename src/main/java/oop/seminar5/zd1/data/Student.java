package oop.seminar5.zd1.data;

import java.time.LocalDate;

public class Student extends User{
    int studentId;

    public Student(int studentId) {
        this.studentId = studentId;
    }

    public Student(String name, LocalDate birthDate, int studentId) {
        super(name, birthDate);
        this.studentId = studentId;
    }
}
