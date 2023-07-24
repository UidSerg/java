package oop.homeWorks.dz5.servise;

public class ViewLogs implements Logs{
    @Override
    public void log(String message) {
        System.out.println("LOG"+message);
    }
}
