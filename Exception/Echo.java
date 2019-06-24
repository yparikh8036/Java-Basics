import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        // if(args.length == 0){
        // // System.out.print("No Argument is passed");
        // // System.exit(-1);
        // throw new IllegalArgumentException("No Argument is passed");
        // }else{
        // for(String str: args){
        // System.out.println(str);
        // }
        // }

        // System.out.println("Enter an Integer");
        // Scanner scanner = new Scanner(System.in);
        // try {
        // System.out.println(scanner.nextInt());
        // } catch (InputMismatchException e) {
        // System.out.println("Error: You typed some other then Integer value...");
        // }

       // String integerString = "";
       // String integerString = "100";
        String integerString = "hundred";
        System.out.println(integerString);
        Scanner scanner = new Scanner(integerString);
        try {
           // scanner.close();
            System.out.println(scanner.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: You typed some other then Integer value...");
        }
         catch (NoSuchElementException | IllegalStateException e) {
            System.out.println("NoSuchFieldException: You typed some other then Integer value...");
        } 
        // catch (IllegalStateException e) {
        //     System.out.println("IllegalStateException: You typed some other then Integer value...");
        // }
    }
}