import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class SearchStream {
    public static void main(String[] args) {
        // if we apply this search on one IntStream then this error will occer
        // false
        // Exception in thread "main"
        // java.lang.IllegalStateException: stream has already been operated upon or
        // closed
        // at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:229)
        // AbstractPipeline.java:229
        // at java.util.stream.IntPipeline.allMatch(IntPipeline.java:482)
        // IntPipeline.java:482
        // at SearchStream.main(SearchStream.java:11)

        // Short-Circuiting
        // IntStream s = IntStream.of(-1,22,-33,-44,-55,-554);
        // IntStream s1 = IntStream.of(-1,22,-33,-44,-55,-554);
        // IntStream s2 = IntStream.of(-1,22,-33,-44,-55,-554);

        // IntStream s = IntStream.of();
        // IntStream s1 = IntStream.of();
        // IntStream s2 = IntStream.of();

        // boolean anyMatch = s.anyMatch(temp -> temp > 0 );
        // System.out.println(anyMatch);

        // boolean allMatch = s1.allMatch(temp -> temp > 0 );
        // System.out.println(allMatch);

        // boolean noneMatch = s2.noneMatch(temp -> temp > 0 );
        // System.out.println(noneMatch);

        // java.lang.reflect.Method[] methods = Stream.class.getMethods();
        // Optional<String> methodName = Arrays.stream(methods)
        //                         .map(method -> method.getName())
        //                         .filter(name -> name.endsWith("Match1"))
        //                         .sorted()
        //                         .findFirst();
        // System.out.println(methodName.orElse("no found"));

        // OptionalDouble temp1 = DoubleStream.of(-1.2,2.0,1.3)
        //                             .filter(temp -> temp> 0)
        //                             .findFirst();
        //  System.out.println(temp1.getAsDouble());
        //  System.out.println(temp1);

         Optional<Double> temp1 = Stream.of(-1.2,2.0,1.3)
                                    .filter(temp -> temp> 0)
                                    .findFirst();
         System.out.println(temp1);
         System.out.println(temp1);

    }
}