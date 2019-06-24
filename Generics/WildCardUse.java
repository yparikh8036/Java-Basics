import java.util.ArrayList;
import java.util.List;
/**
 * There are Three types of Wildcards
 * 1. Upper Bounded Wildcards:
 * List<? extends Number>  List<String>,List<Integer> etc.
 * 2. Lower Bounded Wildcards:
 * List<? super A>
 * 3. Unbounded Wildcards:
 * List<?>
 */
public class WildCardUse{
    public static void main(String[] args) {
        // List<Number> list = ArrayList<Integer>();
        // list.add(new Integer(10));
        // list.add(new Float(10f));
        // System.out.println(list);

        List<?> list = ArrayList<Integer>();
        

    }
} 