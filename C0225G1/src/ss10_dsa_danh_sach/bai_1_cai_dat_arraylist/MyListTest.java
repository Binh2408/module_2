package ss10_dsa_danh_sach.bai_1_cai_dat_arraylist;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();

        // Thêm phần tử
        list.add("Java");
        list.add("Python");
        list.add("C++");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // In ra size
        System.out.println("Size: " + list.size()); // 3

        // Lấy phần tử
        System.out.println("Element at 1: " + list.get(1)); // Python

        // Thêm vào vị trí
        list.add(1, "JavaScript");
        System.out.println("After insert at 1: " + list.get(1)); // JavaScript

        // Kiểm tra chứa
        System.out.println("Contains Java: " + list.contains("Java")); // true
        System.out.println("Contains PHP: " + list.contains("PHP"));   // false

        // Vị trí phần tử
        System.out.println("Index of C++: " + list.indexOf("C++")); // 3

        // Xóa phần tử
        list.remove(2); // Xóa Python
        System.out.println("After remove at 2: " + list.get(2)); // C++

        // Clone
        MyList<String> copied = list.clone();
        System.out.println("Copied size: " + copied.size()); // 3

        // Clear
        list.clear();
        System.out.println("Size after clear: " + list.size()); // 0
    }
}
