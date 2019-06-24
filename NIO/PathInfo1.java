import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathInfo1 {
    public static void main(String[] args) throws IOException{
        // Path path = Paths.get("E:\\java\\Projects\\AfterJobLeft\\NIO\\test.txt");
        // System.out.println(path.getFileName());
        // System.out.println(path.getRoot());
        // System.out.println(path.getParent());
        // System.out.println(path);
        // for(Path element : path)
        // System.out.println(element);

        // Path path = Paths.get("test.txt");
        // System.out.println(path.getFileName());
        // System.out.println(path.toUri());
        // System.out.println(path.toAbsolutePath());
        // System.out.println(path.normalize());


        // Path testNormalized = Paths.get(path.normalize().toString());
        // System.out.println(testNormalized.toAbsolutePath());
        // System.out.println(testNormalized.toRealPath(LinkOption.NOFOLLOW_LINKS));

        Path path = Paths.get("test.txt");
        Path path2 = Paths.get("E:\\java\\Projects\\AfterJobLeft\\NIO\\test.txt");
        System.out.println(path.compareTo(path2));
        System.out.println(path.equals(path2));
        System.out.println(path.toAbsolutePath().equals(path2));
        System.out.println(path.toAbsolutePath().compareTo(path2));

    }
}