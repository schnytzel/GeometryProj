public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D{
    public ShapeCalculator() {
    }

    public double shapeArea(GeometricShape shape) {
        double r, res = -1;
        if(shape instanceof Circle){
            r = LineCalc.lineLength(shape.pt1, shape.pt2);
            res =  Math.PI*r*r;
        }
        if(shape instanceof Rectangle){
            res = Math.abs(shape.pt1.x - shape.pt2.x)
                    * Math.abs(shape.pt1.y-shape.pt2.y);
        }
        return res;
    }

    public double volume(Shape3D shape) {
        double r, res = -1;
        if(shape instanceof Ball){
            r = LineCalc.lineLength(shape.pt1, shape.pt2);
            res = 4*Math.PI*Math.pow(r,3)/3;
        }
        if(shape instanceof Cube){
            res = Math.abs(shape.pt1.x - shape.pt2.x)
                    * Math.abs(shape.pt1.y-shape.pt2.y)
                    * Math.abs(shape.pt1.z-shape.pt2.z);
        }
        return res;
    }
}
