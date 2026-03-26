package datetime;

import java.time.LocalDateTime;

public class GetDateTimeInfo {
    static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2026, 12, 19, 12, 30, 10);

        System.out.println(dateTime.getMonth());
        System.out.println(dateTime.getMonthValue());
        System.out.println(dateTime.getDayOfWeek());
    }
}
