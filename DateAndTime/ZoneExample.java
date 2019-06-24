import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneExample {
    public static void main(String[] args) {
        // System.out.println(ZoneId.systemDefault());
        // System.out.println(ZoneId.getAvailableZoneIds().size());

        // ZoneId zoneId = ZoneId.of("Asia/Calcutta");

        // System.out.println(zoneId);

        // System.out.println(ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZoneId.systemDefault()));
        // System.out.println(ZonedDateTime.of(LocalDateTime.now(), ZoneId.systemDefault()));

        // ZoneId zoneId = ZoneId.of("Asia/Calcutta");
        // LocalDateTime localDateTime = LocalDateTime.now();
        // ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
        // System.out.println(zonedDateTime.getOffset());


        // ZonedDateTime zonedDateTimeSingapor = ZonedDateTime.of(LocalDateTime.of(2016,Month.JANUARY,1,6,0),ZoneId.of("Asia/Singapore"));

        // ZonedDateTime zonedDateTimeAuckland = zonedDateTimeSingapor.withZoneSameInstant(ZoneId.of("Pacific/Auckland"));
   
        // Duration duration = Duration.between(zonedDateTimeSingapor.toLocalTime(), zonedDateTimeAuckland.toLocalTime());

        // System.out.println(zonedDateTimeSingapor);
        // System.out.println(zonedDateTimeAuckland);
        // System.out.println(duration.toHours());

        System.out.println(ZoneId.of("Asia/Kolkata").getRules().getDaylightSavings(Instant.now()).toHours());


        System.out.println(ZoneId.of("Pacific/Auckland").getRules().getDaylightSavings(Instant.now()).toHours());

        
   
    }
}