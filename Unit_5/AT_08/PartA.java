class Die {

    // member variables
    private int faceValue;

    // consructors
    public Die() {
        // initialize the do
        this.roll();
    }

    public Die(int newValue) {
        faceValue = newValue;
    }

    // methods
    public int roll() {
        double number = Math.random();
        faceValue = (int) (number * 6 + 1);
        return faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void showFace() {
        String[] face = {};
        if (faceValue == 1) {
            String[] one = { " _______________",
                    "|               |",
                    "|               |",
                    "|               |",
                    "|       x       |",
                    "|               |",
                    "|               |",
                    "|_______________|" };
            face = one;
        } else if (faceValue == 2) {
            String[] two = { " _______________",
                    "|               |",
                    "|   x           |",
                    "|               |",
                    "|               |",
                    "|               |",
                    "|            x  |",
                    "|_______________|" };
            face = two;
        } else if (faceValue == 3) {
            String[] three = { " _______________",
                    "|               |",
                    "|  x            |",
                    "|               |",
                    "|       x       |",
                    "|               |",
                    "|            x  |",
                    "|_______________|" };
            face = three;
        } else if (faceValue == 4) {
            String[] four = { " _______________",
                    "|               |",
                    "|   x       x   |",
                    "|               |",
                    "|               |",
                    "|               |",
                    "|   x       x   |",
                    "|_______________|" };
            face = four;
        } else if (faceValue == 5) {
            String[] five = { " _______________",
                    "|               |",
                    "|   x       x   |",
                    "|               |",
                    "|       x       |",
                    "|               |",
                    "|   x       x   |",
                    "|_______________|" };
            face = five;
        } else if (faceValue == 6) {
            String[] six = { " _______________",
                    "|               |",
                    "|   x       x   |",
                    "|               |",
                    "|   x       x   |",
                    "|               |",
                    "|   x       x   |",
                    "|_______________|" };
            face = six;
        }

        for (String row:face) {
            System.out.println(row);
        }
    }

    public void setFaceValue(int newValue) {
        if (newValue > 0 && newValue < 7) {
            faceValue = newValue;
        } else {
            System.out.println("newValue must be from 1 to 6!");
        }
    }

}

public class PartA {
    public static void main(String[] args) {
        Die die = new Die();
        int answer;
        // print current value of the die
        for (int i = 0; i < 20; i++) {
            die.roll();
            answer = die.getFaceValue();
            System.out.println("The die is equal to " + answer);
            die.showFace();
        }

        // change value
        die.setFaceValue(6);
        answer = die.getFaceValue();
        System.out.println("The die is equal to " + answer);
        die.showFace();
    }

}