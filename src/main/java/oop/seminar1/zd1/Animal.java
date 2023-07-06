package oop.seminar1.zd1;

public class Animal {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }
    public void animalInfo(){
        System.out.println("Животное "+name);
    }
    public void voice(){
        System.out.println("Животное "+name+" - сказало");
    }
    public void jump(){
        System.out.println("Животное "+name+" - подпрыгнуло");
    }

}
