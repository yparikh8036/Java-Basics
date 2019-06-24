import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.of(2015,12,25,0,0).isAfter(LocalDateTime.of(2016,12,25,0,0)));

        System.out.println(LocalDateTime.now().toLocalDate());
        System.out.println(LocalDateTime.now().toLocalTime());
    }
}