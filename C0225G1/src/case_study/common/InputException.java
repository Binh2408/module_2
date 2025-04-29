package case_study.common;

import java.util.Scanner;

public class InputException {
    private static final Scanner scanner = new Scanner(System.in);
    // Helper method to get valid input
    public static int getInput() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }
    }
}
