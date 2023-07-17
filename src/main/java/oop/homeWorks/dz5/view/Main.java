package oop.homeWorks.dz5.view;


import oop.homeWorks.dz5.controller.Calc;
import oop.homeWorks.dz5.data.Complex;
import oop.homeWorks.dz5.data.Element;
import oop.homeWorks.dz5.data.Rational;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean start = true;
        while (start) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("введите что считаем:");
            System.out.println("1.рациональные | 2.Комлексные|3.Вывести расчеты| 0. Закрыть");
            int cas = scanner.nextInt();
            Calc calc = new Calc();
            scanner.nextLine();
            while (cas != 0) {
                switch (cas) {
                    case 1:
                        List<Double> rats = new ArrayList<>();
                        System.out.println("введите числа для сложения:");
                        int stop = 9;
                        while (stop != 0) {
                            double value = scanner.nextDouble();
                            System.out.println("value = " + value);
                            rats.add(value);
                            stop = scanner.nextInt();
                        }

                        System.out.println("calc = " + calc.sum(rats));
                        break;

                    case 2:
                        System.out.println("введите ox1 числа для сложения:");
                        double ox1 = scanner.nextDouble();
                        System.out.println("введите oy1 числа для сложения:");
                        double oy1 = scanner.nextDouble();
                        System.out.println("введите ox1 числа для сложения:");
                        double ox2 = scanner.nextDouble();
                        System.out.println("введите oy1 числа для сложения:");
                        double oy2 = scanner.nextDouble();
                        Complex comp1 = new Complex(ox1,oy1);
                        Complex comp2 = new Complex(ox2,oy2);
                        System.out.println("calc.sum(comp1,comp2) = " + calc.sum(comp1, comp2));

                        break;

                    case 3:

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
                        break;
                }
                System.out.println("1.рациональные | 2.Комлексные|3.Вывести расчеты| 0. Закрыть");
                cas = scanner.nextInt();
                scanner.nextLine();
                if (cas == 0) start = false;
            }
        }
    }
}