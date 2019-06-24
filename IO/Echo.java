import java.io.Console;
import java.util.*;

public class Echo {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.out.print("Not Got the Object because JVM is invoked through IDE "
                    + " or by background proccess nt by terminal");
            System.exit(-1);
        }

        console.printf(console.readLine());

    }
}