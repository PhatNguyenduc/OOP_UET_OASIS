public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * Creates a new.
     */
    public Shape() {
        this.color = null;
        this.filled = false;
    }

    /**
     * .
     * @param color 1
     * @param filled 1
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    /**
     * .
     * @return res
     */
    public String toString() {
        return "Shape[color='" + color + ",filled=" + filled + ']';
    }



}
