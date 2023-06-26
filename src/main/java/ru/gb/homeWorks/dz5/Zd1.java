package ru.gb.homeWorks.dz5;

import java.util.HashMap;
import java.util.Map;

public class Zd1 {
    public static void main(String[] args) {
        Map<String, Integer> mapRus = new HashMap<>();
        String str = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String[] arrayStr = str.toLowerCase().split(" ");
        String search = "Россия";
        for (String elem : arrayStr) {
            if (elem.contains(search.toLowerCase())) {
                mapRus.putIfAbsent(search, 0);
                mapRus.put(search, mapRus.get(search) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : mapRus.entrySet()) {
            System.out.println(entry.getKey() + " встретилась: " + entry.getValue() + " раз(а)");
        }
    }
}
