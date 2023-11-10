public abstract class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color;


    /**
     * .
     * @param coordinatesX 1
     * @param coordinatesY 1
     */
    public Piece(int coordinatesX, int coordinatesY) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = "white";
    }

    /**
     * .
     * @param coordinatesX 1
     * @param coordinatesY 1
     * @param color 1
     */

    public Piece(int coordinatesX, int coordinatesY, String color) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = color;
    }

    public abstract String getSymbol();


    public abstract boolean canMove(Board board, int x, int y);

    public int getCoordinatesX() {
        return coordinatesX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }


    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean checkPosition(Piece p) {
        return true;

    }
}
