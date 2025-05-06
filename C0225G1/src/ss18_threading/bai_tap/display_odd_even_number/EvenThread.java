package ss18_threading.bai_tap.display_odd_even_number;

public class EvenThread extends Thread{
    public void run(){
        try {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0){
                    System.out.println("Số chẵn: " + i);
                    Thread.sleep(15);
                }
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
