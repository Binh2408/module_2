package ss10_dsa_danh_sach.bai_1_cai_dat_arraylist;

// File: TestMyListWithObjects.java
public class MyStudentListTest {
    public static void main(String[] args) {
        MyList<Student> students = new MyList<>();

        // Tạo một vài Student
        Student s1 = new Student(1, "Bình");
        Student s2 = new Student(2, "Đông");
        Student s3 = new Student(3, "A Khánh");
        Student s4 = new Student(4, "A Chung");

        // Thêm vào cuối
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        System.out.println("After add: ");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getId() + "." + students.get(i).getName());
        }
        System.out.println("============================================");
        Student s5 = new Student(5, "A Duy");

        // Thêm vào vị trí 1
        students.add(1, s5);
        System.out.println("After add(1, A Duy): ");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getId() + "." + students.get(i).getName());
        }
        System.out.println("============================================");

        // Lấy phần tử
        System.out.println("get(2): " + students.get(2).getId() + "." + students.get(2).getName());
        System.out.println("============================================");

        // Kiểm tra contains
        System.out.println("contains(A Khánh)? " + students.contains(s3));  // true
        System.out.println("contains(new Student(5,...))? " + students.contains(new Student(6, "Chị Thảo"))); // false
        System.out.println("============================================");

        // indexOf
        System.out.println("indexOf(A Duy): " + students.indexOf(s5)); // 1
        System.out.println("============================================");

        // remove
        Student removed = students.remove(1);
        System.out.println("After remove(1): " + removed);
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getId() + "." + students.get(i).getName());
        }
        System.out.println("============================================");

        // clone
        MyList<Student> copy = students.clone();
        System.out.println("Cloned list: ");
        for (int i = 0; i < copy.size(); i++) {
            System.out.println(copy.get(i).getId() + "." + copy.get(i).getName());
        }
        System.out.println("============================================");

        // clear
        students.clear();
        System.out.println("After clear, size = " + students.size());
    }
}
