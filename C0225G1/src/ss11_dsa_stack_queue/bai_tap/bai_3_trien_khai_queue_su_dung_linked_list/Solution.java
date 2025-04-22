package ss11_dsa_stack_queue.bai_tap.bai_3_trien_khai_queue_su_dung_linked_list;

public class Solution {
    public static void main(String[] args) {
        Queue queue = new Queue();

        // Thêm phần tử
        Solution.enQueue(queue);
        queue.rear.data = 10;

        Solution.enQueue(queue);
        queue.rear.data = 20;

        Solution.enQueue(queue);
        queue.rear.data = 30;

        System.out.println("Queue sau khi thêm 3 phần tử:");
        Solution.displayQueue(queue);

        // Xóa phần tử
        Solution.deQueue(queue);
        System.out.println("Queue sau khi xóa 1 phần tử:");
        Solution.displayQueue(queue);

        // Xóa tiếp
        Solution.deQueue(queue);
        System.out.println("Queue sau khi xóa tiếp:");
        Solution.displayQueue(queue);

        // Xóa tiếp
        Solution.deQueue(queue);
        System.out.println("Queue sau khi xóa hết:");
        Solution.displayQueue(queue);
    }
    public static void enQueue(Queue queue) {
        Node newNode = new Node();
        if (queue.front == null) {
            queue.front = queue.rear = newNode;
            newNode.link = newNode;
        } else {
            queue.rear.link = newNode;
            newNode.link = queue.front;
            queue.rear = newNode;
        }
    }

    public static void deQueue(Queue queue) {
        if (queue.front == null) {
            System.out.println("Is empty");
        } else if (queue.front == queue.rear) {
            queue.front = queue.rear = null;
        } else{
            queue.front = queue.front.link;
            queue.rear.link = queue.front;
        }
    }
    public static void displayQueue(Queue queue) {
        if (queue.front == null) {
            System.out.println("Queue is empty");
        } else {
            Node current = queue.front;
            do {
                System.out.println(current.data);
                current = current.link;
            }while (current != queue.front);
        }
    }
}
