package ss3_array_in_java.bai_tap.bai_3_gop_mang;

import java.util.Scanner;

//Gợi ý các bước thực hiện
//Bước 1: Tạo 2 mảng số với kích thước cho trước
//
//Bước 2: Sử dụng vòng lặp nhập giá trị cho các phần tử trong mảng
//
//Bước 3: Tạo mảng thứ 3 có kích thước bằng kích thước mảng 1 + kích thước mảng 2
//
//Bước 4: Sử dụng vòng lặp để duyệt các phần tử trong mảng 1. Lấy từng phần tử trong mảng 1 gán vào từng phần tử trong mảng thứ 3, tính từ phần tử đầu tiên.
//
//Bước 5: Sử dụng vòng lặp để duyệt các phần tử trong mảng 2. Lấy từng phần tử trong mảng 2 gán vào phần tử tiếp theo của mảng 3, tính từ phần tử array3[array2.length]
public class MergeArray {
    public static void main(String[] args) {
        int[] arrays1 = new int[5];
        int[] arrays2 = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrays1.length; i++) {
            System.out.println("Nhập giá trị của mảng 1 tại vị trí " + i);
            arrays1[i] = scanner.nextInt();
        }
        System.out.println("Mảng 1: ");
        printArray(arrays1);
        for (int i = 0; i < arrays2.length; i++) {
            System.out.println("Nhập giá trị của mảng 2 tại vị trí " + i);
            arrays2[i] = scanner.nextInt();
        }
        System.out.println("Mảng 2: ");
        printArray(arrays2);
        int[] arrays3 = new int[arrays1.length+arrays2.length];
        //cách 1
        for (int i = 0; i < arrays1.length; i++) {
            arrays3[i] = arrays1[i];
        }
        for (int i = 0; i < arrays2.length; i++) {
            arrays3[arrays1.length+i] = arrays2[i];
        }
//        cách 2
//        System.arraycopy(arrays1, 0, arrays3, 0, arrays1.length);
//        System.arraycopy(arrays2, 0, arrays3, arrays1.length, arrays2.length);
        System.out.println("Mảng 3 sau khi gộp từ mảng 1 và mảng 2");
        printArray(arrays3);
    }
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.println(value);
        }
    }
}
