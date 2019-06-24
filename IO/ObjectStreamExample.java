import java.io.FileNotFoundException;
import java.io.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class ObjectStreamExample {
    public static void main(String[] args) {
        Map<String, String> abc = new HashMap<>();
        abc.put("yash", "Parikh");
        abc.put("yash1", "Parikh1");
        abc.put("yash2", "Parikh2");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.data"))) {

            objectOutputStream.writeObject(abc);
        } catch (FileNotFoundException e) {
            e.getStackTrace();

        } catch (IOException e) {
            e.getStackTrace();
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.data"))) {

            Object object = objectInputStream.readObject();

            if (object != null && object instanceof Map) {
                Map<?, ?> abc2 = (Map<?, ?>) object;
                System.out.print(object);
            }

        } catch (FileNotFoundException e) {
            e.getStackTrace();

        } catch (IOException e) {
            e.getStackTrace();
        } catch (ClassNotFoundException e) {
            e.getStackTrace();
        }
    }
}