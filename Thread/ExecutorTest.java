import java.util.concurrent.Executor;

class Task implements Runnable {
    public void run() {
        System.out.println("Calling Task run");
    }
}

class RepetedExecutor implements Executor {
    public void execute(Runnable runnable) {
        new Thread(runnable).start();
    }

    public void execute(Runnable runnable, int times) {
        for (int i = 0; i < times; i++)
            execute(runnable);
    }
}

public class ExecutorTest {
    public static void main(String[] args) {
        Runnable runnable = new Task();
        Thread thread = new Thread(runnable);
        thread.start();

        RepetedExecutor repetedExecutor = new RepetedExecutor();
        repetedExecutor.execute(runnable, 3);
    }
}