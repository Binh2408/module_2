package ss3_array_in_java.thuc_hanh.tim_gia_tri_lon_nhat_trong_mang;

import java.util.Scanner;

public class MaxNumberArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element " + (i+1) + " : " );
            array[i] = scanner.nextInt();
        }
        System.out.println("Property list: ");
        for (int i : array) {
            System.out.println(i + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (max < array[j]) {
                max = array[j];
                index = j+1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at positon: " + index);
    }
}
