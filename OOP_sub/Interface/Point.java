public class Point {

    private double pointX;
    private double pointY;

    public Point(double x, double y) {
        this.pointX = x;
        this.pointY = y;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double x) {
        this.pointX = x;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double y) {
        this.pointY = y;
    }

    /**
     * .
     * @param other 1
     * @return res
     */

    public double distance(Point other) {
        double x = Math.pow(this.getPointX() - other.getPointX(), 2.0);
        double y = Math.pow(this.getPointY() - other.getPointY(), 2.0);
        return Math.sqrt(x + y);
    }
}
