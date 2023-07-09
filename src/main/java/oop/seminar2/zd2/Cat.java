package oop.seminar2.zd2;

public class Cat extends Animal{
    static int count;
    int runDistans;


    public Cat(String name, int runDistans) {
        super(name);
        if (runDistans > 200) {
            this.runDistans=200;
            System.out.println("Ввод не коректен установленно максимальное значение");
        } else {this.runDistans=runDistans;}
        count++;
    }


    @Override
    public void run(int distans) {
        if(distans>runDistans){
            System.out.println(super.name + "Не пробежит");
        }else {System.out.println(super.name + "пробежит");}
    }

    @Override
    public void swim(int distans) {
            System.out.println(super.name + "не умеет плавать");

    }
}
