package ru.gb.homeWorks.dz6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Laptop {
    public String name;
    public Integer ram;
    public Integer hdd;
    public String os;
    public String color;
    public double price;
}
