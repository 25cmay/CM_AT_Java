import java.util.ArrayList;

import util.*;

public class PartC {
    public static void main(String[] args) {
        ArrayList<Measurable> animals = new ArrayList<>();
        animals.add(new Animal("Roy", 1200));
        animals.add(new Animal("Dale", 1000));
        animals.add(new Animal("Silver", 1100));

        System.out.println("The average weight of the animal is" + Measurable.calcAvg(animals));
    
        ArrayList<Measurable> accounts = new ArrayList<>();
        accounts.add(new BankAccount(1, 1000));
        animals.add(new BankAccount(2, 100));
        animals.add(new BankAccount(3, 100));

        System.out.println("The average balance of the accounts is" + Measurable.calcAvg(accounts));

        
    }
    
}
