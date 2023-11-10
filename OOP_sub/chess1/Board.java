import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;

    private ArrayList<Piece> pieces = new ArrayList<Piece>();

    public Board() {}

    /**
     * .
     * @param x 1
     * @param y 1
     * @return res
     */

    public boolean validate(int x, int y) {
        if (x >= 1 && y >= 1 && x <= WIDTH && y <= HEIGHT) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * .
     * @param piece 1
     */

    public void addPiece(Piece piece) {
        if (validate(piece.getCoordinatesX(), piece.getCoordinatesY())
                && getAt(piece.getCoordinatesX(), piece.getCoordinatesY()) == null) {
            this.pieces.add(piece);
        }
    }

    /**
     * .
     * @param x 1
     * @param y 1
     * @return res
     */
    public Piece getAt(int x, int y) {
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                return piece;
            }
        }
        return null;
    }

    /**
     * .
     * @param x 1
     * @param y 1
     */
    public void removeAt(int x, int y) {
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                pieces.remove(piece);
                return;
            }
        }
    }

    public ArrayList<Piece> getPieces() {
        return this.pieces;
    }

    public void setPieces(ArrayList<Piece> p) {
        this.pieces = p;
    }
}
