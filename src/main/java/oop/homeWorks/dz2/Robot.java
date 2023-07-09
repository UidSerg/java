package oop.homeWorks.dz2;

public class Robot implements AllAction{
    String name;
    double runDistance;
    double jumpHeight;

    public Robot(String name, double runDistance, double jumpHeight) {
        this.name = name;
        if (runDistance > 50){
            this.runDistance = 50;
            System.out.println("максимальная дистанция бега не может быть больше 50 метров ");
        } else this.runDistance = runDistance;
        if(jumpHeight > 0.5){
            this.jumpHeight =0.5;
            System.out.println("Роботу максимально можно подпрыгнуть на 0.5 метров");
        } else this.jumpHeight = jumpHeight;
    }

    public Robot() {
    }

    @Override
    public int run(double distance) {
        int count=0;
        if(this.runDistance > distance) count=1;
        return count;
        //if(this.runDistance > distance) System.out.println("Робот Пробежал");
        //else System.out.println("Робот Сошел с дистанции");
        
    }

    @Override
    public int jump(double height) {
        int count=0;
        if(this.jumpHeight > height) count=1;
        return count;
        //if (this.jumpHeight >height) System.out.println("Робот перепрыгнул");
        //System.out.println("Робот Не смог перепрыгнуть");

    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", runDistance=" + runDistance +
                ", jumpHeight=" + jumpHeight +
                '}';
    }
}
