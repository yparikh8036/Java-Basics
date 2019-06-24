import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        System.out.println(Instant.now());

        System.out.println(Instant.now().getEpochSecond());

        System.out.println(Instant.now().toEpochMilli());
    }
}