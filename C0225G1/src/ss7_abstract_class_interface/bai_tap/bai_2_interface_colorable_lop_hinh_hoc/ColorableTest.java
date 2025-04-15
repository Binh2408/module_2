package ss7_abstract_class_interface.bai_tap.bai_2_interface_colorable_lop_hinh_hoc;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(3.0);
        shapes[1] = new Rectangle(4.0, 5.0);
        shapes[2] = new Square(6.0);
        shapes[3] = new Square(7.0);

        for (Shape shape : shapes) {
            // Nếu là Colorable, hiển thị màu
            if (shape instanceof Circle) {
                System.out.println("Area = " + ((Circle)shape).getArea());
            } else if (shape instanceof Rectangle){
                System.out.println("Area = " + ((Rectangle)shape).getArea());
            } else {
                IColorable colorable = (Square)shape;
                colorable.howToColor();
            }
            System.out.println("-------------");
        }
    }
}

