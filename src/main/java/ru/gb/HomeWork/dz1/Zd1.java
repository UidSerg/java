package ru.gb.HomeWork.dz1;

import java.util.Scanner;

/*
 * https://leetcode.com/problems/reverse-words-in-a-string/
 * Учитывая входную строку s, измените порядок слов в обратном порядке.
 * Слово определяется как последовательность символов без пробелов.
 * Слова в s будут разделены по крайней мере одним пробелом.
 * Возвращает строку слов в обратном порядке, объединенную одним пробелом.
 * Обратите внимание, что s может содержать начальные или конечные пробелы или несколько пробелов между двумя словами.
 * Возвращаемая строка должна содержать только один пробел, разделяющий слова.
 * Не включайте никаких дополнительных пробелов.
 */
public class Zd1 {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase(); //Сразу переводим все в нижний регистр
        str = str.replaceAll("\\s+", " "); // удаляем несколько пробелов
        String [] arr = str.split(" "); //разделяем по пробелу
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[arr.length-1-i]+" ");
        }
    }
}

