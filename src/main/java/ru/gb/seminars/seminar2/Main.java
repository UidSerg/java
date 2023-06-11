package ru.gb.seminars.seminar2;

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1,2,3);
        Vector vector2 = new Vector(1,5,1);
        /*
        vector.x=1;
        vector.y=2;
        vector.z=3;
        */

        System.out.println("Вектор 1 = " + vector1);
        System.out.println("Вектор 2 = " + vector2);
        System.out.println("Длина вектора vector2 = " + vector2.vectorLength());
        System.out.println("скалярное произведение vector1 и vector2 = " +vector1.scalarMulti(vector2));
        System.out.println("Векторное произведение vector1 и vector2 = " +vector1.vectorMulti(vector2));
        System.out.println("Угол между векторами vector1 и vector2 = " +vector1.vectorCos(vector2));
        System.out.println("Сумма векторов vector1 и vector2 = " + vector1.vectorSum(vector2));
        System.out.println("Разность векторов vector1 и vector2 = " + vector1.vectorRazn(vector2));
    }
}
