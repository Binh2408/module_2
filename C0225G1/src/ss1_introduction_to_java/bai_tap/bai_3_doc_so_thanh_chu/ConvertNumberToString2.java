package ss1_introduction_to_java.bai_tap.bai_3_doc_so_thanh_chu;

import java.util.Scanner;

public class ConvertNumberToString2 {
    //tham khảo cách khác
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number (0-999): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
        } else {
            String result = convertNumberToWords(number);
            System.out.println(result);
        }
    }

    public static String convertNumberToWords(int number) {
        String[] ones = {
                "Zero", "One", "Two", "Three", "Four", "Five",
                "Six", "Seven", "Eight", "Nine"
        };

        String[] teens = {
                "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
                "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
        };

        String[] tens = {
                "", "", "Twenty", "Thirty", "Forty", "Fifty",
                "Sixty", "Seventy", "Eighty", "Ninety"
        };

        if (number < 10) {
            return ones[number];
        } else if (number < 20) {
            return teens[number - 10];
        } else if (number < 100) {
            int ten = number / 10;
            int one = number % 10;
            return one == 0 ? tens[ten] : tens[ten] + " " + ones[one];
        } else {
            int hundred = number / 100;
            int remainder = number % 100;
            String result = ones[hundred] + " hundred";
            if (remainder != 0) {
                result += " and " + convertNumberToWords(remainder); // Đệ quy xử lý phần còn lại
            }
            return result;
        }
    }
}
