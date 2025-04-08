package ss3_array_in_java.bai_tap.bai_7_tinh_tong_cac_so_duong_cheo_chinh_cua_ma_tran_vuong;

import java.util.Scanner;

//Hướng dẫn
//Bước 1: tính tổng các phần tử của một ma trận vuông có sẵn
//
//Dùng một mảng hai chiều để phản ánh ma trận.
//
//Dùng phương pháp khởi tạo nhanh để tạo ra một mảng có sẵn các phần tử. Sử dụng vòng lặp để tính tổng tất cả các phần tử có tọa độ ở hàng ngang và cột dọc bằng nhau.
// Thông báo cho người dùng.
//
//Thực thi chương trình để kiểm tra kết quả, 
// thử với một số giá trị khác nhau để xác nhận rằng chương trình chạy đúng.
//
//Bước 2: thu thập mảng thực từ nhập liệu của người dùng và hoàn thành yêu cầu
//
//Viết mã để thay thế mảng được tạo nhanh bằng mảng được tạo ra từ nhập liệu của người dùng. 
// Trước tiên hỏi để biết kích thước ma trận, sau đó sử dụng vòng lặp để lần lượt hỏi từng giá trị của mảng.
public class SumMainDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arrays = createArrays(scanner);
        printArrays(arrays);
        System.out.println("Tổng độ dài 2 đường chéo là: " + sumDiagonal(arrays));
        
    }
    public static int[][] createArrays(Scanner scanner) {
        System.out.println("Nhập độ dài cho hàng");
        int rows = scanner.nextInt();
        System.out.println("Nhập độ dài cho cột");
        int cols = scanner.nextInt();
        while (rows <= 0 || cols <= 0 || rows != cols) {
            System.out.println("Nhập lại độ dài cho cột và hàng");
            rows = scanner.nextInt();
            cols = scanner.nextInt();
        }
        int[][] arrays = new int[rows][cols];
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print("Nhập giá trị cho hàng thứ " + i + " cột thứ " + j + ": ");
                arrays[i][j] = scanner.nextInt();
            }
        }
        return arrays;
    }
    public static void printArrays(int[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int sumDiagonal(int[][] arrays) {
        int sumDiagonalRightToLeft = 0;
        int sumDiagonalLeftToRight = 0;
        for (int i = 0; i < arrays.length; i++) {
            sumDiagonalRightToLeft += arrays[i][i];
            sumDiagonalLeftToRight += arrays[i][arrays.length - 1 - i];
        }
        return sumDiagonalLeftToRight+sumDiagonalRightToLeft;
    }
}
