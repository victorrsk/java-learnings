package datetime;

import java.time.*;

public class UtcToLocal {
    static void main(String[] args) {
        Instant instant = Instant.now();
        Instant instant1 = Instant.parse("2022-02-01T01:00:00Z");
        // will get the current LocalDateTime based on the instant now and the time zone
        System.out.println(instant);
        System.out.println(LocalDate.ofInstant(instant1, ZoneId.systemDefault()));
        System.out.println(LocalDateTime.ofInstant(instant1, ZoneId.systemDefault()));
        System.out.println(LocalDateTime.ofInstant(instant1, ZoneId.of("Asia/Tokyo")));
    }
}
