
public class Circle extends figure{
    double[] centre;
    double radius;

    public Circle(double radius) {
        centre = point;
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    public double getSurface() {
        return 3.14 * (radius * radius);
    }

    public double getDiameter() {
        return 2*radius;
    }

    public void move(double dx, double dy) {
        centre[0] += dx;
        centre[1] += dy;
    }

    public double[] getPoint() {
        return centre;
    }
}
