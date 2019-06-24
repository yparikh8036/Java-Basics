import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    public static Integer integer = new Integer(0);
    public static AtomicInteger atomicInteger = new AtomicInteger(0);
}


public class AtomicVeriableTest {

    static class Increment extends Thread {
        public void run() {
            Counter.integer++;
            Counter.atomicInteger.incrementAndGet();
        }
    }

    static class Decrement extends Thread {
        public void run() {
            Counter.integer--;
            Counter.atomicInteger.decrementAndGet();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread incrementThreads[] = new Increment[1000];
        Thread decrementThread[] = new Decrement[1000];


        for(int i = 0; i < 1000 ; i++){
            incrementThreads[i] = new Increment();
            decrementThread[i] = new Decrement();
            incrementThreads[i].start();
            decrementThread[i].start();
        }

        for(int i = 0; i < 1000 ; i++){  
            incrementThreads[i].join();
            decrementThread[i].join();
        }

        System.out.println(Counter.integer);
        System.out.println(Counter.atomicInteger.get());       
    }
}