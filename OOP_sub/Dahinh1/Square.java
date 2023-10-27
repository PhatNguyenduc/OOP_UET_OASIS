public class Square extends Rectangle {
   public Square() {

   }
   /**
    * .
    * @param side 1
    */


   public Square(double side) {
       super(side, side);
   }

   /**
    * Creates a square.
    * @param side 1
    * @param color red
    * @param filled true
    */

   public Square(double side, String color, boolean filled) {
       super(side, side, color, filled);
   }

   public double getSide() {
       return super.length;
   }

   public void setSide(double side) {
       super.length = side;
       super.width = side;
   }

   public void setWidth(double side) {
       super.width = side;
       super.length = side;
   }

   public void setLength(double side) {
       super.length = side;
       super.width = side;
   }

    /**
     * .
     * @return res
     */
    public String toString() {
        return "Square[side=" + super.width + ",color=" + color + ",filled=" + filled + "]";
    }
}

