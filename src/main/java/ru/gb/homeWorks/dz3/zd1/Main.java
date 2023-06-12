package ru.gb.homeWorks.dz3.zd1;

import ru.gb.homeWorks.dz3.zd1.DataBase;

import java.util.ArrayList;
import java.util.List;

/*
1. Дан массив записей: наименование товара, цена, сорт. 
Найти наибольшую цену товаров 1го или 2-го сорта среди товаров,
 название которых содержит «высший»
 */
public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase("Высший разум", 1000, 1);
        DataBase db1 = new DataBase("Ноутбук", 4000, 3);
        DataBase db2 = new DataBase("Высший процессор", 6000, 2);
        DataBase db3 = new DataBase("монитор", 7000, 1);
        DataBase db4 = new DataBase("Высший модем", 5000, 3);

        List<DataBase> tovarList = new ArrayList<>();
        tovarList.add(db);
        tovarList.add(db1);
        tovarList.add(db2);
        tovarList.add(db3);
        tovarList.add(db4);
        System.out.println("tovarList = " + tovarList);
        double maxPrise = 0;
        for (DataBase dataBase : tovarList) {
            if (dataBase.getName().toLowerCase().contains("высший") == true && dataBase.getSort() == 1 | dataBase.getSort() == 2) {
                if (dataBase.getPrice() > maxPrise) {
                    maxPrise = dataBase.getPrice();
                }
            }
        }
        System.out.println("Наивысшая цена " + maxPrise);
    }
}
