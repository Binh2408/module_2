package ss18_threading.bai_tap.create_thread_basic;

import java.util.Random;

public class NumberGenerator implements Runnable{

    @Override
    public void run() {
       try {
           for (int i = 0; i < 10; i++) {
               int numRandom = (new Random()).nextInt();
               System.out.println("Thread [" + this.hashCode() + "] : " + numRandom);
               Thread.sleep(500);

           }
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
    }
}
