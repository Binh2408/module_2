package ss11_dsa_stack_queue.bai_tap.bai_tap_2_optional_kiem_tra_chuoi_palindrome_su_dung_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        boolean result = isPalindrome("Able was I ere I saw Elba");
        if (result) {
            System.out.println("Is palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    public static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.trim().charAt(i);
            if (c != ' ') {
                c = Character.toLowerCase(c); // Chuyển thành chữ thường
                stack.push(c); // Đẩy vào Stack
                queue.add(c);  // Thêm vào Queue
            }
        }
        int n = stack.size();
        for (int i = 0; i < n; i++) {
            if (!stack.pop().equals(queue.remove())) {
                return false;
            }
        }
        return true;
    }


}
