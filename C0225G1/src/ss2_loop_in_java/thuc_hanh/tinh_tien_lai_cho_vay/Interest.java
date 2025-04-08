package ss2_loop_in_java.thuc_hanh.tinh_tien_lai_cho_vay;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        double money = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter number of months: ");
        int month = Integer.parseInt(scanner.nextLine());
        while (month > 12 || month <= 0) {
            System.out.println("Enter number of months again: ");
            month = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Enter annual interest rate in percentage: ");
        double interestRate = Double.parseDouble(scanner.nextLine());
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
