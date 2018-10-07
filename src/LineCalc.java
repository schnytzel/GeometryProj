public class LineCalc {
    public static double lineLength(Line2D line){
        double res = Math.pow((line.pt1.x - line.pt2.x),2)
                + Math.pow((line.pt1.y - line.pt2.y),2);
        res = Math.pow(res, 0.5);
        return res;
    }

    public static double lineLength(Point pt1, Point pt2){
        double res = Math.pow((pt1.x - pt2.x),2)
                + Math.pow((pt1.y - pt2.y),2);
        res = Math.pow(res, 0.5);
        return res;
    }

    public static double lineLength(Point3D pt1, Point3D pt2){
        double res = Math.pow((pt1.x - pt2.x),2)
                + Math.pow((pt1.y - pt2.y),2)
                + Math.pow((pt1.z - pt2.z),2);
        res = Math.pow(res, 0.5);
        return res;
    }

}
