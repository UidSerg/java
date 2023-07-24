package oop.homeWorks.dz5.servise;


import oop.homeWorks.dz5.data.Complex;

public class LogCalc implements Func {

    private Func decorated;
    private Logs logs;


    public LogCalc(Func decorated, Logs logs) {
        this.decorated = decorated;
        this.logs = logs;
    }

    public LogCalc() {
    }

    @Override
    public void sum(Complex complex, Complex complex2) {
        logs.log("вызов метода sum c аргументом " +complex+ ", "+complex2);
        decorated.sum(complex, complex2);

    }

    @Override
    public void proizv(Complex complex, Complex complex2) {
        logs.log("вызов метода произведения c аргументом " +complex+ ", "+complex2);
        decorated.proizv(complex, complex2);
    }

    @Override
    public void dell(Complex complex, Complex complex2) {
        logs.log("вызов метода деления c аргументом " +complex+ ", "+complex2);
        decorated.proizv(complex, complex2);
    }
    @Override
    public String toString() {
        return "LogCalc{" +
                "decorated=" + decorated +
                ", logs=" + logs +
                '}';
    }

}
