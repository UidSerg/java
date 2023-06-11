package ru.gb.seminars.seminar3.ex2;
/*
2.	Дан массив объектов: фамилия студента, номер группы, размер стипендии,
 баллы по 3 предметам. Определить стипендии студентов,
 фамилии которых заканчиваются на «ова», при четной сумме баллов.
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Study study1 = new Study("Иванов ", 23, 1000, List.of(3, 5, 4));
        Study study2 = new Study("Петрова", 23, 1500, List.of(4, 3, 4));
        Study study3 = new Study("Сидорова", 23, 1300, List.of(5, 6, 4));
        ArrayList<Study> students = new ArrayList<>();
        students.add(study1);
        students.add(study2);
        students.add(study3);
        for (Study student : students) {
            int sum = sumScores(student.getScores());
            if (student.getName().endsWith("ова") && sum % 2 == 0) {
                System.out.println("student = " + student.getSalary());
            }

        }
    }

    private static int sumScores(List<Integer> scores) {
        int sum = 0;
        for (Integer score : scores) {
            sum += score;
        }
        return sum;
    }
}
