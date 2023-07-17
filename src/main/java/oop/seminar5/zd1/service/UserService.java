package oop.seminar5.zd1.service;

import oop.seminar5.zd1.data.Student;
import oop.seminar5.zd1.data.User;
import java.util.List;

public class UserService implements DataService{
    List<Student> studentList;
    @Override
    public void create(List<Student> studentList) {
        this.studentList =studentList;

    }
    @Override
    public List<Student> read() {
        return studentList;
    }
}
