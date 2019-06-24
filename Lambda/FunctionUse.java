import java.util.Arrays;
import java.util.function.Function;

public class FunctionUse {
    public static void main(String[] args) {
        // Arrays.stream("-1,1,2,-3,4".split(",")).map(Integer::parseInt).map(arg -> (arg > 0) ? arg : -arg)
        //         .forEach(System.out::println);

        // Function<String, Integer> abc = str -> str.length();

        // System.out.println(abc.apply("ikjukwuikswguiv"));

        Function<String, Integer> parseInt = Integer::parseInt;
        Function<Integer, Integer> absInt = Math::abs;
        // Function<String, Integer> parsIntandabsint = parseInt.andThen(absInt);
        Function<String, Integer> parsIntandabsint = absInt.compose(parseInt);

        Arrays.stream("4,3,-3,3,-4".split(",")).map(Function.identity())
        .map(parsIntandabsint).forEach(System.out::println);
    }
}