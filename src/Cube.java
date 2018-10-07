public class Cube extends Shape3D {

    public Cube() {
    }

    public Cube(Point3D pt1, Point3D pt2) {
        super(pt1, pt2);
    }

    ShapeCalculator sc = new ShapeCalculator();

    @Override
    public String toString() {
        return "Szescian o dlugosci bokow ["
                + Math.abs(pt1.x-pt2.x) + ", "
                + Math.abs(pt1.y-pt2.y) + ", "
                + Math.abs(pt1.z-pt2.z) + "] "
                + "ma objetosc "
                + sc.volume(this);
    }
}
