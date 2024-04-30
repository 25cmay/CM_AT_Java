package util;

public abstract class Account {
    private int id;
    private double balance;
    public Account(int id, double initBalance) {
        this.id = id;
        this.balance = initBalance;
    }
    public int getID() {
        return id;
    }

    public void setID(int newID) {
        this.id = newID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public abstract void deductFees();
}
