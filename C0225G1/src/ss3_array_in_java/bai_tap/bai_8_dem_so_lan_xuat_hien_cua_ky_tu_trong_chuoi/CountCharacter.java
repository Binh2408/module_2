package ss3_array_in_java.bai_tap.bai_8_dem_so_lan_xuat_hien_cua_ky_tu_trong_chuoi;

import java.util.Scanner;

//Bước 1: Khai báo một chuỗi và gán cho nó một giá trị
//
//Bước 2: Khai báo một biến ký tự và gán hoặc nhập từ bàn phím một giá trị.
//
//Bước 3: Khai báo biến count và gán giá trị 0, để lưu số ký tự đếm được trong chuỗi
//
//Bước 4: Sử dụng vòng lặp duyệt từng ký tự trong chuỗi. 
// Trong quá trình duyệt: so sánh nếu ký tự trong chuỗi bằng ký tự nhập vào thì tăng biến đếm lên 1
//
//Lưu ý:
//
//Hàm str.length() trả về tổng số ký tự trong một chuỗi str
//
//Hàm str.charAt(i) trả về ký tự ở vị trí thứ i trong chuỗi str
//
//Bước 5: In ra giá trị biến đếm.
public class CountCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "CodeGym ee";
        System.out.println("Nhập kí tự muốn tìm");
        char character = scanner.nextLine().charAt(0); 
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("Kí tự " + character + " được tìm thấy " + count + " lần.");
        
    }
}
