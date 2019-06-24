public class RunnableImpl implements Runnable {

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        Runnable runnable = new RunnableImpl();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println(Thread.currentThread().getName());
    }
}