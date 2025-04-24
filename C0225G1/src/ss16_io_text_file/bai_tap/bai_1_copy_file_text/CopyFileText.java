package ss16_io_text_file.bai_tap.bai_1_copy_file_text;

import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập file nguồn: ");
        String sourceFileName = scanner.nextLine();
        System.out.println("Nhập file đích: ");
        String targetFileName = scanner.nextLine();

        File sourceFile = new File(sourceFileName);
        File targetFile = new File(targetFileName);
        if (!sourceFile.exists()) {
            System.out.println("File nguồn ko tồn tại");
            return;
        }
        if (targetFile.exists()) {
            System.out.println("File đích đã tồn tại");
            return;
        }
        int charCount = 0;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFile))) {
            int character;
            while ((character = bufferedReader.read()) != -1) {
                bufferedWriter.write(character);
                charCount++;
            }
            System.out.println("Sao chép thành công " + charCount + " ký tự");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
