package oop.seminar5.zd1.controller;

import oop.seminar5.zd1.data.Student;
import oop.seminar5.zd1.service.UserService;

import java.util.List;

public class Controller {
    public void send(List<Student> studens) {
        UserService userService = new UserService();
        userService.create(studens);
    }
    public List<Student> show() {
        UserService userService = new UserService();
        return userService.read();

    }
}
