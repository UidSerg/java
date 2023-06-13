package ru.gb.homeWorks.dz3.zd3;

import java.util.ArrayList;
import java.util.List;

/*
Сведения о книге состоят из
 названия, фамилии автора, цены, года издания и количества страниц.
Найти названия книг, в которых простое количество страниц,
фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
public class Main {
    public static void main(String[] args) {
        BooksData books = new BooksData("Война и мир", "Толстой", 5000, 2009, 600);
        BooksData books1 = new BooksData("Мастер  и Маргарита", "Булгаков", 3000, 2010, 150);
        BooksData books2 = new BooksData("Сбоник стихов", "Ахматова", 4000, 2011, 101);
        BooksData books3 = new BooksData("Мертвые души", "Гоголь", 2000, 2008, 107);
        BooksData books4 = new BooksData("Муму", "Тургенев", 1000, 2015, 300);
        List<BooksData> booksList = new ArrayList<>();
        booksList.add(books);
        booksList.add(books1);
        booksList.add(books2);
        booksList.add(books3);
        booksList.add(books4);
        for (BooksData search : booksList
        ) {
            if (chekProst(search.getPages()) == true && search.getLastName().toLowerCase().contains("а") == true && search.getData() >= 2010) {
                System.out.println("Назваине книги: " + search.getBookName());
            }
        }
    }

    /**
     * Метод возвращает являетя ли колличество страниц книги простым числом
     *
     * @param pages колличество страниц книги
     * @return true если да, false если нет
     */
    private static boolean chekProst(int pages) {
        int count = 0;
        for (int j = 1; j < Math.sqrt(pages); j++) {
            if (pages % j == 0) {
                count++;
            }
        }
        if (count == 1) {
            return true;
        }
        return false;
    }
}