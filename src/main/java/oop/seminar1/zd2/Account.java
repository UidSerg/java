package oop.seminar1.zd2;

public class Account {

    private String owner;
    private int number;
    private double balance;

    public Account() {
    }

    public Account(String owner, int number, double balance) {
        this.owner = owner;
        this.number = number;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposite(double amount){
       this.balance+=amount;
    }
    public void withdraw(double amount){
        if(balance>=amount){
        this.balance-=amount;}
        else {
            System.out.println("Недостаточно стредств\n Отстаток на счете:" +this.balance);
        }
    }
    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }

}
