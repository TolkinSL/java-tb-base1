package horst.dev_02;

import java.time.LocalDate;

public class Calendar {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        System.out.printf("Month: %d\n",month);
        System.out.printf("Day: %d\n", today);

        date = date.minusDays(today - 1);
        System.out.println(date);
        month = date.getMonthValue();
        today = date.getDayOfMonth();
        System.out.printf("Month: %d\n",month);
        System.out.printf("Day: %d\n", today);
    }
}
