package ss11_dsa_stack_queue.bai_tap.bai_tap_3_optional_kiem_tra_dau_ngoac_su_dung_stack;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phép tính vào: ");
        String input = scanner.nextLine();
        Stack<Character> bStack = new Stack<>();
        boolean flag = true;
        for (int i = 0; i < input.length(); i++) {
            char sym = input.charAt(i);
            if (sym == '(' || sym == '{' || sym == '[') {
                bStack.push(sym);
            } else if (sym == ')' || sym == '}' || sym == ']') {
                char left;
                if (bStack.isEmpty()) {
                    flag = false;
                    break;
                } else {
                    left = bStack.pop();
                    if ((left == '(' && sym != ')') ||
                            (left == '{' && sym != '}') ||
                            (left == '[' && sym != ']')) {
                        flag = false;
                        break;
                    }
                }
            }
        }
        // Kiểm tra sau khi vòng lặp kết thúc
        if (!bStack.isEmpty()) {
            flag = false;
        }

        // In kết quả
        if (flag) {
            System.out.println("Dấu ngoặc hợp lệ");
        } else {
            System.out.println("Dấu ngoặc không hợp lệ");
        }
    }
}
