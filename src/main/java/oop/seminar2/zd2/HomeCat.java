package oop.seminar2.zd2;

public class HomeCat extends Cat{
    static int count;

    public HomeCat(String name, int runDistans) {
        super(name, runDistans);
        count++;
    }
}
