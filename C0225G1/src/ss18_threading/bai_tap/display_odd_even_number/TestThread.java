package ss18_threading.bai_tap.display_odd_even_number;

public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        oddThread.start();
        try {
            // Đợi cho đến khi thread oddThread hoàn thành
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        evenThread.start();

        try {
            // Đợi cho đến khi thread evenThread hoàn thành
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished");
    }
}
