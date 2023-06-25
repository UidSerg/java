package ru.gb.homeWorks.dz4;
/*
https://leetcode.com/problems/valid-parentheses/
Дана строка s, содержащая только символы '(', ')', '{', '}', '[' и ']', определите, является ли входная строка допустимой.
Входная строка допустима, если:
Открытые скобки должны быть закрыты скобками того же типа.
Открытые скобки должны быть закрыты в правильном порядке.
Каждая закрывающаяся скобка имеет соответствующую открытую скобку того же типа.
 */
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Zd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите скобки");
        String str = sc.nextLine();
        System.out.println(check(str));
        sc.close();
    }

    /**
     * проверяет в правильной ли последовательности открыты и закрыты скобки
     * @param str входящая строка
     * @return да или нет
     */
    public static boolean check(String str) {
        Deque<Character> list = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' ||
                    str.charAt(i) == '{' ||
                    str.charAt(i) == '[')
                list.add(str.charAt(i));
            else {
                if (list.isEmpty())
                    return false;
                else if (str.charAt(i) == ')' && list.getLast().equals('('))
                    list.pollLast();
                else if (str.charAt(i) == '}' && list.getLast().equals('{'))
                    list.pollLast();
                else if (str.charAt(i) == ']' && list.getLast().equals('['))
                    list.pollLast();
                else
                    return false;
            }
        }
        return list.isEmpty();
    }

}
