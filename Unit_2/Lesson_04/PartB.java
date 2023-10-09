import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        // Outputs
        int nTiles;
        int nBlackTiles;
        int nWhiteTiles;
        double gap;

        // Inputs
        final double TILE_WIDTH = 5.0;
        System.out.print("Enter your wall width in inches: ");
        double wallWidth = in.nextInt();
        
        
        // Calculate
        nTiles = (int)(wallWidth / TILE_WIDTH);
        if (nTiles % 2 == 0) {
            // Decrease number of tiles by 1
            nTiles = nTiles - 1;        
        }
        // Space Covered with tiles
        gap = wallWidth - nTiles * TILE_WIDTH;

        // Gap on either side
        gap = gap / 2.0;

        // White tiles
        nWhiteTiles = nTiles / 2;

        // Black tiles
        nBlackTiles = nWhiteTiles + 1;


        System.out.printf("wall width = %.01f%n", wallWidth);
        System.out.printf("num tiles = %d%n", nTiles);
        System.out.printf("num white tiles = %d%n", nWhiteTiles);
        System.out.printf("num black tiles = %d%n", nBlackTiles);
        System.out.println("gap = " + gap);

    }
}


