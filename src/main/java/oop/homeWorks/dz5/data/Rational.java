package oop.homeWorks.dz5.data;

// Принцип единой ответсвеннсоти каждый объект описываетсмя отдельно
//приципа барборы  лисков нет тюк нет родительских классов и классов наслединков
public class Rational{
    private double value; // // Принцип открытости закрытости класс закрыт для изменения

    public Rational(double value) {
        this.value = value;
    }

    public Rational() {
    }

    public double getValue() {// Принцип открытости закрытости класс открыт для использования
        return value;
    }
}
