public class Circle extends Shape {
    protected double radius;

    public Circle() {}

    /**
     * .
     * @param radius 1
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * .
     * @param radius 1
     * @param color 1
     * @param filled 1
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * .
     * @return res
     */
    public String toString() {
        return "Circle[radius=" + radius + ",color="
                + super.color + ",filled=" + super.filled + "]";
    }


}
