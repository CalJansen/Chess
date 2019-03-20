
public class King extends ChessPiece {

	public King(char color) {
		super('K', color);
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
