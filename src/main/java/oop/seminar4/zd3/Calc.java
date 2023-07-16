package oop.seminar4.zd3;

import java.util.List;

//3)Написать класс калькулятор, принимающий List целочисленных значений, возвращающий сумму элементов коллекции (метод sum)
public class Calc {
    public double sum(List<? extends Number> numbers){ //любой тип наследуемый от Number
        double sum = 0.0;
        for (Number number :numbers) {
            sum += number.doubleValue();
        }
        return  sum;
        }
}

