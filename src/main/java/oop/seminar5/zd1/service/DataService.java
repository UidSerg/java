package oop.seminar5.zd1.service;

import oop.seminar5.zd1.data.Student;
import oop.seminar5.zd1.data.User;

import java.util.List;

public interface DataService {
    void create(List<Student> studentList);
    List<Student> read();
}
