package ss13_thuat_toan_tim_kiem.bai_tap.optional_bai_2_findStringLinkMax;

import java.util.Scanner;

public class FindStringMaxConsecutive {
    public static String findMaxStringContinue(String string) {
        if (string == null || string.isEmpty()) {
            return "";
        }
        StringBuilder maxStringBuilder = new StringBuilder();
        StringBuilder currentStringBuilder = new StringBuilder();
        currentStringBuilder.append(string.charAt(0)); // Khởi tạo ký tự đầu tiên

        for (int i = 1; i < string.length(); i++) {
            char prev = string.charAt(i-1);
            char current = string.charAt(i);
            if (current > prev) {
                currentStringBuilder.append(current);
            } else {
                if (currentStringBuilder.length() > maxStringBuilder.length()) {
                    maxStringBuilder = new StringBuilder(currentStringBuilder);
                }
                currentStringBuilder.setLength(0);
                currentStringBuilder.append(current);
            }
        }
        if (currentStringBuilder.length() > maxStringBuilder.length()) {
            maxStringBuilder = new StringBuilder(currentStringBuilder);
        }
        return maxStringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi: ");
        String input = scanner.nextLine();

        System.out.println("Chuỗi con tăng dần dài nhất là: " + findMaxStringContinue(input));
    }

}
