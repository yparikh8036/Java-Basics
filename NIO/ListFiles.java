import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class ListFiles {
    public static void main(String[] args) throws IOException {
        // try (Stream<Path> entries = Files.list(Paths.get(".")).map(path ->
        // path.toAbsolutePath())) {
        // entries.forEach(System.out::println);

        // Files.walk(Paths.get(".")).forEach(System.out::println);
        // }

        // try(Stream<Path> entries = Files.walk(Paths.get("."), 4,
        // FileVisitOption.FOLLOW_LINKS)){
        // System.out.print(entries.count());
        // }

        BiPredicate<Path, BasicFileAttributes> biPredicate = (path, attrs) -> attrs.isRegularFile()
                && path.toString().endsWith("class");

        try (Stream<Path> e = Files.find(Paths.get(".."), 4, biPredicate)) {
           // System.out.println(e.count());
            e.forEach(System.out::println);
            
        }

    }
}