import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveFInterface {
    public static void main(String[] args) {
        // IntStream.range(1, 10).filter(i -> (i % 2) == 0).forEach(System.out::println);

        // IntPredicate intPredicate = i -> (i % 2) == 0;
        // IntStream.range(1, 10).filter(intPredicate).forEach(System.out::println);

        // AtomicInteger atomicInteger = new AtomicInteger();
        // Stream.generate(atomicInteger::incrementAndGet).limit(10).forEach(System.out::println);

        // BiFunction<String,String,String> abv = (x,y)-> x.concat(y);
        // System.out.print(abv.apply("ysh ", "parikh"));

        // BiPredicate<List<Integer>, Integer> abc = List::contains;
        // List<Integer> aa = Arrays.asList(1,2,3,4,5,8);
        // System.out.print(abc.test(aa, 2));

        // BiConsumer<List<Integer>, Integer> add = List::add;
        // List<Integer> aa = new ArrayList<>();
        // add.accept(aa, 10);
        // System.out.print(aa);

        List<Integer> aa = Arrays.asList(1,2,3,-4,5,-8);
        aa.replaceAll(Math::abs);
        System.out.print(aa);
    }
}