package ru.gb.homeWorks.dz3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
Задан целочисленный список ArrayList.
Найти минимальное, максимальное и среднее из этого списка.
*/
public class Zd4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            arrayList.add(rnd.nextInt(100));
        }
        System.out.println("arrayList = " + arrayList);
        System.out.println("Максимальное значение = " + Collections.max(arrayList));
        System.out.println("Минмальное значение = " + Collections.min(arrayList));
        System.out.println("Среднее значение = " + mediumValue(arrayList));
    }

    /**
     * Метод возвращает среднее значение элементов массива
     * @param arrayList входящий массив
     * @return среднее значение
     */
    private static double mediumValue(ArrayList<Integer> arrayList) {
        double mediumValue = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            mediumValue += arrayList.get(i);
        }
        return mediumValue / arrayList.size();
    }
}