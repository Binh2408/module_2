package ss3_array_in_java.bai_tap.bai_1_xoa_phan_tu_khoi_mang;

import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int number = scanner.nextInt();
        while (number <= 0) {
            number = scanner.nextInt();
        }
        int[] arrays = new int[number];
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Enter element at position " + (i + 1) + " :");
            arrays[i] = scanner.nextInt();
        }
        printArray(arrays);
        int[] newArrays = deleteElement(arrays, scanner);
        printArray(newArrays);
    }
    public static int[] deleteElement(int[] arrays, Scanner scanner) {
        System.out.println("\nEnter number want delete: ");
        int numberToDelete = scanner.nextInt();
        int index_del = -1;
        for (int i = 0; i < arrays.length; i++) {
            if (numberToDelete == arrays[i]) {
                index_del = i;
                System.out.println("Number want delete at position: " + i);
                break;
            }
        }
        if (index_del != -1) {
            for (int i = index_del; i < arrays.length-1; i++) {
                arrays[i] = arrays[i+1];
            }
        } else {
            System.out.println("Element not found!!!");
            return arrays;
        }
        // Tạo mảng mới bỏ phần tử cuối
        int[] newArrays = new int[arrays.length - 1];
        for (int i = 0; i < newArrays.length; i++) {
            newArrays[i] = arrays[i];
        }
        return newArrays;
    }
    public static void printArray(int[] arrays) {
        for (int value : arrays) {
            System.out.print(value + " ");
        }
        System.out.println(); // Xuống dòng sau khi in xong
    }
}
