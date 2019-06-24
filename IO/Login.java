import java.io.Console;
import java.util.Arrays;

public class Login {
    public static void main(String[] args) {
        Console console = System.console();
        if (console != null) {
            String userName = null;
            char[] password = null;
            userName = console.readLine("Enter your UserName :");
            password = console.readPassword("Enter Password :");

            if (userName.equals("yash") && new String(password).equals("parikh")) {
                console.printf("Login Successful");
            } else {
                console.printf("Login unsuccessful");
            }
            Arrays.fill(password, ' ');
        }
    }
}