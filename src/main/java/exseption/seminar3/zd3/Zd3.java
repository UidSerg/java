package exseption.seminar3.zd3;

import java.io.FileNotFoundException;

/*
Создайтеклассисключения, который будет выбрасываться при делениина
0. Исключениедолжно отображать понятноедля пользователя сообщение
об ошибке.
2. Создайтеклассисключений, котороебудет возникатьпри обращении к
пустому элементув массиве ссылочного типа. Исключениедолжно
отображать понятноедля пользователя сообщениеоб ошибке
3. Создайтеклассисключения, котороебудет возникатьпри попытке открыть
несуществующий файл. Исключение должно отображать понятное для
пользователясообщение об ошибке
 */
public class Zd3 {
   static class DivBuZero extends ArithmeticException {
       public DivBuZero(){
           super("Деление на 0 запрещено");
       }
    }

   static class NullPointerArray extends NullPointerException{
       public NullPointerArray(int index){
           super("Обращение к пустому элементу массива запрещено!, индекс элемента: " +index);
       }
    public NullPointerArray(){
           super("Обращение к пустому элементу массива запрещено!");
    }
   }
   static class NotFile extends FileNotFoundException{
       public NotFile(String path){
           super("Открыть несуществующий файл нельзя ваш пусть к файлу: " +path);
       }
       public NotFile(){
           super("Открыть несуществующий файл нельзя");
       }
   }
}
