package oop.seminar2.zd6;

public class Skate implements Transport {
    @Override
    public void start() {
        System.out.println("скейт поехал");
    }

    @Override
    public void stop() {
        System.out.println("скейт остановился");

    }
}
