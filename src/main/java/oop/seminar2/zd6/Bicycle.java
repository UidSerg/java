package oop.seminar2.zd6;

public class Bicycle implements Transport {

    @Override
    public void start() {
        System.out.println("велик поехал");
    }

    @Override
    public void stop() {
        System.out.println("велик остановился");

    }
}