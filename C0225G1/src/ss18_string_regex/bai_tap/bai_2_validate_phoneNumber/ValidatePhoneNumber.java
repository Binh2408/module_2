package ss18_string_regex.bai_tap.bai_2_validate_phoneNumber;

import java.util.Scanner;

public class ValidatePhoneNumber {
    private static final String PHONE_NUMBER_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điện thoại (xx)-(0xxxxxxxxx): ");
        String inputPhone = scanner.nextLine();
        if (inputPhone.matches(PHONE_NUMBER_REGEX)) {
            System.out.println("Số hợp lệ");
        } else {
            System.out.println("Không hợp lệ");
        }
    }
}
