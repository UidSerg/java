package exseption.seminar3.zd3;

import exseption.seminar3.zd3.Zd3.NotFile;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Zd3.NotFile {
        try {
            int a = 5/0;
        } catch (ArithmeticException e) {
            try {
                throw new Zd3.DivBuZero();
            } catch (Zd3.DivBuZero ex){
                System.out.println(ex.getMessage());
            }

        }
        int i = 0;
        try {
            Integer[] array = {1,2,3,4,null,6,7,8,9,0};
            for (; i < array.length ; i++) {
                System.out.println(array[i]);
                array[i]++;
            }
        }catch (NullPointerException e){
            try {
                throw new Zd3.NullPointerArray(i);
            } catch (Zd3.NullPointerArray ex){
                System.out.println(ex.getMessage());
            }

        }



        String path = "eyrtuyewtruyew.txt";
        try (FileReader fr = new FileReader(path)){
            int a = 5;
        } catch (FileNotFoundException e){
            try{
                throw  new NotFile(path);
            } catch (NotFile ex){
                System.out.println(ex.getMessage());
            }

        }
        catch (IOException e){
            e.getMessage();
        }
    }
}
