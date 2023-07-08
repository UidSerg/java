package oop.homeWorks.dz1;
//номер группы 4589 Дамченко Сергей

import java.util.ArrayList;
import java.util.List;

//2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
//3)Создать класс Basket, содержащий массив купленных товаров.
//4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
//5)Вывести на консоль каталог продуктов. (все продукты магазина)
//6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)
public class Main {
    public static void main(String[] args) {



        Tovar tovar1 = new Tovar("Dell In123", 50000.0, 9.0);
        Tovar tovar2 = new Tovar("Asus AS123", 65000.0, 8.0);
        Tovar tovar3 = new Tovar("Hp HP123", 75000.0, 9.5);
        Tovar tovar4 = new Tovar("мышь х1568", 1000.0, 10.0);
        Tovar tovar5 = new Tovar("Клавиатура S123", 3500.0, 8.0);
        Tovar tovar6 = new Tovar("Наушники 4tech", 5000.0, 9.5);
        Tovar tovar7 = new Tovar("Apple 14 Pro", 130000.0, 9.0);
        Tovar tovar8 = new Tovar("Honor X9a", 25000.0, 8.0);
        Tovar tovar9 = new Tovar("Realme 11pro", 32000.0, 9.5);

       List<Categoria> categorias =new ArrayList<>();
        List<Tovar> tovars = new ArrayList<>();
        tovars.add(tovar1);
        tovars.add(tovar2);
        tovars.add(tovar3);
        Categoria cat1 = new Categoria("Ноутбуки", tovars);
        categorias.add(cat1);
        List<Tovar> tovars1 = new ArrayList<>();
        tovars1.add(tovar4);
        tovars1.add(tovar5);
        tovars1.add(tovar6);
        Categoria cat2 = new Categoria("Перефирия", tovars1);
        categorias.add(cat2);
        List<Tovar> tovars2 = new ArrayList<>();
        tovars2.add(tovar7);
        tovars2.add(tovar8);
        tovars2.add(tovar9);
        Categoria cat3 = new Categoria("Смартфоны", tovars2);
        categorias.add(cat3);

        User user1 = new User("Дамченко Сергей","11AA22");
        User user2 = new User("Петров Петр","123456");


        for (Categoria elem:categorias) {
            System.out.println("elem = " + elem.toString());
        }

        user1.inbas(tovar1, cat1);
        user2.inbas(tovar4, cat2);
        System.out.println("в корзину первый юзер " + user1.tovars);
        System.out.println("в корзину второй" + user2.tovars);

        System.out.println("categoria = " + cat1);
        System.out.println("categoria = " + cat2);

    }

}
