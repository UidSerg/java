package ru.gb.HomeWork.Dz1;
import java.util.Scanner;

/*
* Дана последовательность целых чисел, оканчивающаяся нулем.
* Найти сумму положительных чисел, после которых следует отрицательное число.
* Пример ввода
* 1 2 1 2 -1 1 3 1 3 -1 0
* Логика расчета
* 2 -1 переход -> 2 в сумму
* 3 -1 переход -> 3 в сумму
* Пример вывода: 5
*/

public class Zd2 {
    public static void main(String[] args) {
        System.out.println("Введите значение через пробел ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.replaceAll("\\s+", " ");
        String [] arr = str.split(" "); //разделяем по пробелу
        int sum = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(Integer.parseInt(arr[i]) > 0 && Integer.parseInt(arr[i+1]) < 0){
                sum = sum + Integer.parseInt(arr[i]);
            }
        }
        System.out.println("Сумма значений : "+sum);
    }
}

/*
  В здании 2 с семинара строку if(a > 0 && b < 0) count++; заменить на if(a > 0 && b < 0) count+=a;
Результат тот же, решение без массива

public class Zd2 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов: ");
        Scanner scaner = new Scanner(System.in);
        int n = scaner.nextInt();
        System.out.print("Введите элемент: ");
        System.out.println("Сумма положительных чисел = " + zadanie2(n, scaner));
    }

private static Integer zadanie2(int n, Scanner scaner) {

    int count = 0;
    int a = 0, b = 0;
    a = scaner.nextInt();
    for (int i = 0; i < n-1; i++) {
        b = scaner.nextInt();
        if(a > 0 && b < 0) count+=a;
        a = b;
    }
    scaner.close();
    return count;
}
}
*/