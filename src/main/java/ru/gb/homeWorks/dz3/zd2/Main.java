package ru.gb.homeWorks.dz3.zd2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Сведения о товаре состоят из наименования,
страны-производителя, веса, цены, сорта.
Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class Main {
    public static void main(String[] args) {
        Tovar tovar = new Tovar("Ноутбук","chine", 1, 4000, 1);
        Tovar tovar1 = new Tovar("Планшет","russia", 3, 3000, 2);
        Tovar tovar2 = new Tovar("Смарфон","USA", 5, 5000, 2);
        Tovar tovar3 = new Tovar("Смарт-часы","chine", 4, 7000, 3);
        Tovar tovar4 = new Tovar("Фитнес-браслет","russia", 2, 4000, 2);
        List<Tovar> tovarList = new ArrayList<>();
        tovarList.add(tovar);
        tovarList.add(tovar1);
        tovarList.add(tovar2);
        tovarList.add(tovar3);
        tovarList.add(tovar4);
        System.out.println("tovarList = " + tovarList);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите (число), какого сорта ищем товар?: ");
        int searchSort = sc.nextInt();
        List<Tovar> dataSort = new ArrayList<>();
        for (Tovar search : tovarList) {
            if (search.getSort() ==  searchSort) {
                dataSort.add(search);
            }
        }
        double minPrise = Double.MAX_VALUE;
        for (Tovar search: dataSort) {
            if (search.getPrice() < minPrise) {
                minPrise = search.getPrice();
            }

        }
        for (Tovar search : tovarList) {
            if (search.getSort() ==  searchSort && search.getPrice() == minPrise ) {
                System.out.println("Name = " + search.getName());
            }
        }
    }
}