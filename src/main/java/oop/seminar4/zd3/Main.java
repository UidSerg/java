package oop.seminar4.zd3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        List<Integer> listInt = new ArrayList<>();
        List<Double> listDobl = new ArrayList<>();
        List<Number> listNum = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            listInt.add(i);
            listDobl.add(((double) i));
            listNum.add(i);
        }
        System.out.println("calc.sum(listNum) = " + calc.sum(listNum));
        System.out.println("calc.sum(listInt) = " + calc.sum(listInt));
        System.out.println("calc.proizv(listNum) = " + calc.proizv(listNum)); //Zd1 dz
        System.out.println("calc.proizv(listInt) = " + calc.proizv(listInt)); //Zd1 dz
//Zd2
        Element<Integer> n1 = new Element<>();
        n1.setObj(5);
        Element<Integer> n2 = new Element<>();
        n2.setObj(2);
        Element<Double> n3 = new Element<>();
        n3.setObj(5.702);
        Element<Double> n4 = new Element<>();
        n4.setObj(0.0);
        System.out.println("calc.dell(5,2) = " + calc.dell(n1, n2));
        System.out.println("calc.dell(Double, Double) = " + calc.dell(n3, n4));
//Zd3
        String num = "357";
        String num1 = "10.99";
        System.out.println("calc.inBinary(num) = " + calc.inBinary(num));
        System.out.println("calc.inBinary(num) = " + calc.inBinary(num1));

    }
}
