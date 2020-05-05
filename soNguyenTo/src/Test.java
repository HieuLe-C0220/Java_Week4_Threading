public class Test {
    public static void main(String[] args) {
        Thread th1 = new Thread(new LazyPrimeFactorization(1000));
        Thread th2 = new Thread(new OptimizedPrimeFactorization(1000));
        th1.start();
        th2.start();
    }
}
