package oop.seminar1.zd2;

public class SafeAccount extends Account{
    private double percent;
    public SafeAccount(String owner, int number, double balance, double percent){
        super(owner, number, balance);
        this.percent = percent;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
    public void addInterest(){
        double result = getBalance()*this.percent/100;
        deposite(result);
}
    @Override
    public String toString() {
        return "SafeAccount{" +
                "percent=" + percent +
                '}';
    }
}
