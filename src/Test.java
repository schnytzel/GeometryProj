import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.logging.SocketHandler;

public class Test {
    public static void main(String[] args) {
//        Line2D l1 = new Line2D();
//        Circle c1 = new Circle();
//        System.out.println(c1.toString());
//        Rectangle r1 = new Rectangle();
//        System.out.println(r1.toString());
        ShapeCalculator sc = new ShapeCalculator();
        ArrayList<Shape> arShape = new ArrayList<>();

        Point pt1 = new Point(0, 0);
        Point pt2 = new Point(1, 1);
        arShape.add(new Line2D(pt1, pt2));
        arShape.add(new Circle(pt1, pt2));
        arShape.add(new Rectangle(pt1, pt2));

        Point3D pt31 = new Point3D(0, 0, 0);
        Point3D pt32 = new Point3D(1, 1, 2);
        arShape.add(new Ball(pt31, pt32));
        arShape.add(new Cube(pt31, pt32));

        for(int i=0; i<arShape.size(); i++){
            Shape tmp = arShape.get(i);
            System.out.println(tmp.toString());
        }



 /*
        if(tmp instanceof Circle){
            System.out.println("Okrag o srodku w punkcie"
            + " [" + ((Circle) tmp).pt1.x + ", "
            + ((Circle) tmp).pt2.y + "] długosc premienia "
            + LineCalc.lineLength()
                    );
        }
*/
/*
        Circle circle = new Circle(pt1, pt2);
        System.out.println(circle.toString());
        System.out.println(sc.shapeArea(circle));

        Rectangle rectangle = new Rectangle(pt1, pt2);
        System.out.println(rectangle.toString());
        System.out.println(sc.shapeArea(rectangle));
*/
    }
}
