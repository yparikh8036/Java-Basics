
/**
 * language that moving towads type inferance is c++, C#, java
 * 
 * java uses type inferance since long time 
 * JDK 5
 * generics 
 * when type informtion is needed
 * JDK 7
 * diamond opearator
 * limitation
 * JDK 8
 * lambda type inferance
 * a few limitations
 *   no annotation
 *   not enough context
 * JDK 9
 * support for anonymous class
 * 
 * JDK 10
 * local variable type inferance
 * only where the type is 100% clear to the compiler
 * local veriable
 * for
 * try
 * not for fields
 * not for parameter
 * caveats
 * 
 * 
 * 
 */
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class First {

    // var a = 20; // Error
    public static void main(String[] args) {
        // // List<String> names = new ArrayList<String>();

        // // java 7
        // List<String> names = new ArrayList<>();

        // // names.<String>add("Yash");
        // // names.<String>add("Parikh");

        // names.add("Yash");
        // names.add("Parikh");

        // // System.out.println(names);

        // // java 9
        // List<String> names1 = new ArrayList<>() { // JDK7,8 Don't have anonamous
        // innner class with diamond syntax
        // // JDK 9
        // {
        // add("Yash");
        // add("Parikh");
        // }
        // };

        // // System.out.println(names1);

        // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // // list.forEach((Integer e) -> System.out.println(e));
        // // list.forEach((e) -> System.out.println(e));
        // // list.forEach(e -> System.out.println(e));
        // // list.forEach(System.out::println);

        // // list.forEach((final @NotNull Integer e) -> System.out.println(e));
        // // list.forEach((final @NotNull e) -> System.out.println(e));

        // list.stream()
        // //.sorted(comparing((Integer e) -> e).reversed())
        // .sorted()
        // .forEach(System.out::println);

        // String greet = "yash";

        // var greet = "yash";
        // System.out.print(greet);

        // greet = 1;
        // System.out.print(greet);

        // error: incompatible types: int cannot be converted to String
        // greet = 1;

        // List<String> name = Arrays.asList("yash", "parikh");

        // for(var string: name){
        // System.out.println(string);
        // }

        // var is not a keyword

        // var var = 10;
        // System.err.println(var);

        var names = new ArrayList<>();

        names.add("e");
        names.add(1);
        System.out.print(names);

        // Collection<Integer> list = new ArrayList<>() {
        // // var list = new ArrayList<Integer>() {//bad idea
        // {
        // add(1);
        // add(2);
        // add(3);
        // }
        // };
        // System.out.print(list);
        // list.remove(1);
        // System.out.print(list);
        // [1, 2, 3][2, 3]

        // var
        // [1, 2, 3][1, 3]

        // Runnable runnable = () -> System.out.print("yash");
        // runnable.run();

        // var runnable = () -> System.out.print("yash");

        var runnable = (Runnable) (() -> System.out.println("yash")); // you should not use this
        runnable.run();

        Consumer<Integer> a = (final var e) -> System.out.println(e);

        a.accept(10);

    }

    // public void foo(var a){

    // }
}