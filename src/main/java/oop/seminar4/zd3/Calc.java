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
//Zd1 dz расширить класс калькулятор на умножение
    public double proizv(List<? extends Number> numbers){
        double proizv = 1.0;
        for (Number number :numbers) {
            proizv *= number.doubleValue();
        }
        return  proizv;
    }
    public double dell(Element<? extends Number> delimoe, Element<? extends Number> delitel){
        double rezult = 0.0;
        if(delitel.getObj().doubleValue() == 0.0) return 0;
        rezult = delimoe.getObj().doubleValue()/delitel.getObj().doubleValue();
        return  rezult;
    }
}

