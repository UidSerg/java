package oop.seminar5;

public class Outer2 {
    public Outer2(int outerValue) {
        this.outerValue = outerValue;
    }

    public Outer2() {
    }

    /**
     * внутренний класс начало
     */
    static class Inner {
        int innerValue;
        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }

        public void innerMethod(){
            System.out.println(innerValue);
            //System.out.println(outerValue);
            //outerMethod();
            //innerMethod();
        }
    }
    //todo конец внутреннего класса
    int outerValue;
    public  void  outerMethod(){
        System.out.println(outerValue);
        //System.out.println(innerValue);
        //outerMethod();
        //innerMethod();
    }

    public static void main(String[] args) {
        Inner inner = new Inner(10);
        System.out.println("ВВедите координату ");
        class Point{
            int x;

            public Point(int x) {
                this.x = x;
            }

            @Override
            public String toString() { // локальный класс
                return "Point{" +
                        "x=" + x +
                        '}';
            }
        }
        Point point = new Point(3);
        System.out.println("point = " + point);
    }
}