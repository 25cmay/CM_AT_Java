//Caleb May
//AT Java
//Mr. Eng
public class PartA {
    public static void main(String[] args) throws Exception {
        // Amount of cans in a pack
        int cansPerPack = 6;
        // The volume of the cans is constant
        final double CAN_VOLUME = 0.355;
        // The bottle volume is a constant
        final double BOTTLE_VOLUME = 2.0;
        // Caluclate pack volume
        double packVolume = cansPerPack * CAN_VOLUME;
        // Calculate the volume of a pack and a bottle
        double packandbottle = packVolume + BOTTLE_VOLUME;

        // Display the volume of cans in a pack
        System.out.println("The total volume of the cans in a pack is " + packVolume);
        // Display the volume of a pack and a bottle
        System.out.println("The total volume of a pack and a bottle is "+ packandbottle);

        
    }
}
