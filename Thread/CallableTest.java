import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import java.util.concurrent.Future;

class Factorial implements Callable<Long> {
    long n;

    public Factorial(long n) {
        this.n = n;
    }

    public Long call() throws Exception {
        if (n < 0) {
            throw new Exception("n should be > 0");
        }
        long fact = 1;
        for (long i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

public class CallableTest {
    public static void main(String[] args) throws Exception {
        long N = 5;

        Callable<Long> task = new Factorial(N);

        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<Long> future = es.submit(task);
        System.out.println(future.get());
        es.shutdown();
    }
}