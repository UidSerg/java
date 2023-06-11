package ru.gb.seminars.seminar3.ex3;
/*
Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах),
 его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.).
  Найти:
- количество кубиков желтого цвета и их суммарный объем;
           - количество деревянных кубиков с ребром 3 см
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cube cube1 = new Cube(2, "желтый", "деревянный");
        Cube cube2 = new Cube(3, "красный", "металлический");
        Cube cube3 = new Cube(4, "зеленый", "металлический");
        Cube cube4 = new Cube(2, "желтый", "стальной");
        List<Cube> cubeList = new ArrayList<>();
        cubeList.add(cube1);
        cubeList.add(cube2);
        cubeList.add(cube3);
        cubeList.add(cube4);
        System.out.println("cubeList = " + cubeList);
        Integer k = 0;
        Integer volume = 0;
        Integer kWood = 0;
        for (Cube cube : cubeList) {
            if (cube.getColor().equals("желтый")) {
                k++;
                volume += cube.volumeCube();
            }
            if (cube.getMaterial().equals("деревянный") && cube.getSize() == 3) {
                kWood++;
            }
        }
        System.out.println("k = " + k);
        System.out.println("volume = " + volume);
        //System.out.println("unicumListCube(cubeList) = " + unicumListCube(cubeList));
    }

/*
    /**
     * @param cubeList входной список кубов
     * @return уникальная коллекция
     */
   // private static Collection unicumListCube(List<Cube> cubeList) {
     //   return new HashSet(cubeList);
    //}

}
