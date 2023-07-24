package oop.seminar6.zd1;

public class JSONFormatter implements Formatter{
    @Override
    public void toFormat(ElectronBook book) {
        System.out.println("Форматировали " + book + " в JSON");
    }
}