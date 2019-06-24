import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class ChronoUnit1 {
    public static void main(String[] args) {
        System.out.println(Duration.of(1, ChronoUnit.MINUTES).getSeconds());

        System.out.println(Duration.of(1, ChronoUnit.HOURS).getSeconds());


        System.out.println(Duration.of(1, ChronoUnit.DAYS).getSeconds());

    }
}