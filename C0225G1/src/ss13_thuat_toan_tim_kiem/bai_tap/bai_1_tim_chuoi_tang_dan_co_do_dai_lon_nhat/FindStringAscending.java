package ss13_thuat_toan_tim_kiem.bai_tap.bai_1_tim_chuoi_tang_dan_co_do_dai_lon_nhat;

import java.util.Scanner;

public class FindStringAscending {
    public static String findStringAscendingUseStringBuilder(String string) {
        if (string == null || string.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char key = string.charAt(i);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(key);
            for (int j = i+1; j < string.length(); j++) {
                char character = string.charAt(j);
                if (character > key) {
                    stringBuilder.append(character);
                    key = character;
                }
            }
            if (stringBuilder.length() > result.length()) {
                result = stringBuilder;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();
        System.out.println(findStringAscendingUseStringBuilder(input));
        System.out.println("-----------------------------------------");
    }


}
