package ru.gb.homeWorks.dz5;

import java.util.*;

public class Zd2 {
    public static void main(String[] args) {
        Map<String, Integer> nameCount = new HashMap<>();
        List<String> workers = Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова",
                "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
                "Иван Мечников", "Петр Петин", "Иван Ежов");
        for (String name : workers) {
            String workName = name.split(" ")[0];
            nameCount.put(workName, nameCount.getOrDefault(workName, 0) + 1);
        }


        Map<String, Integer> sortedNameMap = new LinkedHashMap<>();
        int max = 1;
        for (int value : nameCount.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
                String key = entry.getKey();
                if (nameCount.get(key) == i) {
                    sortedNameMap.put(key, nameCount.get(key));
                }
            }
        }

        for (Map.Entry<String, Integer> entry : sortedNameMap.entrySet()) {
            System.out.println(entry.getKey() + " встретилась: " + entry.getValue() + " раз(а)");
        }
    }
}