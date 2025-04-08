package ss3_array_in_java.bai_tap.bai_2_them_phan_tu_vao_mang;

import java.util.Scanner;

//Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước.
//
//Bước 2: Nhập X là số cần chèn
//
//Bước 3: Nhập vào vị trí index cần chèn X vào trong mảng
//
//Bước 4: Nếu index <= -1 và index >= array.length – 1 thì hiển thị không chèn được phần tử vào mảng.
//
//Bước 5: Thực hiện chèn phần tử X ở vị trí index vào mảng
//
//Bước 6: In ra mảng
public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài cho mảng: ");
        int number = scanner.nextInt();
        while (number <= 0) {
            System.out.println("Nhập lại độ dài: ");
            number = scanner.nextInt();
        }
        int[] arrays = new int[number];
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Nhập giá trị tại vị trí " +i);
            arrays[i] = scanner.nextInt();
        }
        printArray(arrays);
        System.out.println("Nhập số cần thêm vào: ");
        int elementToAdd = scanner.nextInt();
        System.out.println("Nhập vị trí cần thêm");
        int index = scanner.nextInt();
        if (index < 0 || index > arrays.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng.");
            return;
        }
        int[] newArrays = new int[arrays.length+1];
        for (int i = 0; i < index; i++) {
            newArrays[i] = arrays[i];
        }
        newArrays[index] = elementToAdd;
        for (int i = index; i < arrays.length; i++) {
            newArrays[i+1] = arrays[i];
        }
        System.out.println("Mảng sau khi thêm phần tử");
        printArray(newArrays);
    }

    public static void printArray(int[] arrays) {
        for (int value : arrays) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
