package util;

public class Executive extends Manager {
    private double bonus;
    private double shares;

    public Executive(String name, double salary, double bonus, double shares) {
        super(name, salary, bonus);
        this.bonus = bonus;
    }

    public double getShares() {
        return shares;
    }

    public void setShares(double newShares) {
        shares = newShares;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double newBonus) {
        bonus = newBonus;
    }

    public double getAnnualIncome() {
        return getSalary() + getBonus();
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.printf("  Bonus = $%,.2f%n", bonus);
    } 
     
}