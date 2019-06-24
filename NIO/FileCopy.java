import java.nio.file.*;

public class FileCopy {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.print("hahhakjbkbkb");
            System.exit(-1);
        }

        Path src = Paths.get(args[0]);
       // Path dest = Paths.get(args[1]);

        try {
            // Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);
           // Files.move(src, dest, StandardCopyOption.REPLACE_EXISTING);
           Files.delete(src);
            System.out.print("hahha");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}