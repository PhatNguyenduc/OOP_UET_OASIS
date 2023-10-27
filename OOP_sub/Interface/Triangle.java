public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;


    /**
     * .
     * @param p1 1
     * @param p2 1
     * @param p3 1
     * @throws RuntimeException error
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        if (arePointsCollinear(p1, p2, p3) || p1.equals(p2) || p2.equals(p3) || p1.equals(p3)) {
                throw new RuntimeException();
        }
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    /**
     * .
     * @return res
     */
    public double getArea() {
        return Math.abs(p1.getPointX() * (p2.getPointY() - p3.getPointY())
                        + p2.getPointX() * (p3.getPointY() - p1.getPointY())
                        + p3.getPointX() * (p1.getPointY() - p2.getPointY())) / 2;
    }

    /**
     * .
     * @return res
     */
    public double getPerimeter() {
        return p1.distance(p2) + p1.distance(p3) + p2.distance(p3);
    }

    /**
     * .
     * @return res
     */
    public String getInfo() {
        return "Triangle[(" + String.format("%.2f", p1.getPointX()) + ","
                + String.format("%.2f", p1.getPointY())
                + "),(" + String.format("%.2f", p2.getPointX()) + ","
                + String.format("%.2f", p2.getPointY())
                + "),(" + String.format("%.2f", p3.getPointX()) + ","
                + String.format("%.2f", p3.getPointY()) + ")]";
    }

    /**
     * .
     * @param p1 1
     * @param p2 1
     * @param p3 1
     * @return res
     */
    public static boolean arePointsCollinear(Point p1, Point p2, Point p3) {
        return (p2.getPointY() - p1.getPointY()) * (p3.getPointX() - p1.getPointX())
                == (p3.getPointY() - p1.getPointY()) * (p2.getPointX() - p1.getPointX());
    }
}
