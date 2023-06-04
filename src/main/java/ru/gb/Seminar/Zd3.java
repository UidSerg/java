package ru.gb.Seminar;

import java.util.Scanner;

public class Zd3 {
    public static void main(String[] args){
        System.out.println("ВВедите строку ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("str = " + zadanie3(str));
        scanner.close();
    }

    /**
     * @apiNote Дана строка. Поменять местами ее половины
     * @param str входящая строка
     * @return результат
     */
    private static String zadanie3(String str) {
        String up = str.substring(0,str.length()/2);
        String down = str.substring(str.length()/2, str.length());
        return down+up;

    }

}
