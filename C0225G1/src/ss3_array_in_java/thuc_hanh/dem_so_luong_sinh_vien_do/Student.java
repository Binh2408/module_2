package ss3_array_in_java.thuc_hanh.dem_so_luong_sinh_vien_do;

import java.util.Scanner;

//Mô tả
//Trong phần này, chúng ta sẽ phát triển một chức năng cho phép đếm số lượng sinh viên đã thi đỗ một kỳ thi, dựa vào danh sách điểm được nhập vào.
//
//Sử dụng thang điểm 10, điểm đỗ là từ 5 trở lên.
//
//Ứng dụng cho phép nhập vào điểm của tối đa 30 sinh viên, sau đó hiển thị số lượng sinh viên đã thi đỗ.
public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên");
        int size = scanner.nextInt();
        while (size <= 0 || size > 30) {
            System.out.println("Nhập lại số lượng");
            size = scanner.nextInt();
        }
        int[] studentsMark = new int[size];
        for (int i = 0; i < studentsMark.length; i++) {
            System.out.print("Nhập điểm cho sinh viên thứ " + i + ": ");
            studentsMark[i] = scanner.nextInt();
        }
        System.out.print("Danh sách điểm của các sinh viên: ");
        for (int value : studentsMark) {
            System.out.print(value + "\t");
        }
        System.out.println();
        int count = 0;
        for (int i = 0; i < studentsMark.length; i++) {
            if (studentsMark[i] >= 5 && studentsMark[i] <= 10) {
                count++;
            }
        }
        System.out.println("Số lượng sinh viên đỗ: " + count);
    }
}
