import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Type {
    public static void main(String[] files) {
        if (files.length == 0) {
            System.out.println("pass the name of the file");
            System.exit(-1);
        }

        for (String file : files) {
            try (FileReader fileReader = new FileReader(file)) {
                int ch = 0;
                while ((ch = fileReader.read()) != -1) {
                    System.out.print((char)ch);
                }
            } catch (FileNotFoundException e) {
                System.err.printf("cannot open the given file %s", file);
            } catch (IOException e) {
                System.err.printf("Error processing the file %s", file);
            }
        }
    }
}