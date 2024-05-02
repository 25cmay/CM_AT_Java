/* Caleb May
AT Java
Mr. Eng
 */
// Import Needed things
import java.time.LocalDate;
import java.time.DayOfWeek;

public class PartA {
    public static void main(String[] args) throws Exception {
        // Local date object
        LocalDate rightNow = LocalDate.now();

        // Find today date and day
        int today = rightNow.getDayOfMonth();

        // Find Start date of month
        LocalDate date = rightNow.plusDays(-today + 1);

        // Day of week start day
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int dayNumber = dayOfWeek.getValue();
        
        // Print Header
        System.out.println("MON TUE WED THU FRI SAT SUN");
        System.out.println("---------------------------");

        //Current Month
        int currMonth = rightNow.getMonthValue();

        // Begin Displaying
        for (int i = 1; i < dayNumber; i++){
            System.out.print("    ");
        }

        // Loop
        while (date.getMonthValue() == currMonth) {
            System.out.printf("%3d", date.getDayOfMonth());

            // Today print
            if (date.getDayOfMonth() == rightNow.getDayOfMonth()) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            
            // New line
            if (dayNumber == 7) {
                System.out.println();
            }
            // New number
            date = date.plusDays(1);

            dayOfWeek = date.getDayOfWeek();
            dayNumber = dayOfWeek.getValue();
        }
            System.out.println();






    }
}





