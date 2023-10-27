public class Square extends Rectangle {
    public Square() {
        super();
    }

    /**
     * .
     * @param side double
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * .
     * @param side  1
     * @param color  1
     * @param filled 1
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * .
     * @param topLeft 1
     * @param side    1
     * @param color   1
     * @param filled  1
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    public double getSide() {
        return super.width;
    }

    public void setSide(double side) {
        super.width = side;
        super.length = side;
    }

    /**
     * .
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
        Rectangle other = (Rectangle) obj;
        if (topLeft == null) {
            if (other.topLeft != null) {
                return false;
            }
        } else {
            if (!topLeft.equals(other.topLeft)) {
                return false;
            }
        }
        if (Math.abs(this.width - other.width) >= 0.001f) {
            return false;
        }

        if (Math.abs(this.length - other.length) >= 0.001f) {
            return false;
        }
        return true;
    }

    /**
     * .
     */

    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    /**
     * .
     */

    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    /**
     * .
     */

    public String toString() {
        String res;
        res = ",side=" + super.width;
        res += ",color=" + color + ",filled=" + filled + "]";
        return "Square[topLeft=" + topLeft.toString() + res;
    }
    
}