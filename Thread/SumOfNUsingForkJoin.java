import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SumOfNUsingForkJoin {

    private static long N = 1000000;
    private static final int NUM_THREADS = 10;

    static class RecursiveSumOfN extends RecursiveTask<Long> {

        private static final long serialVersionUID = 5232453952276485270L;

        long form, to;

        public RecursiveSumOfN(long form, long to) {
            this.form = form;
            this.to = to;
        }

        public Long compute() {
            if ((to - form) <= N / NUM_THREADS) {
                long localSum = 0;
                for (long i = form; i <= to; i++) {
                    localSum += i;
                }
                System.out.printf("\t Sum of value range %d to %d is %d %n", form, to, localSum);
                return localSum;
            } else {
                long mid = (form + to) / 2;
                System.out.printf("Forking Computation in two ranges %d to %d and %d to %d %n", form, mid, mid, to);

                RecursiveSumOfN firstHalf = new RecursiveSumOfN(form, mid);
                firstHalf.fork();

                RecursiveSumOfN secondHalf = new RecursiveSumOfN(mid + 1, to);
                long resultSecond = secondHalf.compute();

                return firstHalf.join() + resultSecond;
            }
        }
    }

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool(NUM_THREADS);
        long computedSum = forkJoinPool.invoke(new RecursiveSumOfN(0, N));
        long formulaSum = (N * (N + 1)) / 2;

        System.out.println("computedSum  " + computedSum);
        System.out.println("formulaSum  " + formulaSum);
    }
}