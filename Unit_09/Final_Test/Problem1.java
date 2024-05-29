/* Caleb May
 Mr. Eng
*/
import java.util.ArrayList;

public class Problem1 {
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<String>();

        names.add("Steve");
        names.add("Tracy");
        names.add("James");
        names.add("Elisa");
        names.add("Michelle");
        names.add("Jeremiah");

        int i = 0;
        int length = 0;
        double average = 0;
        int maxlen = 0;
        int count = 0;

        while (names.size() - 1 > i){
            String name = names.get(i);
            length = name.length();
            average = average + length;
            count += 1;
            if (length > maxlen) {
                maxlen = length;
            }
            i++;

        }
        int j = 0;
        while (j < names.size() - 1){
            String name = names.get(j);
            System.out.print(names.get(j) + "(" + name.length() + ")");
            if (name.length() == maxlen) {
                System.out.println("<= MAX LENGTH");
            }
            System.out.println();
            j++;
        }
        System.out.println("--------------");
        System.out.println("THe average name length is" + average/count + "characters");
    }
}



