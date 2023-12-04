class Die {

    // member variables
    private int faceValue;

    // consructors
    public Die() {
       //initialize the do 
       faceValue = 1;
    }

    public Die (int newValue) {
        faceValue = newValue;
    }

    // methods
    public int getFaceValue() {
        return faceValue;
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
    public static void main(String[] args ) {
        Die die = new Die(3);

        // print current value of the die
        int answer = die.getFaceValue();
        System.out.println("The die is equal to " + answer);

        // change value
        die.setFaceValue(6);
        answer = die.getFaceValue();
        System.out.println("The die is equal to " + answer);
    }



}