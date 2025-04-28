package ss13_thuat_toan_tim_kiem.bai_tap.optional_bai_1_setting_binary_search_use_recursive;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int length = Integer.parseInt(scanner.nextLine());
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập giá trị tại vị trí " + i + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        // Bubble Sort để sắp xếp mảng từ bé đến lớn
        for (int i = 0; i < array.length - 1; i++) {
            // Duyệt qua mảng và hoán đổi các cặp phần tử liền kề nếu chúng không theo thứ tự
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Hoán đổi hai phần tử nếu phần tử đầu lớn hơn phần tử sau
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // In mảng đã sắp xếp
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        System.out.println("Nhập số cần tìm: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(binarySearch(array, 0, array.length-1,number));
    }
    public static int binarySearch(int[] array, int left, int right, int value) {
        while (left <= right) {
            int middle = (left+right)/2;
            if (array[middle] == value){
                return middle;
            } else if (value > array[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
