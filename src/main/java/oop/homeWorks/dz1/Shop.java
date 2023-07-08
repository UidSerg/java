package oop.homeWorks.dz1;

import java.util.List;

// товар категория
public class Shop {
    List<Tovar> tovars;
    List<Categoria> categorias;

    public Shop() {
    }

    public Shop(List<Tovar> tovars) {
        this.tovars = tovars;
    }

}

