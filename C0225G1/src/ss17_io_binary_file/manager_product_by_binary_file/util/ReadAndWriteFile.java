package ss17_io_binary_file.manager_product_by_binary_file.util;

import ss17_io_binary_file.manager_product_by_binary_file.entity.Phone;
import ss17_io_binary_file.manager_product_by_binary_file.entity.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void writeFileToCSV(String filePath, List<String> stringList, boolean append) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, append))) {
            for (String line: stringList) {
                writer.write(line);
                writer.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> readFileToCSV(String filePath) {
        List<String> stringList = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line = "";
            while((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringList;
    }

    public static void writeListPhoneToBinaryFile(String filePath, List<Phone> phoneList){
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            objectOutputStream.writeObject(phoneList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Phone> readBinaryFileToListPhone(String filePath) {
        List<Phone> phoneList = new ArrayList<>();
        File file = new File(filePath);

        // Kiểm tra nếu file không tồn tại hoặc file rỗng
        if (!file.exists() || file.length() == 0) {
            System.out.println("File không tồn tại hoặc đang rỗng.");
            return phoneList; // trả về danh sách rỗng
        }
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            phoneList = (List<Phone>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return phoneList;
    }




}
