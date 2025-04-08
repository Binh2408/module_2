package ss3_array_in_java.bai_tap.bai_5_tim_gia_tri_nho_nhat_trong_mang;

import java.util.Scanner;

//Gợi ý các bước thực hiện
//Bước 1: Khai báo mảng số nguyên với SIZE phần tử
//
//Bước 2: Nhập giá trị cho các phần tử trong mảng từ bàn phím
//
//Bước 3: Gọi phần tử đầu tiên trong mảng là phần tử có giá trị nhỏ nhất
//
//Bước 4: Duyệt mảng từ phần tử thứ 2 đến hết mang
//
//So sánh lần lượt các phần tử tiếp theo với giá trị nhỏ nhất.
//
//Nếu phần tử tiếp theo nhỏ hơn giá trị nhỏ nhất thì gán giá trị nhỏ nhất là phần tử tiếp theo.
//
//Bước 5: Kết thúc duyệt mảng. In ra giá trị nhỏ nhất.
public class FindMinElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrays = createArray(scanner);
        printArray(arrays);
        System.out.println();
        System.out.println("Giá trị nhỏ nhất là: " + findMin(arrays));
    }
    public static int[] createArray(Scanner scanner) {
        System.out.println("Nhập độ dài cho mảng: ");
        int number = scanner.nextInt();
        while (number <= 0) {
            System.out.println("Nhập lại độ dài cho mảng: ");
            number = scanner.nextInt();
        }
        int[] arrays = new int[number];
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Nhập giá trị tại vị trí " + i + " :");
            arrays[i] = scanner.nextInt();
        }
        return arrays;
    }
    public static void printArray(int[] arrays) {
        for (int value : arrays) {
            System.out.print(value + "\t");
        }
    }
    public static int findMin(int[] arrays) {
        int min = arrays[0];
        int index = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (min > arrays[i]) {
                min = arrays[i];
                index = i;
            }
        }
        System.out.println("Giá trị nhỏ nhất nằm ở vị trí: " + index);
        return min;
    }
}
