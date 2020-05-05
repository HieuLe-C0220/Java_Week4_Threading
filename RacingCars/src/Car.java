import com.sun.tools.javac.Main;
import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Car implements Runnable {
    public static int DISTANCE = 100;
    public static int STEP = 5;
    private String name;
    public Car() {
    }
    public Car(String name) {
        this.name = name;
    }
    public void run() {
        //Khởi tạo điểm start
        int runDistance = 0;
        //Khởi tạo time bắt đầu cuộc đua
        long startTime = System.currentTimeMillis();
        //Kiểm tra chừng nào còn xe chưa kết thúc quãng đường đua thì xe vẫn tiếp tục chạy
        while (runDistance< DISTANCE) {
            try {
                //Random Speed km/h
                int speed = (new Random()).nextInt(20);
                //Calculate traveled distance
                runDistance += speed;
                //Build result graphic
                String log = "|";
                int percenTravel = (runDistance*100)/DISTANCE;
                for (int i=0;i<DISTANCE;i+=STEP) {
                    if (percenTravel>=i+STEP) {
                        log += "=";
                    } else if (percenTravel >= i&&percenTravel<i+STEP) {
                        log+="o";
                    } else {
                        log+="-";
                    }
                }
                log += "|";
                System.out.println("Car"+this.name+": "+log+" "+Math.min(DISTANCE, runDistance)+"Km");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car "+this.name+" broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car"+this.name+" Finish in "+(endTime-startTime)/1000+"s");
    }

    public static void main(String[] args) {
        Car Bugatti = new Car("Bugatti");
        Car Merc = new Car("Merc");
        Car Audi = new Car("Audi");
        Car BMW = new Car("BMW");
        Thread thread1 = new Thread(Bugatti);
        Thread thread2 = new Thread(Merc);
        Thread thread3 = new Thread(Audi);
        Thread thread4 = new Thread(BMW);
        System.out.println("Distance: 100Km");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
