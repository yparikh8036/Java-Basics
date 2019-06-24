import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.TreeSet;

import java.util.*;

public class Tokenize {
    public static void main(String[] files) {
        if (files.length != 1) {
            System.out.println("pass the name of two the file");
            System.exit(-1);
        }

        String src = files[0];

        Set<String> words = new TreeSet<>();

        try(Scanner scanner = new Scanner(new FileReader(src))) {
            scanner.useDelimiter("\\W");

            while(scanner.hasNext()){
                String word = scanner.next();
                if(!word.equals("")){
                    words.add(word.toLowerCase());
                }
            }

            System.out.print(words);
            
        } catch (FileNotFoundException e) {
           e.getStackTrace();
        }
    }
}