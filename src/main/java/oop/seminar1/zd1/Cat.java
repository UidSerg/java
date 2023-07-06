package oop.seminar1.zd1;

public class Cat extends Animal{


    public Cat(String name) {
        super(name);

    }

    public Cat(String name, String color, Integer age) {
        super(name);
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if(age>0){
            this.age = age;
        } else {
            System.out.println("Не корректный возраст");
        }
    }

    //1) Создать класс Cat с полями: имя,цвет,кол-во лет. Поработать с полями напрямую

    private String color;
    private Integer age;

    //public Cat(String name, String color, Integer age) {
    //    this.name = name;
    //    this.color = color;
    //    this.age = age;
    //}
    @Override
    public void voice(){
        System.out.println("мяу- мявк");
}
}
