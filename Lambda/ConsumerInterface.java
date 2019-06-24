import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerInterface{
    public static void main(String[] args) {
        
        // Stream.of("hello","yash").forEach(System.out::println);

        // Consumer<String> upper = str -> System.out.println(str.toUpperCase());
        // upper.accept("hello");

        Stream<String> str = Stream.of("hello","yash");
        Consumer<String> print= System.out::println;
        str.forEach(print);
    }
}