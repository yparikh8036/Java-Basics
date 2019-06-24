import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierInterface{
    public static void main(String[] args) {
        // Random random = new Random();
        // Stream.generate(random::nextBoolean).limit(2).forEach(System.out::println);

        // Supplier<String> date = () -> LocalDateTime.now().toString();
        // System.out.println(date.get());

        // Supplier<String> str = String::new;
        // System.out.print(str.get());
        Supplier<String> str = () -> new String();
        System.out.print(str.get());
    }
}