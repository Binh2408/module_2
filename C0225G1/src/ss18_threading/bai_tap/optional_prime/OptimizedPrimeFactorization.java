package ss18_threading.bai_tap.optional_prime;

public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int number = 2;
        while (true) {
            if (isPrime(number)) {
                System.out.println("Optimized found prime: " + number);
            }
            number++;
            try {
                Thread.sleep(100); // cũng tạm nghỉ để dễ nhìn kết quả
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
