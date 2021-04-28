package Practice;

public class Bank {
    private double balance, rate;

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getRate() {
        return this.rate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double calculateInterest(){
        return balance * (rate/1200);
    }

    @Override
    public String toString() {
        return "Balance= " + balance + "$" + ",Rate= " + rate + "% " + ",Interest= " +  this.calculateInterest();
    }
}
