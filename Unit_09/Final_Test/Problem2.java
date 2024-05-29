public class Problem2 {
    public static void main(String[] args) {
        String phrase = "Derryfield";
        int i = 0;
        while (i < phrase.length()) {
            System.out.print(phrase.substring(i, i + 1));
            if (i + 1 < phrase.length()) {
                System.out.print("|");
            }
            i = i + 1;
        }
        System.out.println();
    }
}
