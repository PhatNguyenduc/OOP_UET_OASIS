public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {}

    /**
     * .
     * @param width 1
     * @param height 1
     */

    public Rectangle(double width, double height) {
        this.width = width;
        this.length = height;
    }

    /**
     * .
     * @param width 1
     * @param height 1
     * @param color 1
     * @param filled 1
     */
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double height) {
        this.length = height;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    /**
     * .
     * @return res
     */
    public String toString() {
        return "Rectangle[width=" + width + ",length=" + length
                + ",color=" + color + ",filled=" + filled + "]";
    }


}
