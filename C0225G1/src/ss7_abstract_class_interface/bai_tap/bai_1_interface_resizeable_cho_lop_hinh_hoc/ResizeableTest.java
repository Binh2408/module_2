package ss7_abstract_class_interface.bai_tap.bai_1_interface_resizeable_cho_lop_hinh_hoc;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.0);
        shapes[1] = new Rectangle(4.0, 5.0);
        shapes[2] = new Square(6.0);
        double percent = Math.random() * 100 + 1;

        for (Shape shape : shapes) {
            System.out.println("Update percent: " + percent);
            if (shape instanceof Circle){
                System.out.println("Before resize: " +((Circle) shape).getArea());
                ((Circle)shape).resize(percent);
                System.out.println("After resize: "+((Circle) shape).getArea());
            } else if (shape instanceof Rectangle){
                System.out.println("Before resize: " +((Rectangle) shape).getArea());
                ((Rectangle)shape).resize(percent);
                System.out.println("After resize: " +((Rectangle) shape).getArea());
            } else if (shape instanceof Square) {
                System.out.println("Before resize: " +((Square) shape).getArea());
                ((Square)shape).resize(percent);
                System.out.println("After resize: " +((Square) shape).getArea());
            }
            System.out.println("-------------");
        }
    }
}
