import java.io.*;

public class Read {
    public static void main(String[] args) {
        // System.out.println("Type a charector :");
        // int val = 0;
        // try {
        //     val = System.in.read();
        // } catch (IOException e) {
        //     System.out.println("cannot read input  :" + e);
        //     System.exit(-1);
        // }
        // System.out.println("You Typed :" + val);

        try {
            PrintStream printStream = new PrintStream("log.txt");
            System.setOut(printStream);
            System.out.println("Done");
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}