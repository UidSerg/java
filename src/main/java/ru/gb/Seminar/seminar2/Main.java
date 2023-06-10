package ru.gb.Seminar.seminar2;

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1,2,3);
        Vector vector2 = new Vector(1,5,1);
        /*
        vector.x=1;
        vector.y=2;
        vector.z=3;
        */

        System.out.println(vector2.vectorLength());
        System.out.println(vector1.scalarMulti(vector2));
        System.out.println(vector1.vectorMulti(vector2));
        vector1.vectorCos(vector2);
        System.out.println(vector1);
    }
}
