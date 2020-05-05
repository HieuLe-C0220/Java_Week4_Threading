public class LazyPrimeFactorization implements Runnable {
    int number = 0;
    public LazyPrimeFactorization(int number) {
        this.number = number;
    }
    public void run() {
        for (int i=0;i<number;i++) {
            if (checkIsprime(i)) {
                System.out.print(i+" ");
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public boolean checkIsprime(int n) {
        if (n<2) {
            return false;
        } else if (n==2) {
            return true;
        } else {
            for (int i=2;i<n;i++) {
                if (n%i==0) {
                    return false;
                }
            }
        } return true;
    }
}
