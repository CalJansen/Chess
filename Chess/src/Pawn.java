
/**
 * 
 * 
 * @author Callan
 *
 */
public class Pawn extends ChessPiece
{
	private boolean hasMoved;

	public Pawn(char color)
	{
		super('P', color);
		this.hasMoved = false;
	}
	
	public boolean getHasMoved()
	{
		return this.hasMoved;
	}
	
	public boolean validMove(Coordinate oldCoord, Coordinate newCoord)
	{
		return true;					// implement later
	}

	@Override
	public Coordinate[] getPath(Coordinate oldPos, Coordinate newPos) 
	{
		return null;					// implement later
	}
}
