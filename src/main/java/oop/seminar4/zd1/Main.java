package oop.seminar4.zd1;

public class Main {
    public static void main(String[] args) {
        //1)	Создать класс - коробку (SimpleBox),
        // которая может хранить любые объекты.
        // Посмотреть с какими ошибками можно столкнуться и исправить данное решение на более подходящее(GenBox).
        SimpleBox intBox1 = new SimpleBox(10);
        SimpleBox intBox2 = new SimpleBox(20);
        int sum = (Integer) intBox1.getObj()+ (Integer) intBox2.getObj(); // каждый раз необходимо делать каст
        System.out.println("sum = " + sum);
        intBox2.setObj("10");
        if(intBox1.getObj() instanceof Integer && intBox2.getObj() instanceof Integer){
            int sum2 = (Integer) intBox1.getObj()+ (Integer) intBox2.getObj();
            System.out.println("sum2 = " + sum2);
        }
        GenBox<Integer> gen1 = new GenBox(10); //за счет предопределения код разрастается
        GenBox<Integer> gen2 = new GenBox(20);
        int sum3 = gen1.getObj()+ gen2.getObj();
        System.out.println("sum3 = " + sum3);
        // разрастается
        //gen1.setObj("10"); // ошибки на стадии компилсяции
    }
}
