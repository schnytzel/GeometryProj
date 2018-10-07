public abstract class Shape2D extends Shape {
    Point pt1;
    Point pt2;

    public Shape2D() {
        pt1 = new Point();
        pt1.readPt();
        pt2 = new Point();
        pt2.readPt();
    }

    public Shape2D(double x1, double y1, double x2, double y2) {
        this.pt1 = new Point(x1, y1);
        this.pt2 = new Point(x2, y2);
    }

    public Shape2D(Point pt1, Point pt2) {
        this.pt1 = pt1;
        this.pt2 = pt2;
    }

    @Override
    public String toString() {
        return "Shape2D{" +
                "pt1=" + pt1.toString() +
                ", pt2=" + pt2.toString() +
                '}';
    }
}
