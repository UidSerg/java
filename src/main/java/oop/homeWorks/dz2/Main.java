package oop.homeWorks.dz2;

import java.util.ArrayList;
import java.util.List;

/*
1)Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.
2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
(для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
списку он препятствий не идет
 */
public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("R2D2",10.0, 0.5);

        Cat cat = new Cat("Мурзик",100.0, 1.5);

        Human human = new Human("Сергей",11500.0, 1.5);

        List<Object> subjects = new ArrayList<>();
        subjects.add(robot);
        subjects.add(cat);
        subjects.add(human);


        List<Object> obstacles = new ArrayList<>();
        Treadmill tr1 = new Treadmill("дорожка 1", 5.0);
        Treadmill tr2 = new Treadmill("дорожка 2", 1100.0);
        Treadmill tr3 = new Treadmill("дорожка 3", 10000.0);
        Wall wall1 = new Wall("стена 1",0.4);
        Wall wall2 = new Wall("стена 2",1.4);
        Wall wall3 = new Wall("стена 3",1.5);
        obstacles.add(tr1);
        obstacles.add(wall1);
        obstacles.add(tr2);
        obstacles.add(wall2);
        obstacles.add(tr3);
        obstacles.add(wall3);


        for (Object s:subjects) {

            for (Object o:obstacles) {
                if (o instanceof Wall){
                    System.out.println(((Wall) o).name + " высота: " + ((Wall) o).height);
                    if (s instanceof Robot){
                        if(((Robot) s).jump(((Wall) o).height) == 1){
                            System.out.println(((Robot) s).name+ " перепрыгнул");
                        }
                        else {
                            System.out.println(((Robot) s).name+ " не перепрыгнул");
                            break;
                        }
                    }
                    if (s instanceof Cat){
                        if(((Cat) s).jump(((Wall) o).height) == 1){
                            System.out.println(((Cat) s).name+ " перепрыгнул");
                        }
                        else {
                            System.out.println(((Cat) s).name+ " не перепрыгнул");
                            break;
                        }
                    }
                    if (s instanceof Human){
                        if(((Human) s).jump(((Wall) o).height) == 1){
                            System.out.println(((Human) s).name+ " перепрыгнул");
                        }
                        else {
                            System.out.println(((Human) s).name+ " не перепрыгнул");
                            break;
                        }
                    }
                }
                else {
                    System.out.println(((Treadmill) o).name+ " Длина: " + ((Treadmill) o).distance);
                    if (s instanceof Robot){
                        if(((Robot) s).run(((Treadmill) o).distance) == 1){
                            System.out.println(((Robot) s).name+ " Пробежал");
                        }else {
                            System.out.println(((Robot) s).name+ " сошел с дистанции");
                            break;
                        }
                    }
                    if (s instanceof Cat){
                        if(((Cat) s).run(((Treadmill) o).distance) == 1){
                            System.out.println(((Cat) s).name+ " Пробежал");
                        }else {
                            System.out.println(((Cat) s).name+ " сошел с дистанции");
                            break;
                        }
                    }
                    if (s instanceof Human){
                        if(((Human) s).run(((Treadmill) o).distance) == 1){
                            System.out.println(((Human) s).name+ " Пробежал");
                        }else {
                            System.out.println(((Human) s).name+ " сошел с дистанции");
                            break;
                        }
                    }
                }

            }
            System.out.println("---------------------");
        }
    }
}