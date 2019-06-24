import java.io.FileInputStream;
import java.util.Arrays;
import java.io.*;

public class MagicNum {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("pass the name of the file");
            System.exit(-1);
        }

        String file = args[0];

        byte[] magicNum = { (byte) 0xCA, (byte) 0xFE, (byte) 0xBA, (byte) 0xBE };

        try (FileInputStream fileInputStream = new FileInputStream(file)) {

            byte[] u4buffer = new byte[4];

            if(fileInputStream.read(u4buffer) != -1){
                if(Arrays.equals(magicNum, u4buffer)){
                    System.out.println(file);
                }
                else{
                    System.out.println("do not match");
                }
            }
           
        } catch (FileNotFoundException e) {
            System.err.printf("cannot open the given file %s", file);
        } catch (IOException e) {
            System.err.printf("Error processing the file %s", file);
        }
    }
}