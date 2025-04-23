package ss16_io_text_file;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadStudentFile {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("src/ss16_io_text_file/student.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ", 3); // Tách thành 3 phần: tên, tuổi, địa chỉ
                if (parts.length == 3) {
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1]);
                    String address = parts[2];
                    Student student = new Student(name, age, address);
                    studentList.add(student);
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }

        // In danh sách sinh viên
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}

