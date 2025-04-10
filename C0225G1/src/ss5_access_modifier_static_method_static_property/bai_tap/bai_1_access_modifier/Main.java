package ss5_access_modifier_static_method_static_property.bai_tap.bai_1_access_modifier;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle.toString());
        
        Circle circle1 = new Circle(2.5);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());
        System.out.println(circle1.toString());
    }
}
