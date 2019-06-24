import java.util.function.Predicate;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class PridicateTest {
    public static void main(String[] args) {
        // Predicate<String> nullcheck = arg -> arg != null;
        // Predicate<String> emptycheck = arg -> arg.length() > 0;
        // Predicate<String> nullandemptycheck = nullcheck.and(emptycheck);

        // System.out.println(nullandemptycheck.test("yash"));
        // System.out.println(nullandemptycheck.test(null));

        List<Integer> aa = new ArrayList<>();
        aa.add(10);
        aa.add(20);
        aa.add(10);
        aa.add(10);

        aa.removeIf(((Predicate<Integer>) arg -> arg == 20).negate());
        aa.forEach(System.out::println);

    }
}