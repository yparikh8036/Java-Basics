import java.util.stream.Stream;
import java.util.Optional;

public class OptionalClass{
    public static void main(String[] args) {
        // Optional<Double> abc = Stream.of(1.1,2.3,3.4,7.5).max(Double::compareTo);

        // abc.ifPresent(System.out::println);

        // Optional<String> empty = Optional.empty();
        // System.out.print(empty);

        // //we cannot put null in of() method
        // Optional<String> abc= Optional.of("value");
        // System.out.print(abc);

        // Optional<String> pqr = Optional.ofNullable(null);
        // System.out.print(pqr);
  
        //Consider Optional as stream
        // Optional<String> abc= Optional.of("   value  ");
        // abc.map(String::trim).ifPresent(System.out::println);

        Optional<String> pqr = Optional.ofNullable(null);
        System.out.print(pqr.map(String::length).orElse(-1));

        Optional<String> pqr1 = Optional.ofNullable(null);
        System.out.print(pqr1.map(String::length).orElseThrow(IllegalArgumentException::new));
    }
}