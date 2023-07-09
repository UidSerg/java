package oop.seminar2.zd2;
/*	Создать классы Собака, Кот,Домашний Кот, Тигр, Животное
	Животные могут бежать и плыть. В качестве аргумента каждому методу передается длина препятствия.
	У каждого животного есть ограничения на действия (бег: кот — 200 м, собака — 500 м; плавание: кот — не умеет плавать, собака — 10 м). Результатом выполнения действия будет печать в консоль.
	 Например: dogBobik.run(150); -> 'Бобик пробежал 150 м'.
	Создать один массив с животными и заставить их по очереди пробежать дистанцию и проплыть.
	 Добавить подсчет созданных Домашних Котов, Тигров, Собак, Животных.
*/
public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new HomeCat("Barsik",20),
                new Tiger("Tigra", 50),
                new Dog("Sdarik", 150, 20),
                new Cat("Myrz", 25)
        };
        for (Animal animal:animals ) {
            animal.run(30);
            animal.swim(10);
            System.out.println("Animal.count = " + Animal.count);
            System.out.println("Dog.count = " + Dog.count);
            System.out.println("Cat.count = " + Cat.count);
            System.out.println("HomeCat.count = " + HomeCat.count);
            System.out.println("Tiger.count = " + Tiger.count);
        }
    }
}
