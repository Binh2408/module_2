package ss6_ke_thua.bai_tap.bai_3_lop_point_moveable_point;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(2.0f, 3.0f, 1.5f, 2.5f);
        System.out.println("Trước khi move: " + point);

        point.move();
        System.out.println("Sau khi move: " + point);

        point.move().move(); // gọi liên tiếp để di chuyển thêm
        System.out.println("Sau khi move 2 lần nữa: " + point);
    }
}
