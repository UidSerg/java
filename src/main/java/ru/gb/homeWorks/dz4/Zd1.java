package ru.gb.homeWorks.dz4;
/*
1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
Пример
1 -> 2->3->4
Вывод:
4->3->2->1
 */
import java.util.*;

public class Zd1 {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("введите колличество элементов");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            deque.add(sc.nextInt());
        }
        System.out.println("deque = " + deque);
        System.out.println("развернутый");
        while (deque.size() >0){
            System.out.print(deque.pollLast() + " ");
        }
        sc.close();
    }

}

