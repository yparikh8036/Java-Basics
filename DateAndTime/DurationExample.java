import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationExample {
    public static void main(String[] args) {
        System.out.print(
                Duration.between(LocalDateTime.now(), LocalDateTime.of(LocalDate.now().plusDays(1L), LocalTime.MIDNIGHT)));
    }
}