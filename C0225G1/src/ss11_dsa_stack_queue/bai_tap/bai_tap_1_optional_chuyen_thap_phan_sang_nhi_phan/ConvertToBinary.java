package ss11_dsa_stack_queue.bai_tap.bai_tap_1_optional_chuyen_thap_phan_sang_nhi_phan;

import java.util.Stack;

public class ConvertToBinary {
    public static void main(String[] args) {
        convertDecimalToBinary(30);
    }

    public static void convertDecimalToBinary(int number) {
        Stack<Integer> stack = new Stack<>();
        if (number == 0) {
            System.out.println(0);
            return;
        }
        while (number != 0) {
            stack.push(number % 2);
            number = number / 2;
        }
        String convert = "";
        int n = stack.size();
        for (int i = 0; i < n; i++) {
            convert += stack.pop();
        }
        System.out.println("Binary: " + convert);
    }
}
