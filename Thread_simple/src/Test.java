public class Test {
    public static void main(String[] args) {
        Thread th1= new Thread(new NumberGenerator(5));
        Thread th2= new Thread(new NumberGenerator(10));

        th2.setPriority(Thread.MIN_PRIORITY);
        th1.setPriority(Thread.MAX_PRIORITY);
        th1.start();
        th2.start();
    }
}
