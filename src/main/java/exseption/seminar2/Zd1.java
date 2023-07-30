package exseption.seminar2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Запишите в файл следующие строки:
//Анна=4
//Елена=5
//Марина=6
//Владимир=?
//Константин=?
//Иван=4
//Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap, если
//студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных, если сохранено
//значение ?, заменить его на соответствующее число.Если на каком-то месте встречается символ, отличный от
//числа или ?, бросить подходящее исключение.Записать в тот же файл данные с замененными символами ?
public class Zd1 {
    public static void main(String[] args) {
        readToArr("text.txt");
    }
    public static List<String[]> readToArr(String filePatch){
        List<String[]> str = new ArrayList<>();
        try {
            FileReader file = new FileReader(filePatch);
            BufferedReader bufReader = new BufferedReader(file);
            String line;
            while ((line = bufReader. readLine()) != null){
                str.add(line.split("="));
                for (String[] strings:str ) {
                    System.out.println(String.join("", strings));
                }
            }

        }
        catch (IOException e){
            System.out.println("Ошибка при чтении файла " + filePatch);
        }
        return str;
    }
}
