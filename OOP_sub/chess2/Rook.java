public class Rook extends Piece {
    public Rook(int x, int y) {
        super(x, y);
    }

    public Rook(int x, int y, String color) {
        super(x, y, color);

    }

    @Override
    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        if (!board.validate(x, y)) {
            return false;
        }

        if (x != this.getCoordinatesX() && y == this.getCoordinatesY()) {
            int stepx = Integer.compare(x, this.getCoordinatesX());
            for (int i = this.getCoordinatesX() + stepx; i != x; i += stepx) {

                if (board.getAt(i, y) != null) {
                    return false;
                }

            }
            if (board.getAt(x, y) != null
                    && board.getAt(x, y).getColor().equals(this.getColor())) {
                return false;
            }
            if (board.getAt(x, y) != null
                    && board.getAt(x, y).getColor().equals(this.getColor())) {
                return false;
            }
            return true;
        }

        if (x == this.getCoordinatesX() && y != this.getCoordinatesY()) {
            int stepy = Integer.compare(y, this.getCoordinatesY());
            for (int i = this.getCoordinatesY() + stepy; i != y; i += stepy) {

                if (board.getAt(x, i) != null) {
                    return false;
                }
            }
            if (board.getAt(x, y) != null
                    && board.getAt(x, y).getColor().equals(this.getColor())) {
                return false;
            }
            return true;
        }

        return false;

    }
}
