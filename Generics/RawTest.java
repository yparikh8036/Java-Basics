import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;

public class RawTest {

    public static <T> void Fill(List<T> list, T val) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, val);
        }
    }

    public static void main(String[] args) {
        // List list = new LinkedList();
        // list.add("yash");
        // list.add("parikh");

        // List<String> strlist = list;
        // strlist.adqd(10);
        // for(Iterator it = strlist.iterator();it.hasNext();){
        // System.out.println(it.next());
        // }

        // List<String> list = new LinkedList();
        // list.add("yash");
        // list.add("parikh");

        // List strlist = list;
        // strlist.add(10);
        // for(Iterator it = strlist.iterator();it.hasNext();){
        // System.out.println(it.next());
        // }
        List<Integer> intlist = new ArrayList<>();
        intlist.add(10);
        intlist.add(20);
        System.out.println(intlist);
        RawTest.Fill(intlist, 100);
        System.out.println(intlist);
    }
}