package ss11_dsa_stack_queue.bai_tap.bai_1_dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ReverseElementInteger {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int size = 10;
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        System.out.println("Array: " + list);
        reverseList(list);
        System.out.println("After reverse: " + list);

        reverseString("Tôi học Java CodeGym");
    }

    public static void reverseList(List<Integer> list) {
        Stack<Integer> stack = new Stack<>();
        for (int value : list) {
            stack.push(value);
        }
        list.clear();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
    }

    public static void reverseString(String input) {
        Stack<String> wStack = new Stack<>();
        String[] mWord = input.split(" ");
        for (int i = 0; i < mWord.length; i++) {
            wStack.push(mWord[i]);
        }
        String reversed = "";
        int n = wStack.size();
        for (int i = 0; i < n; i++) {
            reversed += wStack.pop();
            if (!wStack.isEmpty()) {
                reversed += " "; // chỉ thêm " " khi chưa phải từ cuối cùng
            }
        }
        System.out.println("Reversed: " + reversed);

    }
}
