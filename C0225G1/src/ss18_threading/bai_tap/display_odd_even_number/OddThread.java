package ss18_threading.bai_tap.display_odd_even_number;

public class OddThread extends Thread{
    public void run(){
        try {
            for (int i = 1; i <= 10 ; i++) {
                if (i % 2 != 0){
                    System.out.println("Số lẻ: " + i);
                    Thread.sleep(10);
                }
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}