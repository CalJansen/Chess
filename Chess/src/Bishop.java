
public class Bishop extends ChessPiece {

	public Bishop(char color) {
		super('B', color);
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
