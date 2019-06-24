
import java.io.*;

public class Copy {
    public static void main(String[] files) {
        if (files.length < 2) {
            System.out.println("pass the name of two the file");
            System.exit(-1);
        }
        String src = files[0];
        String dest = files[1];

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(src));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(dest))) {
            int ch = 0;
            while ((ch = bufferedReader.read()) != -1) {
                bufferedWriter.write((char) ch);
            }

        } catch (FileNotFoundException e) {
            System.err.printf("cannot open the given file %s-%s", src, dest);
        } catch (IOException e) {
            System.err.printf("Error processing the file %s-%s", src, dest);
        }

    }
}