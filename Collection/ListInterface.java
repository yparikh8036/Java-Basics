import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Abc {
    public static void main(String args[]) {
        // List<String> abc = new ArrayList<>();
        // abc.add("y");
        // abc.add("abc");
        // abc.add("y");
        // abc.add("abc");
        // System.out.println(abc);

        // for (String a : abc) {
        // System.out.println(a);
        // }

        // for(Iterator<String> xyz = abc.iterator();xyz.hasNext();){
        // System.out.println(xyz.next());
        // }

        // List<Integer> abc = new ArrayList<>();
        // for (int i = 0; i < 10; i++) {
        // abc.add(i);
        // }
        // System.out.println(abc);
        // Iterator<Integer> xyz = abc.iterator();
        // while (xyz.hasNext()) {
        // xyz.next();
        // xyz.remove();
        // }
        // System.out.print(xyz);

        Double[] abc = { 4.0, 12.7, 3.0, 3.3, 4.9, 5.0, 5.5, 6.8, 6.6 };
        //System.out.println(abc);
        System.out.println(Arrays.toString(abc));
        List<Double> xyz=Arrays.asList(abc);
        System.out.println(xyz);
        xyz.set(1,9.0);
        System.out.println(xyz);
        System.out.print(Arrays.toString(abc));
    
    }
}