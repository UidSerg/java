package oop.seminar5;

public class Outer {
    public Outer(int outerValue) {
        this.outerValue = outerValue;
    }

    public Outer() {
    }

    /**
     * внутренний класс начало
     */
    class Inner {
        int innerValue;
        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }

        public void innerMethod(){
            System.out.println(innerValue);
            System.out.println(outerValue);
            outerMethod();
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
        Inner inner = new Outer().new Inner(10);

    }
}
