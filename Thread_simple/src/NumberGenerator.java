public class NumberGenerator implements Runnable {

    public int num=10;
    public NumberGenerator(int num) {
        this.num = num;
    }

    public void run() {
        for (int i=num;i>0;i--) {
            System.out.print(i+ " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
