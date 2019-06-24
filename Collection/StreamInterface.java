import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamInterface{
    public static void main(String[] args) {
        

        // List<String> abc = Arrays.asList("a","b","c","d");
        // abc.stream().forEach(System.out::println);

        // abc.forEach(System.out::print);

        // Arrays.asList(Object.class.getMethods())
        //                         .stream().map(method -> method.getName())
        //                         .distinct()
        //                         .forEach(System.out::println);

        Stream.of(1,2,3,4,5).
        peek(i -> System.out.println(i)).map(i -> i*i)
        .peek(i->System.out.println(i)).count();
    }
}