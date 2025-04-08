package ss2_loop_in_java.bai_tap.bai_3_hien_thi_so_nguyen_to_nho_hon_100;

public class ShowPrimeSmallThanOneHundred {
    public static void main(String[] args) {
        showPrimeLessThanOneHundred();
    }
    //check số nguyên tố
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    //hiển thị các số nguyên tố nhỏ hơn 100
    public static void showPrimeLessThanOneHundred() {
        int i = 2;
        while (i <= 100) {
            if (isPrime(i)) {
                System.out.println(i);
            }
            i++;
        }
    }
}
