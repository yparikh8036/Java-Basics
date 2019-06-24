public class AssertionExample {
    public static void main(String[] args) {
        int i = Integer.MIN_VALUE;
        if (i < 0) {
            i = -i;
        }

        System.out.println(i);

        assert (i >= 0) : "Impossible i is negetive";
    }
}