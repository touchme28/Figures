
public class Triangle extends figure{
    double[] v1;
    double[] v2;
    double[] v3;
    double[][] all_cords = new double[3][2];
    //Point[] cords = new Point[3];

    public Triangle(double[] v1,double[] v2,double[] v3){

        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    double v12 = Math.sqrt((v1[0]*v1[0] + 2*v1[0]*v2[0] - v2[0]*v2[0]) + (v1[1]*v1[1] + 2*v1[1]*v2[1] - v2[1]*v2[1]));
    double v13 = Math.sqrt((v1[0]*v1[0] + 2*v1[0]*v3[0] - v3[0]*v3[0]) + (v1[1]*v1[1] + 2*v1[1]*v3[1] - v3[1]*v3[1]));
    double v23 = Math.sqrt((v2[0]*v2[0] + 2*v2[0]*v3[0] - v3[0]*v3[0]) + (v2[1]*v2[1] + 2*v2[1]*v3[1] - v3[1]*v3[1]));

    public double getSurface() {
        //double v12 = Math.sqrt((v1[0]*v1[0] + 2*v1[0]*v2[0] - v2[0]*v2[0]) + (v1[1]*v1[1] + 2*v1[1]*v2[1] - v2[1]*v2[1]));
        //double v13 = Math.sqrt((v1[0]*v1[0] + 2*v1[0]*v3[0] - v3[0]*v3[0]) + (v1[1]*v1[1] + 2*v1[1]*v3[1] - v3[1]*v3[1]));
        //double v23 = Math.sqrt((v2[0]*v2[0] + 2*v2[0]*v3[0] - v3[0]*v3[0]) + (v2[1]*v2[1] + 2*v2[1]*v3[1] - v3[1]*v3[1]));
        double p = (1/2) * (v12 + v13 + v23);
        return Math.sqrt(p*(p-v12)*(p-v13)*(p-v23));
    }

    public double getPerimeter() {
        return v12 + v13 + v23;
    }
    public boolean isIsoceles() {
        if(v12 == v13) {return true;}
        if(v12 == v23) {return true;}
        if(v23 == v13) {return true;}
        return false;
    }

    public boolean EstEquilateral() {
        if(v12 == v23 & v13 == v12 & v23 == v13) { return true;};
        return false;
    }

    public boolean isRectangle() {
        if(((v12*v12)+(v13*v13)-(v23*v23)) / (2*v12*v13) == 0){ return true;}
        return false;
    }

    public void move(double dx, double dy) {
        v1[0] += dx;
        v1[1] += dy;
        v2[0] += dx;
        v2[1] += dy;
        v3[0] += dx;
        v3[1] += dy;
    }

    public double[][] getPoint() {
        all_cords[0][0] = v1[0];
        all_cords[0][1] = v1[1];
        all_cords[1][0] = v2[0];
        all_cords[1][1] = v2[1];
        all_cords[2][0] = v3[0];
        all_cords[2][1] = v3[1];
        return all_cords;
    }
}
