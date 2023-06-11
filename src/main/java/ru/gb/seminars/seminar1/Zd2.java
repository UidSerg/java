package ru.gb.seminars.seminar1;

import java.util.Scanner;

public class Zd2 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов: ");
        Scanner scaner = new Scanner(System.in);
        int n = scaner.nextInt();
        System.out.println("Введите элемент: ");
        System.out.println("Сумма целых чисел = " + zadanie2(n, scaner));

    }

    /**
     * @apiNote Дана последовательность N целых чисел. Найти количество положительных чисел, после которых следует
     * отрицательное число.
     * @param n int
     * @param scaner scaner
     * @return count
     */
    private static Integer zadanie2(int n, Scanner scaner) {

        int count = 0;
        int a = 0, b = 0;
        a = scaner.nextInt();
        for (int i = 0; i < n-1; i++) {
            b = scaner.nextInt();
            if(a > 0 && b < 0) count++;
            a = b;
        }
        scaner.close();
        return count;
    }
}
