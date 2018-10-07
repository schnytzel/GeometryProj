public class Rectangle extends GeometricShape {

    public Rectangle(Point pt1, Point pt2) {
        super(pt1, pt2);
    }

    public Rectangle() {
    }

    ShapeCalculator sc = new ShapeCalculator();

    @Override
    public String toString() {
        double tmp1 = Math.abs(pt1.x - pt2.x);
        double tmp2 = Math.abs(pt1.y - pt2.y);
        return "Prostokat o dlugosci bokow "
                + tmp1 + " oraz " + tmp2
                + " ma pole, ktore wynosi "
                + sc.shapeArea(this);
    }
}
