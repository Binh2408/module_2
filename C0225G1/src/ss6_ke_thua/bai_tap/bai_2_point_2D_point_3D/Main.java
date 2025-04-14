package ss6_ke_thua.bai_tap.bai_2_point_2D_point_3D;

public class Main {
    public static void main(String[] args) {
        Point2D p2d = new Point2D(1.2f, 3.4f);
        System.out.println("Point2D: " + p2d);

        Point3D p3d = new Point3D(5.6f, 7.8f, 9.0f);
        System.out.println("Point3D: " + p3d);

        // Sử dụng setXYZ và getXYZ
        p3d.setXYZ(1.0f, 2.0f, 3.0f);
        float[] coords = p3d.getXYZ();
        System.out.println("Point3D sau khi setXYZ: (" + coords[0] + ", " + coords[1] + ", " + coords[2] + ")");
    }
}

