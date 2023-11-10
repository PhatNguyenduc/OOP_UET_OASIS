import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory = new ArrayList<>();

    public Game(Board board) {
        this.board = board;
    }

    /**
     * .
     * @param piece 1
     * @param x 1
     * @param y 1
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(board, x, y)) {
            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
            Piece kill = board.getAt(x, y);
            moveHistory.add(new Move(piece.getCoordinatesX(), x,
                    piece.getCoordinatesY(), y, piece, kill));
        }

    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }
}
