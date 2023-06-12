package ru.gb.homeWorks.dz3.zd2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tovar {
    public String name;
    public String country;
    public double weight;
    public double price;
    public int sort;

}
