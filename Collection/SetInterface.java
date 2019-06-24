import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Pqr {
    public static void main(String[] args) {
        String s1 = "my name is yash parikh";
      //  Set<Character> pqr = new TreeSet<>();
      Set<Character> pqr = new HashSet<>();
        for (char c1 : s1.toCharArray()) {
            System.out.print(c1);
            pqr.add(c1);
        }
    
        System.out.println("\n"+pqr);
    }
}