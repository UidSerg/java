package exseption.seminar3.zd2;

import exseption.seminar3.zd2.CountTask2;

public class Main {
    public static void main(String[] args) {
        try (CountTask2 count = new CountTask2()){
            count.add();
            count.add();
            count.add();
            count.add();
            System.out.println(count.getCount());
            count.close();
            System.out.println(count.getCount());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
