
/**
 * 
 * @author Callan
 * 
 * The Square class contains a coordinate value and a piece value.
 * If no piece is currently occupying the square, the piece value will be null.
 *
 */
public class Square 
{
	private ChessPiece piece = null;
	private Coordinate coordinate;
	
	/**
	 * Class constructor for if a piece starts on the square.
	 * 
	 * @param coordinate - position of square
	 * @param piece - piece currently occupying square
	 */
	public Square(Coordinate coordinate, ChessPiece piece)
	{
		this.coordinate = coordinate;
		this.piece = piece;
	}
	
	/**
	 * Overloaded constructor for if a square starts with no piece.
	 * 
	 * @param coordinate - position of the square
	 */
	public Square(Coordinate coordinate)
	{
		this(coordinate, null);
	}

	/**
	 * Removes a piece from the square when it is moved.
	 */
	public void removePiece()
	{
		piece = null;
	}

	/**
	 * Checks to see if a square equals another.
	 * 
	 * @param other is the comparison square
	 * @return true if squares equal, false if not
	 */
	public boolean equals(Square other)
	{
		if(coordinate == other.getCoordinate())
		{
			return true;
		}
		return false;
	}
	
	/**
	 * Checks if a square has a piece on it.
	 * 
	 * @return true if occupied, false if unoccupied
	 */
	public boolean isOccupied()
	{
		if (piece == null)
		{
			return false;
		}
		return true;
	}
	
	/**
	 * Returns the string value of the square's piece.
	 */
	public String toString()
	{
		if(piece == null)
		{
			return "  ";
		}
		return piece.toString();
	}

	/**
	 * Getter method.
	 * 
	 * @return value of piece occupying the square
	 */
	public ChessPiece getPiece() {
		return piece;
	}

	/**
	 * Setter method.
	 * 
	 * @param piece is the new piece value
	 */
	public void setPiece(ChessPiece piece) {
		this.piece = piece;
	}
	
	/**
	 * Getter method.
	 * 
	 * @return position of the square
	 */
	public Coordinate getCoordinate() {
		return coordinate;
	}
}
