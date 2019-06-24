import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;

public class StoreCollection {
    public static void main(String[] args) {
        // String s ="sns sjs jsjsn jsjs";
        // List<String> str = Pattern.compile("
        // ").splitAsStream(s).collect(Collectors.toList());
        // str.forEach(System.out::println);

        // String s ="sns sns jsjsn jsjs";
        // Set<String> str = Pattern.compile("
        // ").splitAsStream(s).collect(Collectors.toSet());
        // str.forEach(System.out::println);

        // String s ="sns sjs jsjsn jsjs";
        // Map<String, Integer> str = Pattern.compile("
        // ").splitAsStream(s).collect(Collectors.toMap(name-> name,
        // name->name.length()));
        // str.forEach((name, len)-> System.out.println(""+name+" "+ len));

        // String s ="sns sjs jsjsn jsjs";
        // List<String> str = Pattern.compile("
        // ").splitAsStream(s).collect(Collectors.toCollection(LinkedList::new));
        // str.forEach(System.out::println);

        // String s = "sns sns jsjsn jsjs";
        // Set<String> str = Pattern.compile("
        // ").splitAsStream(s).collect(Collectors.toCollection(TreeSet::new));
        // str.forEach(System.out::println);

        // Stream<String> str = Arrays.stream("you yoy js js jsw qaa zzzx".split(" ")).distinct();
        // Map<Integer, List<String>> map = str.collect(Collectors.groupingBy(String::length));
        // System.out.println(map);

        // map.forEach((count, words) -> {
        //     System.out.println("\n" + count);
        //     words.forEach(System.out::println);

        // });

        Stream<String> str = Arrays.stream("you yoy js js jsw qaa zzzx".split(" ")).distinct();
        Map<Boolean, List<String>> map = str.collect(Collectors.partitioningBy(str1 -> str1.length() > 3));
        System.out.println(map);
        System.out.println(map.get(true));
        System.out.println(map.get(false));
    }
}