import java.util.ArrayList;

import util.*;

public class PartB {
    public static void main(String[] args) {
        ArrayList<Measurable> animals = new ArrayList<>();
        Animal animal1 = new Animal("Roy", 1200);
        Animal animal2 = new Animal("Dale", 1000);
        Animal animal3 = new Animal("Silver", 1100);

        
        System.out.println(animal2.compareTo(animal1));
        System.out.println(animal3.compareTo(animal2));
    
        animal2.compareTo(animal1);
        animal3.compareTo(animal2);

        
    }
    
}
