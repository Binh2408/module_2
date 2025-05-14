package test_cuoi_module_2.common;

import java.util.Scanner;

public class InputException {
    private static final Scanner scanner = new Scanner(System.in);
    // Helper method to get valid input
    public static int getInput() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số");
            }
        }
    }
}
