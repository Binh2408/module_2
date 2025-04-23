package ss15_exception_debug.bai_tap.su_dung_illegal_triangle_exception;

public class Triangle {
    private int edge1;
    private int edge2;
    private int edge3;

    public Triangle() {
    }

    public Triangle(int edge1, int edge2, int edge3) throws IllegalTriangleException {
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
        validateTriangle();

    }

    public int getEdge1() {
        return edge1;
    }

    public void setEdge1(int edge1) {
        this.edge1 = edge1;
    }

    public int getEdge2() {
        return edge2;
    }

    public void setEdge2(int edge2) {
        this.edge2 = edge2;
    }

    public int getEdge3() {
        return edge3;
    }

    public void setEdge3(int edge3) {
        this.edge3 = edge3;
    }
    private void validateTriangle() throws IllegalTriangleException {
        if (edge1 < 0 || edge2 < 0 || edge3 < 0) {
            throw new IllegalTriangleException("Lỗi nhập cạnh là âm!!!");
        } else if (edge1 + edge2 <= edge3 || edge1 + edge3 <= edge2 || edge2 + edge3 <= edge1) {
            throw new IllegalTriangleException("Tổng 2 cạnh không lớn hơn cạnh còn lại");
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "edge1=" + edge1 +
                ", edge2=" + edge2 +
                ", edge3=" + edge3 +
                '}';
    }
}
