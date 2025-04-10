package ss4_class_object_in_java.bai_tap.bai_3_xay_dung_lop_fan;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public Fan() {
    }
    @Override
    public String toString() {
        if (on) {
            return "Fan is on with speed " + speed + ", color " + color + ", radius " + radius;
        } else {
            return "Fan is off with color " + color + ", radius " + radius;
        }
    }

}
