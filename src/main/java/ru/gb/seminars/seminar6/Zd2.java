package ru.gb.seminars.seminar6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//2) Найти пересечение двух множеств
//Пример:
//set1= [1,2,3,4]
//set2= [3,5,6,7]
//Вывод в консоль:
//[3]
public class Zd2 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,5,6,7));
        Set<Integer> setRez = new HashSet<>(set1);
        setRez.retainAll(set2);
        System.out.println("setRez = " + setRez);
        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);
    }
}
