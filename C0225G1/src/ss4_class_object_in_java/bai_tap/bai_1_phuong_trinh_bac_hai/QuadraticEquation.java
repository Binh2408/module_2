package ss4_class_object_in_java.bai_tap.bai_1_phuong_trinh_bac_hai;

public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    
    public double getDiscriminant() {
        return Math.pow(getB(),2) - (4*getA()*getC());
    }
    public double getRoot1() {
        return (-getB()+Math.sqrt(getDiscriminant()))/(2*getA());
    }
    public double getRoot2() {
        return (-getB()-Math.sqrt(getDiscriminant()))/(2*getA());
    }
}
