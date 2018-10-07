public class Circle extends  GeometricShape{

    public Circle(Point pt1, Point pt2) {
        super(pt1, pt2);
    }

    public Circle() {
    }

    ShapeCalculator sc = new ShapeCalculator();

    @Override
    public String toString() {
        String res;
        res = "Okrag o srodku w punkcie ["
                + pt1.x +", " + pt1.y + "]"
                + " o promieniu "
                + LineCalc.lineLength(pt1, pt2)
                + " ma powierzchnie "
                + sc.shapeArea(this);
        return res;
    }
}
