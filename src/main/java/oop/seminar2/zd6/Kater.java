package oop.seminar2.zd6;

public class Kater implements Transport{
    @Override
    public void start() {
        System.out.println("катер поехал");
    }

    @Override
    public void stop() {
        System.out.println("катер остановился");

    }
}
