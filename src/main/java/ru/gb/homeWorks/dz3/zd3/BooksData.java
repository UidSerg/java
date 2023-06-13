package ru.gb.homeWorks.dz3.zd3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BooksData {
    public String bookName;
    public String lastName;
    public double price;
    public int data;
    public int pages;
}
