
import java.time.*;
import java.util.*;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        LocalDate date = LocalDate.of(year, month, day);

        System.out.println(
            date.getDayOfWeek().toString()
        );

        sc.close();
    }
}

