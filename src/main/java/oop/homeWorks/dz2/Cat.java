package oop.homeWorks.dz2;

public class Cat implements AllAction{
    String name;
    double runDistance;
    double jumpHeight;

    public Cat(String name, double runDistance, double jumpHeight) {
        this.name = name;
        if (runDistance > 1000){
            this.runDistance = 1000;
            System.out.println("максимальная дистанция бега не может быть больше 1000 метров ");
        } else this.runDistance = runDistance;
        if(jumpHeight > 2.0){
            this.jumpHeight =2.0;
            System.out.println("Коту максимально можно подпрыгнуть на 2.0 метров");
        } else this.jumpHeight = jumpHeight;
    }

    public Cat() {
    }

    @Override
    public int run(double distance) {
        int count=0;
        if(this.runDistance > distance) count=1;
        return count;
        //if(this.runDistance > distance) System.out.println(this.name +" Пробежал");
        //else System.out.println(this.name + " Сошел с дистанции");

    }

    @Override
    public int jump(double height) {
        int count=0;
        if(this.jumpHeight > height) count=1;
        return count;
        //if (this.jumpHeight >height) System.out.println(this.name + " перепрыгнул");
        //System.out.println(this.name + " Не смог перепрыгнуть");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", runDistance=" + runDistance +
                ", jumpHeight=" + jumpHeight +
                '}';
    }
}
