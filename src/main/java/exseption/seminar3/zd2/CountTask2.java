package exseption.seminar3.zd2;

import java.io.IOException;

/*
Создайте класс Счетчик, у которого есть метод add(), увеличивающий
значение внутреннейint переменнойна 1.Сделайте так, чтобы с объектом
такого типа можно было работать в блоке try-with-resources. Нужно бросить
исключение, еслиработа с объектом типа счетчикбылане в ресурсномtry
и/или ресурс остался открыт.Подумайте какой тип исключения подойдет
лучше всего
 */
public class CountTask2 implements  AutoCloseable{
    private Integer count = 0;

    public CountTask2(Integer count) {
        this.count = count;
    }

    public CountTask2() {
    }

    public Integer getCount() throws IOException {
        checkClose();
        return  count;
    }
    public void add() throws Exception {
        checkClose();
        this.count++;
    }

    public void checkClose() throws IOException{
        if(this.count == null)
            throw new IOException("Экземпляр закрыт");
    }
    @Override
    public void close() throws Exception{
        this.count =null;
    }
}

