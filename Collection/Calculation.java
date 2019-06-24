import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Calculation {
   public static void main(String[] args) {
      // String[] strs = "you are right nb hdd ".split(" ");
      // // System.out.println(Arrays.stream(strs).min(String::compareTo).get());
      // System.out.println(Arrays.stream(strs).min((str1, str2) -> str1.length() - str2.length()).get());

      // String str = "yash peh jdjdsj jsj jjj wwz ud a udn ee aa zzz";

      // IntSummaryStatistics s = Pattern.compile(" ").splitAsStream(str).mapToInt(word -> word.length()).summaryStatistics();

      // System.out.println(s.getCount());
      // System.out.println(s.getSum());
      // System.out.println(s.getMax());
      // System.out.println(s.getMin());
      // System.out.println(s.getAverage());

      System.out.println(IntStream.rangeClosed(1, 5).reduce((x,y) -> x * y).getAsInt());
   }
}