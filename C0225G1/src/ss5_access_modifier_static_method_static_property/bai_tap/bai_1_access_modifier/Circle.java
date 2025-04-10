package ss5_access_modifier_static_method_static_property.bai_tap.bai_1_access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    Circle() {
    }
    Circle (double r) {
        this.radius = r;
    }
    public double getRadius() {
        return this.radius;
    }
    public double getArea() {
        return Math.pow(this.radius,2)*Math.PI;
    }
    public String toString() {
        return "Radius: " + this.radius + " with color: " + this.color;
    }
    
 }
