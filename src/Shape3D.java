public abstract class Shape3D extends Shape{
    Point3D pt1;
    Point3D pt2;

    public Shape3D() {
        pt1 = new Point3D();
        pt1.readPt();
        pt2 = new Point3D();
        pt2.readPt();
    }

    public Shape3D(Point3D pt1, Point3D pt2) {
        this.pt1 = pt1;
        this.pt2 = pt2;
    }
}
