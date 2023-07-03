package ru.gb.seminars.seminar6;
//4) Напишите интерфейс Converter для конвертации из градусов по Цельсию в
//Кельвины, Фаренгейты. У классов наследников необходимо переопределить метод интерфейса,
// для валидного перевода величин. Метод для конвертации назовите "convertValue".
public class Zd4 {
    public static void main(String[] args) {
    double temp = 1.0;
        System.out.println("tepm Cel= " + new Cels().convertValue(temp));
        System.out.println("tepm Kel= " + new Kelvin().convertValue(temp));
        System.out.println("tepm Far= " + new Faren().convertValue(temp));
    }
}
