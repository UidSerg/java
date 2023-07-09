package oop.seminar2.zd1;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat("qwe", "asd", 21);
        //па полям
//        cat.name = "Тиша";
//        cat.color = "Black";
//        cat.age = 21;
        //инкапсулировали
//        cat.setName("Тиша");
//       cat.setColor("Black");
//        cat.setAge(31);
//        System.out.println("cat = " + cat);
//        cat.jump();
//        cat.voice();
//        cat.animalInfo();
        Animal[] catAndDog = {
                new Cat("qwe", "orange", 21),
                new Dog("bobik", "black", 21)
        };
        for (Animal o : catAndDog) {
            if (o instanceof Cat) {
                ((Cat) o).klubok();
            } else {
                System.out.println("Не кот!");
            }
            Animal cat = new Cat("qwffe", "orange", 21);
            ((Cat) cat).klubok();

        }
    }
}