package oop.homeWorks.dz1;

import java.util.ArrayList;
import java.util.List;

// list из товаров
public class Basket extends Categoria{
    ArrayList<Tovar> tovars;

    public Basket(ArrayList<Tovar> tovars) {
        this.tovars = tovars;
    }

    public Basket() {
    }
    public void inBasket(Tovar tovar, Categoria categoria){
        this.tovars.add(tovar);
        super.delTovar(tovar,categoria);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "tovars=" + tovars +
                '}';
    }
}
