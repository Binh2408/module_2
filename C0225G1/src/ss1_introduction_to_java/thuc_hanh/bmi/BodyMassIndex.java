package ss1_introduction_to_java.thuc_hanh.bmi;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Your weight (in kilogram):");
        weight = scanner.nextDouble();
        System.out.print("Your height (in meter):");
        height = scanner.nextDouble();
        bmi = weight/Math.pow(height,2);
        System.out.println("BMI: " + bmi);
        if (bmi < 18) {
            System.out.println(bmi + "\nUnderweight");
        } else if (bmi < 25.0) {
            System.out.println(bmi + "\nNormal");
        } else if (bmi < 30.0) {
            System.out.println(bmi + "\nOverweight");
        } else {
            System.out.println(bmi + "\nObese");
        }
    }
}
