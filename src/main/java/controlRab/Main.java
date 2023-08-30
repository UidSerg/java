package controlRab;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Toy toy1 = new Toy(1,"мяч", 5, 11);
        Toy toy2 = new Toy(2,"машинка", 10, 18);
        Toy toy3 = new Toy(3,"самолет", 5, 16);
        Toy toy4 = new Toy(4,"медведь", 10, 15);
        Toy toy5 = new Toy(5,"конструктор", 3, 10);

        List<Toy> toys = new ArrayList<>();
        toys.add(toy1);
        toys.add(toy2);
        toys.add(toy3);
        toys.add(toy4);
        toys.add(toy5);

        System.out.println(" 1 - Каталог \n 2 - Розыгрыш\n 3 - Добавить игрушку\n 4 - История\n 0 - выход\n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n != 0) {
            switch (n) {
                case 1:
                    System.out.println("Ассортимент магазина:");
                    System.out.println("Назваине игрушки | количество");
                    for (Toy elem: toys) {
                        System.out.println(elem.getId()+". "+elem.getName()+" - "+elem.getCount()+"шт.");
                    }
                    break;
                case 2:
                    System.out.println("Розыгрыш одной случайной игрушки");
                    Random random = new Random();
                    int sum = 0;
                    for (Toy elem: toys) {
                        sum += elem.getRand();
                    }
                    System.out.println("сумма весов = " + sum);
                    int r= random.nextInt(sum);
                    System.out.println("random = " + r);
                    int tsize = toys.size();
                    System.out.println("колличество разных игрушек = " + tsize);
                    sum = 0;
                    for (Toy elem: toys) {
                        if(sum + elem.getRand() > r){
                            System.out.println("Вы выйграли: " + elem.getName());
                            writeFromArr (elem);
                            int count = elem.getCount();
                            if(count- 1 > 0 ){
                                elem.setCount(count-1);
                            }
                            else
                            {
                                toys.remove(elem);
                            }

                            break;
                        }
                        else
                        {
                            sum += elem.getRand();
                        }
                    }

                    break;
                case 3:
                    System.out.println("Добавление новой игрушки: ");
                    System.out.println("Название игрушки: ");
                    String name = sc.nextLine();
                    System.out.println("колличество: ");
                    int count = sc.nextInt();
                    System.out.println("Частота выпадения: ");
                    int rand = sc.nextInt();
                    int nid = toys.size()+1;
                    Toy ntoy = new Toy(nid, name, count,rand);
                    toys.add(ntoy);
                    break;
                case 4:
                    System.out.println("История розыгрышей: ");
                    List<String[]> winners = new ArrayList<>();
                    winners = readToArr("history.txt");
                    for (String[] strings:winners ) {
                        System.out.println(String.join("", strings));
                    }
                    break;
                case 0:
                    break;
            }
            System.out.println("----------------------\n 1 - Каталог \n 2 - Розыгрыш\n 3 - Добавить игрушку\n 4 - История\n 0 - выход\n");
            n = sc.nextInt();
            sc.nextLine();
        }

    }

    public static boolean writeFromArr (Toy elem) {
        try {
            FileWriter file = new FileWriter("history.txt", true);
            LocalDateTime dateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            file.append(elem.getName()+"|"+dateTime.format(formatter));
            file.append('\n');
            file.flush();
            return true;
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла history.txt");
            return false;
        }
    }
    public static List<String[]> readToArr(String filePatch){
        List<String[]> str = new ArrayList<>();
        try {
            FileReader file = new FileReader(filePatch);
            BufferedReader bufReader = new BufferedReader(file);
            String line;

            while ((line = bufReader.readLine()) != null){
                str.add(line.split("|"));
            }
        }
        catch (IOException e){
            System.out.println("Ошибка при чтении файла " + filePatch);
        }
        return str;
    }
}
