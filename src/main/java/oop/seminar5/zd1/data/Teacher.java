package oop.seminar5.zd1.data;

import java.time.LocalDate;

public class Teacher extends  User{
    int teacherId;

    public Teacher(int teacherId) {
        this.teacherId = teacherId;
    }

    public Teacher(String name, LocalDate birthDate, int teacherId) {
        super(name, birthDate);
        this.teacherId = teacherId;
    }
}
