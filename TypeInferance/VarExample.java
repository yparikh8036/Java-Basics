public class VarExample {
    public static void main(String[] args) {
       // String greet = "yash";
        var greet = "yash";
        System.out.print(greet);

        greet = 1;
        System.out.print(greet);

        greet = 1; // error: incompatible types: int cannot be converted to String

        List<String> name = Arrays.asList("yash", "parikh");
        for(var string: name){
        System.out.println(string);
        }

        //var is not a keyword
        var var = 10;
        System.err.println(var);

        var names = new ArrayList<>();
        names.add("e");
        names.add(1);
        System.out.print(names);

        Collection<Integer> list = new ArrayList<>() {
        // var list = new ArrayList<Integer>() {//bad idea
        {
        add(1);
        add(2);
        add(3);
        }
        };
        System.out.print(list);
        list.remove(1);
        System.out.print(list);

        Runnable runnable = () -> System.out.print("yash");
       // var runnable = () -> System.out.print("yash");
       // var runnable = (Runnable) (() -> System.out.println("yash")); // you should not use this
        runnable.run();

        Consumer<Integer> a = (final var e) -> System.out.println(e);
        a.accept(10);
    }
    // public void foo(var a){
    // }
}