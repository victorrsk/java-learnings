package datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAmount;

public class DateTimeTest {
    static void main(String[] args) {
        // getting date-time
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant dateTimeUtc = Instant.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(dateTimeUtc);

        // parsing
        LocalDate dateParsed = LocalDate.parse("2026-12-19");
        System.out.println("------------------------------------------");
        // dia/mes/ano
        // formatters
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd MM yyyy");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("MM yyyy dd :::: HH:ss:mm");

        LocalDate dateFormatted = LocalDate.parse("20 01 2025", formatter2);
        LocalDateTime dateTimeFormatted = LocalDateTime.parse("02 2007 19 :::: 14:50:30", formatter3);

        System.out.println(dateFormatted);
        System.out.println(dateTimeFormatted);
        System.out.println("------------------------------------------");

        LocalDateTime dateTimeOf = LocalDateTime.of(2020, 12, 19, 17, 30, 30);
        System.out.println(dateTimeOf);
        System.out.println("------------------------------------------");

        String dateTimeIso = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss"));
        System.out.println(dateTimeIso);
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM yyyy HH dd mm:ss")));
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-yyyy MM/MM dd-dd")));
        System.out.println("------------------------------------------");
        System.out.println(LocalDateTime.now());
        System.out.println(Instant.now());
        System.out.println("------------------------------------------");

        Period period = Period.between(LocalDate.now(), LocalDate.of(2026, 3, 31));
        System.out.println(period.getDays());
    }
}
