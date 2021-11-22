
public class Square extends figure{
    double[] v;
    double edge;

    public Square(double edge) {
        v = point;
        this.edge = edge;
    }

    public double getPerimeter() {
        return 4 * edge;
    }

    public double getSurface() {
        return edge * edge;
    }
    public void move(double dx, double dy) {
        v[0] += dx;
        v[1] += dy;
    }

    public double[] getPoint() {
        return v;
    }
}
