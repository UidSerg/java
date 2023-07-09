package oop.seminar2.zd2;

public class Dog extends Animal{
    static int count;
    int runDistans;
    int swimDistans;

    public Dog(String name, int runDistans, int swimDistans) {
        super(name);
        if (runDistans > 500) {
            this.runDistans=500;
            System.out.println("Ввод не коректен установленно максимальное значение");
        } else {this.runDistans=runDistans;}
        if (swimDistans > 10) {
            this.swimDistans =10;
            System.out.println("Ввод не коректен установленно максимальное значение");
        } else {this.swimDistans =swimDistans;}
        count++;
    }

    public Dog(int runDistans, int swimDistans) {
        this.runDistans = runDistans;
        this.swimDistans = swimDistans;
    }

    @Override
    public void run(int distans) {
        if(distans>runDistans){
            System.out.println(super.name + "  Не пробежит");
        }else {System.out.println(super.name + "  пробежит");}

    }

    @Override
    public void swim(int distans) {
        if(distans>swimDistans){
            System.out.println(super.name + "Не проплывет");
        }else {System.out.println(super.name + "проплывет");}
    }
}
