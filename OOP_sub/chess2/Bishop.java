public class Bishop extends Piece {

    public Bishop(int x, int y) {
        super(x, y);
    }

    public Bishop(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public String getSymbol() {
        return "B";
    }


    @Override
    public boolean canMove(Board board, int x, int y) {
        if (!board.validate(x, y)) {
            return false;
        }
        int stepx = Integer.compare(x, this.getCoordinatesX());
        int stepy = Integer.compare(y, this.getCoordinatesY());

        int nextx = this.getCoordinatesX() + stepx;
        int nexty = this.getCoordinatesY() + stepy;

        while (nextx != x && nexty != y) {
            if (board.getAt(nextx, nexty) != null) {
                return false;
            }
            nextx += stepx;
            nexty += stepy;

        }
        if (board.getAt(nextx, nexty) != null
                && board.getAt(nextx, nexty).getColor().equals(this.getColor())) {
            return false;
        }
        return true;

    }
}
