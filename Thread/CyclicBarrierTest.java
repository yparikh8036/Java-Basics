import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class MixedDoubleTennisGame extends Thread {
    public void run() {
        System.out.println("all four players are ready");
    }
}

class Player extends Thread {
    CyclicBarrier waitPoint;

    public Player(CyclicBarrier cyclicBarrier, String name) {
        this.setName(name);
        waitPoint = cyclicBarrier;
        this.start();
    }

    public void run() {
        System.out.println("Player " + getName() + " is ready ");
        try {
            waitPoint.await();
        } catch (BrokenBarrierException | InterruptedException e) {
            System.out.print("Exception occure while WAITING.." + e);
        }
    }
}

public class CyclicBarrierTest {
    public static void main(String[] args) {

        System.out.println("Plaayer arrives game will start");
        CyclicBarrier barrier = new CyclicBarrier(4, new MixedDoubleTennisGame());
        new Player(barrier, "yash");
        new Player(barrier, "Parikh");
        new Player(barrier, "pATEL");
        new Player(barrier, "SHAH");

    }

}