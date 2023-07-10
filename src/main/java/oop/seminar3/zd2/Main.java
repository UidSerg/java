package oop.seminar3.zd2;

public class Main {
    public static void main(String[] args) {
        Fructs fructs = Fructs.valueOf("BANAN");
        System.out.println("fructs = " + fructs);
        switch (fructs){
            case APPLE, BANAN, ORANGE -> System.out.println("это " + fructs.name);
            default -> System.out.println("Неопознанный фрукт");
        }
        for (Fructs value : Fructs.values()) {
            System.out.println(value);
        }
    }
}
