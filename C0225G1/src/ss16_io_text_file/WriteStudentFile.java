package ss16_io_text_file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteStudentFile {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Bình",23,"Đà Nẵng"));
        studentList.add(new Student("Đông",23,"KonTum"));
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/ss16_io_text_file/student.txt",true))) {
            for (Student student: studentList) {
                writer.write(student.getName() + " " + student.getAge() + " " + student.getAddress());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
        System.out.println("Đã ghi file thành công");
    }
}
