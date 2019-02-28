public class ChessPiece
{
	private char piece; 
	
	public static ChessPiece createPawn()
	{
		return new ChessPiece('P');
	}
	
	public static ChessPiece createRook()
	{
		return new ChessPiece('R');
	}
	
	public static ChessPiece createKnight()
	{
		return new ChessPiece('N');
	}
	
	public static ChessPiece createBishop()
	{
		return new ChessPiece('B');
	}
	
	public static ChessPiece createKing()
	{
		return new ChessPiece('K');
	}
	
	public static ChessPiece createQueen()
	{
		return new ChessPiece('Q');
	}
	
	public static ChessPiece createEmptyToken(){
        return new ChessPiece(' ');
    }
	
	public ChessPiece(char token)
	{
		this.piece = token;
	}
	
	public String toString(){
        return String.valueOf(this.piece);
    }
}
