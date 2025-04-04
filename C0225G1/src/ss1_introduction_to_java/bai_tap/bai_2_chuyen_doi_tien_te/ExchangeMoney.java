package ss1_introduction_to_java.bai_tap.bai_2_chuyen_doi_tien_te;

import java.util.Scanner;

public class ExchangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double EXCHANGE_RATE = 23000;
//        System.out.println("Nhập số tiền USD: ");
//        double USD = scanner.nextFloat();
//        System.out.println("Giá trị VNĐ: " + String.format("%f",USD*EXCHANGE_RATE));
        
        while (true) {
            System.out.println("Lựa chọn loại tiền muốn đổi");
            System.out.println("1.Chuyển VNĐ sang USD");
            System.out.println("2.Chuyển USD sang VNĐ");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn: ");
            int choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println("Hẹn gặp lại nhé!");
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("Nhập số tiền VNĐ cần đổi sang USD vào: ");
                    double VND = scanner.nextDouble();
                    System.out.println("Số tiền sau khi chuyển đổi: " + String.format("%.7f", VND/EXCHANGE_RATE) + "USD");
                    break;
                case 2:
                    System.out.println("Nhập số tiền USD cần đổi sang VNĐ vào: ");
                    double USD = scanner.nextDouble();
                    System.out.println("Số tiền USD sau khi chuyển sang VNĐ: " + String.format("%.1f",USD*EXCHANGE_RATE) + "VNĐ");
                    break;
                default:
                    System.out.println("Vui lòng nhập đúng 0,1 hoặc 2!!!");
            }
        }
    }
}
