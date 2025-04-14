package ss6_ke_thua.bai_tap.bai_1_lop_circle_lop_cylinder;

public class Main {
    public static void main(String[] args) {
        //kiểm tra circle
        Circle circle = new Circle(5.0,"Red");
        System.out.println(circle);
        System.out.println("Diện tích: " + circle.getArea());
        System.out.println("Chu vi: " + circle.getPerimeter());
        System.out.println("------------------------------------------");
        Cylinder cylinder = new Cylinder(5.0,"Blue",10.0);
        System.out.println(cylinder);
        System.out.println("Diện tích đáy: " + cylinder.getArea());
        System.out.println("Thể tích: " + cylinder.getVolume());
    }
}
