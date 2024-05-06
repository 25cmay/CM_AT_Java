/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */
public class PartA {
public static void main(String[] args) {
    BaseballCard card1 = new BaseballCard("Caleb", 2006);
    BaseballCard card2 = new BaseballCard("Caleb", 2006);
    BaseballCard card3 = new BaseballCard("Fernando", 2010);

    System.out.println("Card 1: " + card1);
    System.out.println("Card 2: " + card2);
    System.out.println("Card 3: " + card3);

    System.out.println("Card 1 equals Card 2: " + card1.equals(card2)); 
    System.out.println("Card 1 equals Card 3: " + card1.equals(card3)); 
}
}