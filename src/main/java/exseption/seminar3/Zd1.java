package exseption.seminar3;
/*
Создайте метод doSomething(), который может быть источником одного из
типов checked exceptions (тело самогометода прописывать не обязательно).
Вызовите этот метод из main и обработайте в нем исключение, которое
вызвалметод doSomething().
*/
public class Zd1 {
    public static void main(String[] args) { // или без try-catch тогда 'throws Exception' после  'args)'
        try {
            doSomething();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void doSomething() throws Exception {

    }
}
