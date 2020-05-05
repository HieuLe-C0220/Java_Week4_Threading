public class EvenThread extends Thread {
    public void run() {
        for (int i=2;i<=10;) {
            System.out.print(i+" ");
            i+=2;
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
