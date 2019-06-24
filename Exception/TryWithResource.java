import java.util.Scanner;
import java.util.InputMismatchException;

public class TryWithResource {
    public static void main(String[] args) {
        System.out.println("Enter an Integer");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(scanner.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("Error: You typed some other then Integer value...");
        }
    }
}