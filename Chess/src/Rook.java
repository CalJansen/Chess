
public class Rook extends ChessPiece {

	public Rook(char color) {
		super('R', color);
	}

	@Override
	public boolean validMove(Coordinate oldPos, Coordinate newPos) {
		return false;
	}

	@Override
	public Coordinate[] getPath(Coordinate oldPos, Coordinate newPos) {
		return null;
	}

}
