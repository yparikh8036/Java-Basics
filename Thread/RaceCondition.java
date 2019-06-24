class Counter {
    public static long count = 0;
}

class UserCounter implements Runnable {

    // public void increment() {
    //     synchronized (this) {
    //         Counter.count++;
    //         System.out.println(" " + Counter.count);
    //     }
                 //if the method is static
    //     // synchronized (ClassName.class) {
    //     //     Counter.count++;
    //     //     System.out.println(" " + Counter.count);
    //     // }
    // }

    public synchronized void increment() {
            Counter.count++;
            System.out.println(" " + Counter.count);
    }

    @Override
    public void run() {
        increment();
        increment();
        increment();
    }

}

public class RaceCondition {
    public static void main(String[] args) {
        Runnable runnable = new UserCounter();
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread.start();
        thread1.start();
        thread2.start();
    }
}