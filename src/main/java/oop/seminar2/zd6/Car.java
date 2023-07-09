package oop.seminar2.zd6;

public class Car implements Transport{

    @Override
    public void start() {
        System.out.println("машина поехал");
    }

    @Override
    public void stop() {
        System.out.println("машина остановился");

    }
}
