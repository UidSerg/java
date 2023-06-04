package ru.gb.HomeWork;

public class Zd2 {
    public static void main(String[] args) {
        System.out.println("Простые числа от 1 до 1000");
        int n = 1;
        while (n <= 1000){
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if(n % i == 0) count++;
            }
            if (count == 2) System.out.print(n+" ");

            n +=1;
        }
    }

    }