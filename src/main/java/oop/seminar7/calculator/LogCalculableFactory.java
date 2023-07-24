package oop.seminar7.calculator;

public class LogCalculableFactory implements ICalculableFactory{
    public LogCalculableFactory(Loggable logger) {
        this.logger = logger;
    }

    private Loggable logger;
    @Override
    public Calculable create(int primaryArg) {
        return new LogCalculator(new Calculator(primaryArg), logger);
    }
}
