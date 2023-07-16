package oop.seminar4.zd2;

//	Создать коробку с числами(BoxWithNumber)
// и найти среднее значение(average) и сравнение средних(compareAverage).
public class Main {
    public static void main(String[] args) {
        BoxWithNumber<Integer> box1 = new BoxWithNumber(1,3,4,5);
        System.out.println("box1.average() = " + box1.average());
        BoxWithNumber<Float> box2 = new BoxWithNumber(1.6,3.0,4.4,5.4,6.4);
        System.out.println("box2.average() = " + box2.average());
        System.out.println("box1.compareAverage(box2) = " + box1.compareAverage(box2));
    }
}
