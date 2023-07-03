package ru.gb.seminars.seminar6;
//1) Дан массив чисел, посчитать процент уникальных чисел.
//*процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Zd1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 5, 1, 4, 2));
        Set<Integer> set = new HashSet<>(list);
//        for (Integer integer: list) {
//            set.add(integer);
//        }
        System.out.println("set = " + set);
        System.out.println("list = " + list);
        int res = set.size()*100/ list.size();
        System.out.println("Процент уникальных = " + res + "%");
    }


}
