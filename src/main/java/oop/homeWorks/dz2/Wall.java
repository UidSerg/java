package oop.homeWorks.dz2;

public class Wall {
    public String name;
    public double height;

    public Wall(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public Wall() {
    }

    @Override
    public String toString() {
        return "Wall{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
