public class main {
    public static void main(String[] args) {
        Rectangle test = new Rectangle(2,3);
        test.setColor(1);
        System.out.println(test.getColor());
        System.out.println(test.getPerimeter());
        System.out.println(test.getSurface());
        test.move(-1,2);
        double[] cords = test.getPoint();
        for(int i=0;i<2;i++){
            System.out.println(cords[i]);
        }
    }
}
