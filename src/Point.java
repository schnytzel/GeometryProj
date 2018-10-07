import java.util.Scanner;

public class Point {
    double x;
    double y;

    Scanner scanner = new Scanner(System.in);
    public void readPt(){
        System.out.println("Podaj wspolrzedne: ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
    }

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
