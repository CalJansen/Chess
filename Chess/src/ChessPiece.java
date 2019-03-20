public abstract class ChessPiece
{
	private char piece;
	private char color;
	
	public ChessPiece(char piece, char color)
	{
		this.piece = piece;
		this.color = color;
	}
	
	public char getPiece()
	{
		return this.piece;
	}
	
	public char getColor()
	{
		return this.color;
	}	
	
	public String toString()
	{
        return String.valueOf(this.piece);
    }
	
	public abstract boolean validMove(Coordinate oldPos, Coordinate newPos);
	
	public abstract Coordinate[] getPath(Coordinate oldPos, Coordinate newPos);
}
