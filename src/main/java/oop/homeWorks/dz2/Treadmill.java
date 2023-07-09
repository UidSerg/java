package oop.homeWorks.dz2;

public class Treadmill {
    public String name;
    public double distance;

    public Treadmill(String name, double distance) {
        this.name = name;
        this.distance = distance;
    }

    public Treadmill() {
    }

    @Override
    public String toString() {
        return "Treadmill{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                '}';
    }
}
