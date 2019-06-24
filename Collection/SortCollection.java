import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortCollection {
    public static void main(String[] args) {

        Comparator<String> str = (str1, str2) -> str1.length() - str2.length();
        List<String> words = Arrays.asList("ajdhd vhdh dhdhd hdhd hdhhd hdhd".split(" "));
        words.stream()
        .distinct()
        .sorted(str.thenComparing(String::compareTo).reversed())
      //  .sorted(str.thenComparing(String::compareTo))
       // .sorted(str)
       //.sorted()
        .forEach(System.out::println);
    }
}