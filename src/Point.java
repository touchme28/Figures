
public class Point extends figure{
    double[] v;

    public Point() {
        v = point;
    }

    public Point(Point another) {
        v = another.getPoint();
    }

    public Point(double x, double y) {
        v[0] = x;
        v[1] = y;

    }

    public double[] getPoint() {
        return v;
    }

    public void move(double dx, double dy) {
        v[0] += dx;
        v[1] += dy;
    }

    public double distanceTo(Point another) {
        double[] v_another = another.getPoint();
        double distance = Math.sqrt((v[0]*v[0] + 2*v[0]*v_another[0] - v_another[0]*v_another[0]) + (v[1]*v[1] + 2*v[1]*v_another[1] - v_another[1]*v_another[1]));
        return distance;
    }

    public double distanceXTo(Point another) {
        double[] v_another = another.getPoint();
        double distancex = Math.abs(v[0] - v_another[0]);
        return distancex;
    }

    public double distanceYTo(Point another) {
        double[] v_another = another.getPoint();
        double distancey = Math.abs(v[1] - v_another[1]);
        return distancey;
    }
}
