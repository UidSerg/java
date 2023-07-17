package oop.seminar5.zd1.data;

import java.time.LocalDate;
import java.util.Date;

public abstract class User {
    String name;
    LocalDate birthDate;

    public User() {
    }

    public User(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
}
