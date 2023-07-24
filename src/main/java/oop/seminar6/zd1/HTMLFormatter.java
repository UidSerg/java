package oop.seminar6.zd1;

public class HTMLFormatter implements Formatter {
    @Override
    public void toFormat(ElectronBook book) {
        System.out.println("Форматировали " + book + " в HTML");
    }
}