public class OptimizedPrimeFactorization implements Runnable {
    int num = 0;
    public OptimizedPrimeFactorization(int number) {
        this.num = number;
    }
    public void run() {
        for (int j = 0; j< num; j++) {
            if (isPrime(j)) {
                System.out.print(j+" ");
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public boolean isPrime(int n) {
        if (n<2) {
            return false;
        } else if (n==2) {
            return true;
        } else {
            for (int i=2;i<=Math.sqrt(n);i++) {
                if (n%i==0) {
                    return false;
                }
            }
        } return true;
    }
}
