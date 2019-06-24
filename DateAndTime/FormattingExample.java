import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.*;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingExample {
    public static void main(String[] args) {
        // System.out.println(DateTimeFormatter.ISO_TIME.format(LocalTime.now()));

        // System.out.println(DateTimeFormatter.ofPattern("dd-MM-yyyy").format(LocalDate.now()));
        // System.out.println(DateTimeFormatter.ofPattern("d '('E')' MMM YYYY").format(LocalDate.now()));
        // System.out.println(DateTimeFormatter.ofPattern("w'th week of' YYYY").format(LocalDate.now()));
        // System.out.println(DateTimeFormatter.ofPattern("EEEE, dd'th' MMMM, YYYY").format(LocalDate.now()));


        // System.out.println(DateTimeFormatter.ofPattern("h:mm").format(LocalTime.now()));
        // System.out.println(DateTimeFormatter.ofPattern("hh 'o''clock'").format(LocalTime.now()));
        // System.out.println(DateTimeFormatter.ofPattern("H:mm a").format(LocalTime.now()));
        // System.out.println(DateTimeFormatter.ofPattern("hh:mm:ss:SS").format(LocalTime.now()));
        // System.out.println(DateTimeFormatter.ofPattern("K:mm:ss a").format(LocalTime.now()));


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh.mm a");

        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.of(2016, Month.JANUARY, 1,6,0),ZoneId.of("Asia/Singapore"));

        System.out.println(zonedDateTime.format(dateTimeFormatter));

        ZonedDateTime zonedDateTime1 = zonedDateTime.withZoneSameInstant(ZoneId.of("Pacific/Auckland")).plusHours(10);

        System.out.println(zonedDateTime1.format(dateTimeFormatter));
    }
}