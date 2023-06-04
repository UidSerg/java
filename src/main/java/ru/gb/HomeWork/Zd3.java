package ru.gb.HomeWork;

import java.util.Scanner;

public class Zd3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите действие ");
        String str = scanner.nextLine();

        System.out.println("введите число ");
        int a = scanner.nextInt();

        System.out.println("введите число ");
        int b = scanner.nextInt();

        scanner.close();
        System.out.println(a+b);

    }
}
