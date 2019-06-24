import java.util.Arrays;

public class FlatMap{
    public static void main(String[] args) {
        // Arrays.stream("ysys s s s snjs sjsjs sjsj".split(" "))
        //         .map(word -> word.split(" "))
        //         .distinct()
        //         .forEach(System.out::println);

        // Arrays.stream("ysys s s s snjs sjsjs sjsj".split(" "))
        // .flatMap(word -> Arrays.stream(word.split("")))
        // .distinct()
        // .forEach(System.out::println);

        //Arrays.asList(1,2,3,4,5).stream().map(i -> i*i).forEach(System.out::println);

        Arrays.asList(Arrays.asList(1,2,3,4,5),Arrays.asList(1,2,3,4,5))
        .stream()
        .flatMap(ints -> ints.stream())
        .sorted()
        .map(i -> i*i)
        .forEach(System.out::println);
    }
}