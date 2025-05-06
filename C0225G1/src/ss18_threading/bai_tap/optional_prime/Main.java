package ss18_threading.bai_tap.optional_prime;

public class Main {
    public static void main(String[] args) {
        Thread lazyThread = new Thread(new LazyPrimeFactorization());
        Thread optimizedThread = new Thread(new OptimizedPrimeFactorization());

        lazyThread.start();
        optimizedThread.start();
    }
}
