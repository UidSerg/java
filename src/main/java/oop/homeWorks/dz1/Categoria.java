package oop.homeWorks.dz1;


import java.util.ArrayList;
import java.util.List;
public class Categoria {
    String name;
    List<Tovar> tovars;


    public Categoria(String name, List<Tovar> tovars) {
        this.name = name;
        this.tovars = tovars;
    }

    public Categoria() {
        this.tovars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Tovar> getTovars() {
        return tovars;
    }

    public void setTovars(List<Tovar> tovars) {
        this.tovars = tovars;
    }

    public void delTovar(Tovar tovar, Categoria categoria) {
        for (int i = 0; i < categoria.tovars.size(); i++) {
            if (categoria.tovars.get(i).search(tovar)) {
                categoria.tovars.remove(categoria.tovars.get(i));
            }
        }

    }
    @Override
    public String toString() {
        return "Categoria{" +
                "name='" + name + '\'' +
                ", tovars=" + tovars +
                '}';
    }
}
