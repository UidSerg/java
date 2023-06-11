package ru.gb.seminars.seminar1;
/*
* psvm - мэин функция
* sout - вывод
* ctrl+a - выедлить все
* ctrl+alt+l - форматировать
* ctrl+alt+o - удаление неиспользуемых импортов
* alt+enter создать метод
 */

import java.util.Scanner;

public class Zd1 {
    public static void main(String[] args) {
        System.out.printf("Введите число: \n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Результат " + subtractProductAndSum(n));
        scanner.close();
    }

    /**
     * @apiNote Заданное целое число возвращает разность между произведением его цифр на сумму его цифр. n.
     * @param n входящее число
     * @return результат
     */
    private static int subtractProductAndSum(int n) {
        int sum = 0, pr = 1;
        while (n != 0){
            pr *= n % 10;
            sum += n % 10;
            n = n / 10;
        }
        return pr - sum;
    }
}