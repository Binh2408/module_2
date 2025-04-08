package ss3_array_in_java.bai_tap.bai_4_tim_phan_tu_lon_nhat_trong_mang_hai_chieu;

import java.util.Scanner;

//Hướng dẫn
//Bước 1: tìm phần tử lớn nhất của ma trận có sẵn
//Dùng mảng hai chiều để phản ánh ma trận.
//Dùng phương pháp khởi tạo nhanh để tạo ra ma trận có sẵn các phần tử. Khai báo một biến số thực để chứa giá trị lớn nhất tìm kiếm được, 
// và hai số nguyên để chứa tọa độ của giá trị lớn nhất tìm kiếm được, đặt cho những biến đó giá trị tương ứng của một phần tử ở tọa độ bất kỳ trong ma trận.
// Sử dụng vòng lặp để duyệt qua hết các phần tử của ma trận, cập nhật kết quả mỗi khi tìm thấy giá trị lớn hơn.
//
//Thông báo cho người dùng kết quả tìm thấy được sau khi duyệt hết ma trận.
//
//Thực thi chương trình để kiểm tra, thử với một số giá trị khác nhau để xác nhận rằng chương trình chạy đúng.
//
//Bước 2: thu thập đầu vào thực từ nhập liệu của người dùng và hoàn thành yêu cầu
//
//Viết mã để thay thế ma trận được tạo nhanh bằng ma trận được tạo ra từ nhập liệu của người dùng. 
// Hỏi để biết kích thước ma trận, sau đó sử dụng vòng lặp để lần lượt hỏi từng giá trị của ma trận.
public class FindMaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = createMatrix(scanner);
        printMatrix(matrix);
        System.out.println("Phần tử lớn nhất trong ma trận là: " + findMaxElement(matrix));
        
    }
    //tạo matrix
    public static int[][] createMatrix(Scanner scanner) {
        System.out.println("Nhập độ dài của hàng muốn tạo: ");
        int rows = scanner.nextInt();
        System.out.println("Nhập độ dài của cột muốn tạo: ");
        int cols = scanner.nextInt();
        while (rows <= 0 || cols <= 0) {
            System.out.println("Nhập lại độ dài của hàng: ");
            rows = scanner.nextInt();
            System.out.println("Nhập lại độ dài của cột: ");
            cols = scanner.nextInt();
        }
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Nhập giá trị tại hàng " + i + " cột thứ " + j + " :");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
        
    }
    //in matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    } 
    public static int findMaxElement(int[][] matrix) {
        int max = matrix[0][0];
        int row = 0;
        int col = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("Phần tử lớn nhất nằm ở hàng " + row + ", cột " + col);
        return max;
    }
}
