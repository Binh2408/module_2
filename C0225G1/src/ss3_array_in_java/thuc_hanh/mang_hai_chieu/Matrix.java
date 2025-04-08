package ss3_array_in_java.thuc_hanh.mang_hai_chieu;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        //Nhập giá trị vào mảng
//        System.out.println("Enter " + matrix.length + " rows and " +
//                matrix[0].length + " columns: ");
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                matrix[row][column] = scanner.nextInt();
//            }
//        }
        //Nhập các giá trị ngẫu nhiên vào mảng
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }
        //in mảng
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        //Tinh tổng các phần tử trong mảng
        int totalAllElement = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                totalAllElement += matrix[row][column];
            }
        }
        System.out.println(totalAllElement);
        //tính tổng từng cột
        for (int column = 0; column < matrix[0].length; column++) {
            int totalCol = 0;
            for (int row = 0; row < matrix.length; row++)
                totalCol += matrix[row][column];
            System.out.println("Sum for column " + column + " is "
                    + totalCol);
        }
        //tìm dòng có tổng các phần tử lớn nhất
        int maxRow = 0;
        int indexOfMaxRow = 0;
// Get sum of the first row in maxRow
        for (int column = 0; column < matrix[0].length; column++) {
            maxRow += matrix[0][column];
        }
        for (int row = 1; row < matrix.length; row++) {
            int totalOfThisRow = 0;
            for (int column = 0; column < matrix[row].length; column++)
                totalOfThisRow += matrix[row][column];
            if (totalOfThisRow > maxRow) {
                maxRow = totalOfThisRow;
                indexOfMaxRow = row;
            }
        }
        System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);
        //Xáo trộn mảng
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int i1 = (int) (Math.random() * matrix.length);
                int j1 = (int) (Math.random() * matrix[i].length);

                // Swap matrix[i][j] with matrix[i1][j1]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i1][j1];
                matrix[i1][j1] = temp;
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }    
    }
}
