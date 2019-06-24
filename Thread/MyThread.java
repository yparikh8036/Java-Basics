public class MyThread extends Thread {
    public void run() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName());
    }

    public static void main(String[] args) {
        Thread mThread = new MyThread();
        mThread.setName("yash");
        mThread.start();
        System.out.println(Thread.currentThread().getName());
    }
}