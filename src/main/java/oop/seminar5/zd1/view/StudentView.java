package oop.seminar5.zd1.view;

import oop.seminar5.zd1.controller.Controller;
import oop.seminar5.zd1.data.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentView {
    public static void main(String[] args) {
        List<Student> studens = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student= new Student("Ivan", LocalDate.now(), i);
            studens.add(student);
        }
        Controller controller = new Controller();
        controller.send(studens);
        controller.show();
    }
}
