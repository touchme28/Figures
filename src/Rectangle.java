
public class Rectangle extends figure {
    double[] v;
    double edgeX;
    double edgeY;

    public Rectangle(double edgeX,double edgeY) {
        v = point;
        this.edgeX = edgeX;
        this.edgeY = edgeY;
    }
    public double getPerimeter() {
        return 2*(edgeX+edgeY);
    }
    public double getSurface() {
        return edgeX*edgeY;
    }

    public void move(double dx, double dy) {
        v[0] += dx;
        v[1] += dy;
    }

    public double[] getPoint() {
        return v;
    }
}
