package exseption.dz2;

import java.util.Scanner;
//Разработайте программу, которая выбросит Exception,
// когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Zd4 {
    public static void main(String[] args) {
        NoEmpty();
    }

    private static void NoEmpty() {
        try {
            System.out.println("Введете строку: ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            if(str.length() ==0){
                throw new RuntimeException("null str");
            }
            System.out.println("Ваша строка:  " + str);
        }
        catch (RuntimeException e) {
            System.out.println("Пустые строки вводить нельзя!!");
            NoEmpty();
        }

    }
}
