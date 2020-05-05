public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        Thread th1 = new OddThread();
        Thread th2 = new EvenThread();
        th1.start();
        th1.join();
        th2.start();
    }
}
