package oop.homeWorks.dz5.controller;

import oop.homeWorks.dz5.data.Complex;
import oop.homeWorks.dz5.data.Element;

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
//Zd2
    public double dell(Element<? extends Number> delimoe, Element<? extends Number> delitel){
        double rezult = 0.0;
        if(delitel.getObj().doubleValue() == 0.0) return 0;
        rezult = delimoe.getObj().doubleValue()/delitel.getObj().doubleValue();
        return  rezult;
    }
//Zd3
    public String inBinary(String strNum){
        double number = Double.parseDouble(strNum);
        int leftNum = (int) number;
        double rightNum = number % leftNum;
        int count = 0;
        for (String s : strNum.split("")) {
            if (s.charAt(0) == '.'){
                count++;
            }
        }
        if (count == 0) {
            return Integer.toBinaryString(leftNum);
        } else {
            if (rightNum == 0){
                return Integer.toBinaryString(leftNum);
            }else {
                return Integer.toBinaryString(leftNum) + "," +
                        Long.toBinaryString(Double.doubleToRawLongBits(rightNum));
            }
        }
    }

    public Complex sum(Complex comp1, Complex comp2) {
        Complex rez = new Complex(comp1.getOx()+comp2.getOx(),comp1.getOy()+comp2.getOy());
        return rez;
    }
    public Complex proizv(Complex comp1, Complex comp2) {
        Complex rez = new Complex(comp1.getOx()*comp2.getOx(),comp1.getOy()*comp2.getOy());
        return rez;
    }
    public Complex dell(Complex comp1, Complex comp2) {
        if(comp2.getOx() == 0.0 | comp2.getOy() == 0.0){
            Complex rez = new Complex(0.0,0.0);
            return rez;
        }
        Complex rez = new Complex(comp1.getOx()/comp2.getOx(),comp1.getOy()/comp2.getOy());
        return rez;
    }
}

