package oop.homeWorks.dz2;

public class Human implements AllAction{
    String name;
    double runDistance;
    double jumpHeight;

    public Human(String name, double runDistance, double jumpHeight) {
        this.name = name;
        if (runDistance > 20000){
            this.runDistance = 20000;
            System.out.println("максимальная дистанция бега не может быть больше 20 000 метров ");
        } else this.runDistance = runDistance;
        if(jumpHeight > 1.5){
            this.jumpHeight =1.5;
            System.out.println("Человеку максимально можно подпрыгнуть на 1.5 метров");
        } else this.jumpHeight = jumpHeight;
    }

    public Human() {
    }


    @Override
    public int run(double distance) {
        int count=0;
        if(this.runDistance > distance) count=1;
        return count;

        //if(this.runDistance > distance) System.out.println(this.name + "Пробежал");
        //else System.out.println(this.name + "Сошел с дистанции");

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
        return "Human{" +
                "name='" + name + '\'' +
                ", runDistance=" + runDistance +
                ", jumpHeight=" + jumpHeight +
                '}';
    }
}
