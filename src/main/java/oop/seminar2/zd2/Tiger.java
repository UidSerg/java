package oop.seminar2.zd2;

public class Tiger extends Cat{
    static int count;

    public Tiger(String name, int runDistans) {
        super(name, runDistans);
        count++;
    }
}
