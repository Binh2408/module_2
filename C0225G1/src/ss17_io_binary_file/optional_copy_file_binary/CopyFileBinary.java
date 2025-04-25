package ss17_io_binary_file.optional_copy_file_binary;

import java.io.*;
import java.util.Scanner;

public class CopyFileBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập file nguồn: ");
        String sourceFileName = scanner.nextLine();
        System.out.println("Nhập file đích: ");
        String targetFileName = scanner.nextLine();

        File sourceFile = new File(sourceFileName);
        File targetFile = new File(targetFileName);

        if (!sourceFile.exists()) {
            System.out.println("File nguồn không tồn tại.");
            return;
        }

        if (targetFile.exists()) {
            System.out.println("File đích đã tồn tại.");
            return;
        }

        try (FileInputStream inputStream = new FileInputStream(sourceFile);
             FileOutputStream outputStream = new FileOutputStream(targetFile)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            int totalBytes = 0;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
                totalBytes += bytesRead;
            }

            System.out.println("Sao chép thành công! Số byte đã sao chép: " + totalBytes);

        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi sao chép file: " + e.getMessage());
        }
    }
}
