package ru.gb.homeWorks.dz6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Ноутбук Razer Blade 18", 32, 1000, "Win 11 Home", "Black", 557999);
        Laptop laptop2 = new Laptop("Ноутбук MSI Titan GT77 HX 13VI-096RU", 32, 2000, "Win 11", "Black", 499999);
        Laptop laptop3 = new Laptop("Ноутбук Razer Blade 16", 32, 1000, "Win 11 Home", "Red", 449999);
        Laptop laptop4 = new Laptop("Ноутбук MSI CreatorPro Z17 A12UMST-260RU", 64, 2000, "Win 11 Pro", "Red", 410999);
        Laptop laptop5 = new Laptop("Ноутбук MSI Raider GE78 HX 13VH-283RU", 12, 2000, "Win 11 Home", "While", 334999);
        Laptop laptop6 = new Laptop("Ноутбук Maibenben X568", 16, 512, "Linux", "While", 129699);
        Laptop laptop7 = new Laptop("Ноутбук Maibenben X558", 16, 512, "Linux", "Silver", 82999);
        Laptop laptop8 = new Laptop("Ноутбук Acer Aspire 3 A315-42-R4WX", 8, 256, "Linux", "Black", 61999);
        Laptop laptop9 = new Laptop("Ноутбук Apple MacBook Pro", 32, 1024, "macOS", "Silver", 319999);
        Laptop laptop10 = new Laptop("Ноутбук Apple MacBook Pro", 16, 1000, "macOS", "While", 271999);

        List<Laptop> laptops = new ArrayList<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        laptops.add(laptop6);
        laptops.add(laptop7);
        laptops.add(laptop8);
        laptops.add(laptop9);
        laptops.add(laptop10);

// множество ОС
        Set<String> setOs = new HashSet<>();
        for (Laptop elem : laptops) {
            setOs.add(elem.os);
        }
        List<String> sets = new ArrayList<>(setOs);
// множество цветов
        Set<String> setColor = new HashSet<>();
        for (Laptop elem : laptops) {
            setColor.add(elem.color);
        }
        List<String> lColor = new ArrayList<>(setColor);

        System.out.println("Выберите фильтр:");
        System.out.println("1 - ОЗУ | 2 - Объем ЖД | 3 - Операционная система | 4 - Цвет| 0 - Поиск");
        Map<String, String> searchMap = new HashMap();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n != 0) {
            String key = "";
            switch (n) {
                case 1:
                    System.out.println("Введите желаемый объем памяти:");
                    int ram = sc.nextInt();
                    key = "ram";
                    searchMap.put(key, String.valueOf(ram));
                    break;

                case 2:
                    System.out.println("Введите желаемый объем SSD:");
                    int ssd = sc.nextInt();
                    key = "hdd";
                    searchMap.put(key, String.valueOf(ssd));
                    break;

                case 3:
                    System.out.println("выберите ОС");
                    for (int i = 0; i < sets.size(); i++) {
                        System.out.println(i + ". " + sets.get(i));
                    }
                    int os = sc.nextInt();
                    key = "os";
                    searchMap.put(key, sets.get(os));
                    break;

                case 4:
                    System.out.println("выберите цвет");
                    for (int i = 0; i < setColor.size(); i++) {
                        System.out.println(i + ". " + lColor.get(i));
                    }
                    int color = sc.nextInt();
                    key = "color";
                    searchMap.put(key, lColor.get(color));
            }
            System.out.println("1 - ОЗУ | 2 - Объем ЖД | 3 - Операционная система | 4 - Цвет| 0 - Поиск");
            n = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Ваш фильтр");
        for (Map.Entry<String, String> entry : searchMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        //   поиск
        Set<Laptop> result = new HashSet<>();
        for (Laptop elem : laptops) {
            if(searchMap.keySet().contains("ram"))
            {
                if(elem.ram == Integer.parseInt(searchMap.get("ram"))){
                    result.add(elem);
                }
            }
            if(searchMap.keySet().contains("hdd"))
            {
                if(elem.hdd == Integer.parseInt(searchMap.get("hdd"))){
                    result.add(elem);
                }
            }
            if(searchMap.keySet().contains("os"))
            {
                if(elem.os == searchMap.get("os")){
                    result.add(elem);
                }
            }
            if(searchMap.keySet().contains("color"))
            {
                if(elem.color == searchMap.get("color")){
                    result.add(elem);
                }
            }
            //if (elem.ram == Integer.parseInt(searchMap.get("ram")) && elem.hdd == Integer.parseInt(searchMap.get("hdd")) && elem.os == searchMap.get("os") && elem.color == searchMap.get("color")){
            //    result.add(elem);
            //}
        }


        if(result.size() == 0) System.out.println("Совпадений не найдено");
        else {
            for (Laptop res : result) {
                System.out.println(res.name + " " + res.price);
            }
        }
    }
}

