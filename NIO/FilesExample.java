import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;
import java.nio.file.*;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        // Path path = Paths.get("test.txt");
        // Path path2 = Paths.get("E:\\java\\Projects\\AfterJobLeft\\NIO\\test.txt");
        // System.out.println(Files.isSameFile(path, path2));

        // Path path = Paths.get(args[0]);

        // if(Files.exists(path, LinkOption.NOFOLLOW_LINKS)){
        // if(Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS)){
        // System.out.println(path.getFileName() + " is Directory");
        // } else {
        // System.out.println(path.getFileName() + " is File");
        // }
        // } else {
        // System.out.println(path.getFileName() + " do not exists");
        // }

        // Path path = Paths.get(args[0]);

        // System.out.println(Files.isReadable(path));
        // System.out.println(Files.isWritable(path));
        // System.out.println(Files.isExecutable(path));

        // Path path = Paths.get(args[0]);

        // try {
        // Object object = Files.getAttribute(path, "creationTime",
        // LinkOption.NOFOLLOW_LINKS);
        // System.out.println(object);

        // object = Files.getAttribute(path, "lastModifiedTime",
        // LinkOption.NOFOLLOW_LINKS);
        // System.out.println(object);

        // object = Files.getAttribute(path, "size", LinkOption.NOFOLLOW_LINKS);
        // System.out.println(object);

        // object = Files.getAttribute(path, "dos:hidden", LinkOption.NOFOLLOW_LINKS);
        // System.out.println(object);

        // object = Files.getAttribute(path, "isDirectory", LinkOption.NOFOLLOW_LINKS);
        // System.out.println(object);
        // } catch (Exception e) {
        // e.getStackTrace();
        // }

        Path path = Paths.get(args[0]);
        try {
            BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

            System.out.println(basicFileAttributes.size());
            System.out.println(basicFileAttributes.isDirectory());
            System.out.println(basicFileAttributes.isRegularFile());

            System.out.println(basicFileAttributes.isSymbolicLink());
            System.out.println(basicFileAttributes.lastAccessTime());
            System.out.println(basicFileAttributes.lastModifiedTime());
        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}