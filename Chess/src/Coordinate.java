
/**
 * 
 * @author Callan
 * 
 * The coordinate class contains the x and y coordinates of the square.
 *
 */
public class Coordinate 
{
	int xValue;
	int yValue;
	
	/**
	 * Constructs a new coordinate object with a unique x and y pair.
	 * 
	 * @param x - value of the column
	 * @param y - value of the row
	 */
	public Coordinate(int row, int column)
	{
		xValue = column;
		yValue = row;
	}
	
	/**
	 * IsValid checks to make sure coordinate is on the chess board.
	 * 
	 * @return returns true if valid
	 */
	public boolean isValid()
	{
		if((xValue >= 0 && xValue < 8)
				&& (yValue >= 0 && yValue < 8))
		{
			return true;
		}
		return false;
	}
	
	/**
	 * isEqual checks if two coordinates are equal.
	 * 
	 * @param other is the comparison coordinate
	 * @return true if equal, false if not
	 */
	public boolean isEqual(Coordinate other)
	{
		if((xValue == other.getX())
				&& (yValue == other.getY()))
		{
			return true;
		}
		return false;
	}

	/**
	 * Getter method.
	 * 
	 * @return value of column
	 */
	public int getX() {
		return xValue;
	}


	/**
	 * Setter method.
	 * 
	 * @param xValue is the new x coordinate.
	 */
	public void setX(int xValue) {
		this.xValue = xValue;
	}

	/**
	 * Getter method.
	 * 
	 * @return value of row
	 */
	public int getY() {
		return yValue;
	}

	/**
	 * Setter method.
	 * 
	 * @param yValue is the new y coordinate.
	 */
	public void setY(int yValue) {
		this.yValue = yValue;
	}
}
