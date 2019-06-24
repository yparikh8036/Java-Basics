import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class ParallelStream {
    // private static boolean isPrime(long val) {
    // for (long i = 2; i <= val / 2; i++) {
    // if (val % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }
    public static String result = "";

    private static void concat(String str) {
        result = result +" "+ str;
    }

    public static void main(String[] args) {

        // // long count = LongStream.range(2,
        // 100000).filter(ParallelStream::isPrime).count();
        // long count =
        // LongStream.range(2,100000).parallel().filter(ParallelStream::isPrime).count();
        // System.out.println(count);

        // System.out.println(IntStream.range(1, 10).filter(i -> i > 2).isParallel());
        // System.out.println(IntStream.range(1, 10).parallel().filter(i -> i > 2).isParallel());
        // System.out.println(IntStream.range(1, 10).parallel().filter(i -> i > 2).sequential().isParallel());

    //     String words[] = "ths shsh sjs n sjsj sjs sjsjjs ns".split(" ");
    //   //  Arrays.stream(words).forEach(ParallelStream::concat);
    //   Arrays.stream(words).parallel().forEach(ParallelStream::concat);
    //     System.out.println(ParallelStream.result);

   // System.out.println(ForkJoinPool.commonPool().getParallelism());
System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "8");
    System.out.println(ForkJoinPool.commonPool().getParallelism());
    }

}