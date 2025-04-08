package ss2_loop_in_java.thuc_hanh.tim_UCLN;

import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter second number: ");
        int number2 = Integer.parseInt(scanner.nextLine());
        number1 = Math.abs(number1);
        number2 = Math.abs(number2);
        if (number1 == 0 || number2 == 0) {
            System.out.println("No greates common factor");
        } else {
            System.out.println("Greatest common factor: " + findUCLN(number1,number2));
        }
    }
    public static int findUCLN(int number1, int number2) {
        while (number1 != number2) {
            if (number1 > number2) {
                number1 = number1 - number2;
            } else {
                number2 = number2 - number1;
            }
        }
        return number1;
    }
    //cách 2
//    public static int findUCLN(int a, int b) {
//        while (b != 0) {
//            int temp = b;
//            b = a % b;
//            a = temp;
//        }
//        return a;
//    }
}
