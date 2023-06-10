package ru.gb.HomeWork.Dz2;

import java.util.Scanner;

/*
* 2) Дана последовательность из N целых чисел.
* Верно ли, что последовательность является возрастающей.
 */
public class Zd2 {
    public static void main(String[] args) {
        System.out.println("Введите длину последоватльности: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstValue = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            int secondValue = sc.nextInt();
            if (firstValue < secondValue) { count++; } //если предыдущий член последовательности меньше след то счетчик +1
            firstValue = secondValue;
        }
        // если счетчик равен колличеству элементов за вычетом одного(первого) то последовательность растет
        if (count == n - 1) {
            System.out.println("Последовательность является возрастающей");
        } else {
            System.out.println("Последовательность Не является возрастающей");
        }
        sc.close();
    }
}
