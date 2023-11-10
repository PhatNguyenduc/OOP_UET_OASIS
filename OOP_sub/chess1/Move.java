public class Move {
    private int startX;
    private int startY;
    private int endX;
    private int endY;

    private Piece movedPiece;
    private Piece killedPiece;


    /**
     * .
     * @param startX 1
     * @param endX 1
     * @param startY 1
     * @param endY 1
     * @param movedPiece 1
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.movedPiece = movedPiece;
    }


    /**
     * .
     * @param startX 1
     * @param endX 1
     * @param startY 1
     * @param endY 1
     * @param movedPiece 1
     * @param killedPiece 1
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece, Piece killedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.movedPiece = movedPiece;
        this.killedPiece = killedPiece;
    }

    /**
     * .
     * @return res
     */

    public String toString() {
        String namex = "";
        if (endX == 1) {
            namex = "a";
        }
        if (endX == 2) {
            namex = "b";
        }
        if (endX == 3) {
            namex = "c";
        }
        if (endX == 4) {
            namex = "d";
        }
        if (endX == 5) {
            namex = "e";
        }
        if (endX == 6) {
            namex = "f";
        }
        if (endX == 7) {
            namex = "g";
        }
        if (endX == 8) {
            namex = "h";
        }
        return movedPiece.getColor() + "-" + movedPiece.getSymbol() + namex + endY;
    }

    public int getStartX() {
        return startX;
    }

    public int getStartY() {
        return startY;
    }

    public int getEndX() {
        return endX;
    }

    public int getEndY() {
        return endY;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    public Piece getMovedPiece() {
        return movedPiece;
    }

    public void setMovedPiece(Piece movedPiece) {
        this.movedPiece = movedPiece;
    }

    public Piece getKilledPiece() {
        return killedPiece;
    }

    public void setKilledPiece(Piece killedPiece) {
        this.killedPiece = killedPiece;
    }
}
