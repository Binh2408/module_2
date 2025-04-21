package ss11_dsa_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestMethodStackAndQueue {
    public static void main(String[] args) {
        // Khởi tạo Stack và Queue
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        // Thêm phần tử vào cả Stack và Queue
        System.out.println("Thêm phần tử: A, B, C");
        stack.push("A");
        stack.push("B");
        stack.push("C");

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        // Hiển thị toàn bộ Stack và Queue
        System.out.println("\nNội dung Stack (LIFO): " + stack);
        System.out.println("Nội dung Queue (FIFO): " + queue);

        // Lấy phần tử ra (pop với Stack, poll với Queue)
        System.out.println("\nLấy phần tử ra:");
        //System.out.println("Stack pop: " + stack.pop());     // C
        //System.out.println("Stack pop: " + stack.pop());     // C
        //System.out.println("Stack pop: " + stack.pop());     // C
//        System.out.println("Queue poll: " + queue.poll());   // A
//        System.out.println("Queue poll: " + queue.poll());   // A
//        System.out.println("Queue poll: " + queue.poll());   // A

        // Xem phần tử tiếp theo (peek)
        System.out.println("\nPhần tử tiếp theo:");
        System.out.println("Stack peek: " + stack.peek());   // B
        //System.out.println("Queue peek: " + queue.peek());   // B

//        // Hiển thị sau khi lấy phần tử
        System.out.println("\nSau khi lấy phần tử:");
        System.out.println("Stack: " + stack);   // [A, B]
//        System.out.println("Queue: " + queue);   // [B, C]
    }
}
