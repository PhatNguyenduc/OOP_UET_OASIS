public class Point {
    private double pointX;
    private double pointY;

    /**
     * .
     *
     * @param pointX 1
     * @param pointY 1
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * .
     *
     * @param other 1
     * @return res
     */
    public double distance(Point other) {
        double sqrX = this.pointX - other.pointX;
        double sqrY = this.pointY - other.pointY;
        return Math.sqrt(sqrX * sqrX + sqrY * sqrY);
    }

    /**
     * .
     * @return res
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(pointX);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(pointY);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    /**
     * .S
     * @param obj 1
     * @return res
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Point other = (Point) obj;
        if (Math.abs(this.pointX - other.pointX) >= 0.001f) {
            return false;
        }
        if (Math.abs(this.pointY - other.pointY) >= 0.001f) {
            return false;
        }
        return true;
    }

    /**
     * .
     */

    public String toString() {
        return "(" + pointX + "," + pointY + ")";
    }

}