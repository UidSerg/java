package oop.seminar1.zd2;

public class CreditAccount extends Account{
    private double degreePercent;

    public CreditAccount(String owner, int number, double balance, double degreePercent) {
        super(owner, number, balance);
        this.degreePercent=degreePercent;
    }

    public double getDegreePercent() {
        return degreePercent;
    }

    public void setDegreePercent(double degreePercent) {
        this.degreePercent = degreePercent;
    }
    public  void calcInterest(){
        double result =getBalance()*degreePercent/100;
        withdraw(result);
    }
}
