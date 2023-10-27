public class Circle extends Shape {
    protected double radius;
    protected Point center;

    public Circle() {
        super();
    }

    /**
     * .
     *
     * @param radius 1
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * .
     *
     * @param radius 1
     * @param color  1
     * @param filled 1
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * .
     * @param center 1
     * @param radius 1
     * @param color  1
     * @param filled 1
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * .
     * @return res
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((center == null) ? 0 : center.hashCode());
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
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
        Circle other = (Circle) obj;
        if (center == null) {
            if (other.center != null) {
                return false;
            }
        } else {
            if (!center.equals(other.center)) {
                return false;
            }
        }
        if (Math.abs(this.radius - other.radius) >= 0.001f) {
            return false;
        }
        return true;
    }

    /**
     * .
     */
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * .
     */
    @Override
    public double getPerimeter() {
        return radius * 2.0f * Math.PI;
    }

    /**
     * .
     */
    @Override
    public String toString() {
        String output;
        output = ",color=" + color + ",filled=" + filled + "]";
        return "Circle[center=" + center.toString() + ",radius=" + radius + output;
    }

}