package ss2_loop_in_java.bai_tap.bai_2_hien_thi_so_nguyen_to;

import java.util.Scanner;

public class ShowPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần hiển thị");
        int number = Integer.parseInt(scanner.nextLine());
        showPrime(number);
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
    //Show số nguyên tố
    public static void showPrime(int number) {
        int count = 0;
        for (int i = 2; count < number; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i);
            }
        }
    }
}
