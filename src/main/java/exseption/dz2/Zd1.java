package exseption.dz2;

import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.
public class Zd1 {
    public static void main(String[] args) {
        InToFloat();
    }

    private static void InToFloat() {
        try {
            System.out.print("Введете дробное число: ");
            Scanner sc = new Scanner(System.in);
            double number = Double.parseDouble(sc.nextLine());
            System.out.println("Введенное дробное число:  " + number);
        }
        catch (NumberFormatException e) {
            System.out.println("Введено неверное число!");
            InToFloat();
        }
    }
}