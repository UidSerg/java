package ru.gb.HomeWork.dz1;

import java.util.Scanner;

public class OldZd1 {
    public static void main(String[] args) {
        System.out.println("введите число ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Число: "+n+", сумма: "+RecSum(n)+" Factorial: "+RecFact(n));

    }
    private static int RecSum(int n)    {
        if (n == 0) return 0;
        return n+RecSum(n-1);
    }
    private static int RecFact(int n)    {
        if (n == 1) return 1;
        return n*RecFact(n-1);
    }
}
