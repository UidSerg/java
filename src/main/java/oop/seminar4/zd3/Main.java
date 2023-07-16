package oop.seminar4.zd3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        List<Integer> listInt = new ArrayList<>();
        List<Double> listDobl = new ArrayList<>();
        List<Number> listNum = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listInt.add(i);
            listDobl.add(((double) i));
            listNum.add(i);
        }
        System.out.println("calc.sum(listNum) = " + calc.sum(listNum));
        System.out.println("calc.sum(listInt) = " + calc.sum(listInt));
    }
}
