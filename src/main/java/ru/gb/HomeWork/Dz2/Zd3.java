package ru.gb.HomeWork.Dz2;

import java.util.Scanner;

import static java.lang.Math.abs;

/*
3) Дан массив целых чисел.
Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
Пример:
Массив = {1, 22, 33, 44, 5, -5, -3, 23, -7}
Сумма индексов двузначных элементов массива = 1+2+3+7 = 13
Массив после замены отрицательных на сумму = {1, 22, 33, 44, 5, 13, 13, 23, 13}
*/
public class Zd3 {
    public static void main(String[] args) {
        System.out.println("Введите длину массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] mass = new int[n];
        System.out.println("Введите элемент массива: ");
        for (int i = 0; i < n; i++) {
            mass[i] = sc.nextInt();
        }
        int sumIndex = ArraySumIndex(mass);
        //int [] mass = {1, 22, 33, 44, 5, -5, -3, 23, -7};
        int length = mass.length;
        for (int i = 0; i < length; i++) {
            if (mass[i] < 0){
                mass[i] = sumIndex;
            }
        }
        for (int elem: mass) {
            System.out.print(elem + " ");
        }
}

    /**
     *
     * @param array входящий массив
     * @return сумма индексов двух значных элементов массива
     */
    public static int ArraySumIndex(int[] array){
    int length = array.length;
    int sumIndex = 0;
    for (int j = 0; j < length; j++) {
        if (abs(array[j]) / 10 >= 1 && abs(array[j]) / 10 < 10) {
            sumIndex += j;
        }
    }
    return sumIndex;
}

}
