package ss4_class_object_in_java.bai_tap.bai_1_phuong_trinh_bac_hai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phương trình bậc hai có dạng: ax2+bx+x = 0");
        System.out.println("Nhập số thứ nhất cho a");
        double a = scanner.nextDouble();
        System.out.println("Nhập số thứ hai cho b");
        double b = scanner.nextDouble();
        System.out.println("Nhập số thứ ba cho c");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.println("Phương trình có hai nghiệm: " + quadraticEquation.getRoot1() + " và " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Phương trình có 1 nghiệm: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
