package ss18_threading.bai_tap.optional_prime;

public class LazyPrimeFactorization implements Runnable {

    @Override
    public void run() {
        int number = 2;
        while (true) {
            if (isPrime(number)) {
                System.out.println("Lazy found prime: " + number);
            }
            number++;
            try {
                Thread.sleep(100); // chậm để dễ quan sát
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

}
