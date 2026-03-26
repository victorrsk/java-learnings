package datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class MathWithDateTime {
    static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime dateTime2 = LocalDateTime.now().plusDays(10);

        LocalDate date = LocalDate.now();
        LocalDate date1 = LocalDate.now().plusDays(10);

        System.out.println(dateTime.plusYears(1));
        System.out.println(dateTime.plusDays(2));
        System.out.println(dateTime.plusMonths(2));

        Duration period = Duration.between(dateTime, dateTime2);
        System.out.println(period.toDays());
        System.out.println(period.toHours());

        Duration period1 = Duration.between(date, date1);
        System.out.println(period1.toDays());
    }
}
