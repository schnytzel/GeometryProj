public class Line2D extends Shape2D{

    public Line2D() {
    }

    public Line2D(Point pt1, Point pt2) {
        super(pt1, pt2);
    }

    @Override
    public String toString() {
        String res = "Odcinek wyznaczony przez wspolrzedne "
                + "[" + pt1.x + ", "
                + pt1.y + "]"
                + " [" + pt2.x + ", "
                + pt2.y + "]"
                + " ma dlugosc "
                + ShapeCalculator.lineLength(this);
        return res;
    }
}
