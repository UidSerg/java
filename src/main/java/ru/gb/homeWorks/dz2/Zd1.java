package ru.gb.homeWorks.dz2;

import java.util.Random;
import java.util.Scanner;

/*
* Дана последовательность N целых чисел. 
* Найти сумму простых чисел.
*/
public class Zd1 {
    public static void main(String[] args) {
        System.out.println("Введите длину последовательости: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            Random rnd = new Random();
            int value = rnd.nextInt(100);
            System.out.println(value);
            int count = 0;
            for (int j = 1; j < Math.sqrt(value); j++) {
                if (value % j == 0) { count++;}
            }
            if (count == 1) {
                System.out.println("простое:" + value); //для проверки
                sum +=value;}
        }
        System.out.println("Сумма простыx чисел = " + sum);
    }
}
