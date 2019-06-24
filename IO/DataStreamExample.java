import java.io.*;

public class DataStreamExample {
    public static void main(String[] args) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("temp.data"))) {
            for (int i = 0; i < 10; i++) {
                dataOutputStream.writeByte(i);
                dataOutputStream.writeShort(i);
                dataOutputStream.writeInt(i);
                dataOutputStream.writeLong(i);
                dataOutputStream.writeFloat(i);
                dataOutputStream.writeDouble(i);
            }

        } catch (FileNotFoundException e) {
            System.err.printf("cannot open the given file");
            System.exit(-1);
        } catch (IOException e) {
            System.err.printf("Error processing the file");
            System.exit(-1);
        }

        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("temp.data"))) {
            for (int i = 0; i < 10; i++) {
                System.out.printf("%d %d %d %d %g %g %n", dataInputStream.readByte(), dataInputStream.readShort(),
                        dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readFloat(),
                        dataInputStream.readDouble());
            }

        } catch (FileNotFoundException e) {
            System.err.printf("cannot open the given file");
            System.exit(-1);
        } catch (IOException e) {
            System.err.printf("Error processing the file");
            System.exit(-1);
        }
    }
}