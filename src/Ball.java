public class Ball extends Shape3D {

    public Ball() {
    }

    public Ball(Point3D pt1, Point3D pt2) {
        super(pt1, pt2);
    }

    ShapeCalculator sc = new ShapeCalculator();

    @Override
    public String toString() {
        return "Kula o srodku w punkcie "
                + pt1.toString()
                + " o dlugosci promienia "
                + LineCalc.lineLength(pt1, pt2)
                + " oraz polu powierzchni "
                + sc.volume(this);
    }
}
