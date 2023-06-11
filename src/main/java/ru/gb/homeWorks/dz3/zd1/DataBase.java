package ru.gb.homeWorks.dz3.zd1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class DataBase {
    public String name;
    public double price;
    public int sort;

/*
    public DataBase() {
    }

    public DataBase(String name, double price, int sort) {
        this.name = name;
        this.price = price;
        this.sort = sort;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getSort() {
        return sort;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

 */
}
