package exseption.dz3;

import java.io.*;
import java.util.Scanner;

/*
Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные пробелом:
Фамилия Имя Отчество датарождения номертелефона пол
Форматы данных:
фамилия, имя, отчество - строки
датарождения - строка формата dd.mm.yyyy
номертелефона - целое беззнаковое число без форматирования
пол - символ латиницей f или m.
 */
public class Main {
    public static void main(String[] args){
        Data_add();
        }
    public static void Data_add(){
        Boolean flag = false;
        while (flag == false) {
            System.out.println("Введите данные в формате:\n Фамилия Имя Отчество дата_рождения номер_телефона пол");
            Scanner scanner = new Scanner(System.in);
            String[] array_data = scanner.nextLine().split(" ");
            try {
                if (array_data.length != 6)
                    throw new NullPointerException("Введено неверное количество данных");
                if(!isAlpha(array_data[0]) | !isAlpha(array_data[1]) | !isAlpha(array_data[2]))
                    throw new NumberFormatException ("ФИО может содержать только буквы");
                if(array_data[3].split("\\.").length != 3)
                    throw new NullPointerException("Не верный формат даты! dd.mm.yyyy");
                if(array_data[3].split("\\.")[0].length() != 2 & array_data[3].split("\\.")[1].length() != 2 & array_data[3].split("\\.")[2].length() != 4)
                    throw new NumberFormatException ("неверный формат даты!");
                if (Integer.parseInt(array_data[3].split("\\.")[0]) > 31
                    | Integer.parseInt(array_data[3].split("\\.")[1]) > 12
                    | Integer.parseInt(array_data[3].split("\\.")[2]) > 2024)
                    throw new NumberFormatException ("Не верный формат дней 31/ месяцев 12 / лет до 2024 ");

                double n = Double.parseDouble(array_data[4]);

                if(!(array_data[5].toLowerCase().equals("f") | array_data[5].toLowerCase().equals("m")))
                    throw new NumberFormatException ("Пол может быть только f или m");

                if(writeFromArr(array_data)){
                    System.out.println("Сохранено");
                }
                else {
                    System.out.println("ошибка");
                }

                flag = true;

            } catch (NumberFormatException e){
                System.out.println(e.getMessage());
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }

        }
    }
    public static boolean isAlpha(String name) {

        char[] chars = name.toCharArray();
        for (char c : chars) {
            if(!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
    public static boolean writeFromArr (String[] data) {
        try {
            FileWriter file = new FileWriter(data[0]+".txt", true);
            file.append("<"+data[0] + "><" + data[1] + "><" + data[2] + "><" + data[3] + "><" + data[4] + "><" + data[5]+">");
            file.append('\n');
            file.flush();
            return true;
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла " + data[0]+".txt");
            return false;
        }
    }

}

