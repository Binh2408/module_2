package ss3_array_in_java.bai_tap.bai_6_tinh_tong_cac_so_o_mot_cot_xac_dinh;

import java.util.Scanner;

//Hướng dẫn
//Bước 1: tính tổng các phần tử của một mảng có sẵn
//
//Dùng phương pháp khởi tạo nhanh để tạo ra một mảng có sẵn các phần tử. Viết mã để hỏi người dùng muốn tính tổng của cột mấy. 
// Tổng của một cột là tổng các phần tử có vị trí j trong định vị [][i], sử dụng vòng lặp để tính tổng các phần tử này và trả về.
//
//Thực thi chương trình để kiểm tra kết quả, thử với một số giá trị khác nhau để xác nhận rằng chương trình chạy đúng.
//
//Bước 2: thu thập mảng thực từ nhập liệu của người dùng và hoàn thành yêu cầu
//
//Viết mã để thay thế mảng được tạo nhanh bằng mảng được tạo ra từ nhập liệu của người dùng.
// Trước tiên hỏi để biết kích thước các chiều của mảng, sau đó sử dụng vòng lặp để lần lượt hỏi từng giá trị của mảng.
public class SumInRow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arrays = createArrays(scanner);
        System.out.println("Mảng sau khi được thêm vào: ");
        printArrays(arrays);
        System.out.println(sumInRow(arrays,scanner));
    }
    public static int[][] createArrays(Scanner scanner) {
        System.out.println("Nhập độ dài cho hàng");
        int rows = scanner.nextInt();
        System.out.println("Nhập độ dài cho cột");
        int cols = scanner.nextInt();
        while (cols <= 0 || rows <= 0) {
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
    public static int sumInRow(int[][] arrays, Scanner scanner) {
        int sum = 0;
        System.out.println("Nhập cột mà bạn muốn tính: ");
        int col = scanner.nextInt();
        if (col < 0 || col >= arrays[0].length) {
            System.out.println("Cột không hợp lệ.");
            return 0;
        }
        for (int i = 0; i < arrays.length; i++) {
                sum += arrays[i][col];
        }
        System.out.println("Tổng các phần tử ở cột " + col);
        return sum;
    }
}
