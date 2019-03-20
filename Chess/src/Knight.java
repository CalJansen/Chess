
public class Knight extends ChessPiece {

	public Knight(char color) {
		super('N', color);
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
