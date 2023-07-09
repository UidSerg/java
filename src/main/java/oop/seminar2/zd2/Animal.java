package oop.seminar2.zd2;

public abstract class Animal {
static int count;
String name;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public Animal() {
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Animal.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void run(int distans);
    public abstract void swim(int distans);
}
