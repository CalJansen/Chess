
public class Queen extends ChessPiece {

	public Queen(char color) {
		super('Q', color);
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
