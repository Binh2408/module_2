package ss2_loop_in_java.thuc_hanh.check_prime;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        if (number < 2) {
            System.out.println(number + " is not a prime");
        } else {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % 2 == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(number + " is a prime");
            } else {
                System.out.println(number + "is not a prime");
            }
        }
        //sử dụng hàm
//        if (isPrime(number)) {
//            System.out.println(number + " is a prime");
//        } else {
//            System.out.println(number + " is not a prime");
//        }
    }
    //sử dụng hàm
//    public static boolean isPrime (int number) {
//        if (number < 2) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(number); i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
}
