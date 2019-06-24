class BoxPrinter<T> {
    private T val;

    public BoxPrinter(T arg) {
        val = arg;
    }

    public void print() {
        System.out.println("[" + val + "]");
    }
}

public class BoxPrinterTest {
    public static void main(String[] args) {
        //if we do not write <> with class name then error will be thown
      BoxPrinter<Integer> abc = new BoxPrinter<>(10);
      abc.print();

      BoxPrinter<String> abc1 = new BoxPrinter<>("Hello world");
      abc1.print();
    }
}