import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CowList {
    public static void main(String[] args) {
     //   List<String> abc = new ArrayList<>();
        List<String> abc = new CopyOnWriteArrayList<>();
        abc.add("yash");
        abc.add("yash");
        abc.add("yash");

        Iterator<String> iterator = abc.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            abc.add("parikh");
        }
    }
}