package oop.homeWorks.dz1;
//1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
public class Tovar {
    String name;
    double price;
    double rating;

    public Tovar() {
    }

    public Tovar(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    public boolean search(Tovar tovar){
        if (this.name == tovar.name) {
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Tovar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
