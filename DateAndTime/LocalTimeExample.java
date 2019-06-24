import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        System.out.println(LocalTime.now());

        System.out.println(LocalTime.of(18, 30));

        System.out.println(LocalTime.now().plusHours(2L).plusMinutes(30L));
    }
}