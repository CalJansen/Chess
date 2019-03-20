import javax.swing.JFrame;
import java.util.Scanner;

public class ChessMain {
	public static Scanner keyboard = new Scanner(System.in);
	public static ChessBoardPanel newBoard;

	public static void main(String[] args) {
		JFrame frame = new JFrame("Chess");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		newBoard = new ChessBoardPanel();
		frame.getContentPane().add(newBoard);

		frame.pack();
		frame.setVisible(true);

		boolean isUserFinished = false;
		String userInput = "";
		
		do {
			PlayRound();

			System.out.println("Are you finished playing?");
			userInput = keyboard.nextLine(); // add exception handling

			switch (userInput.toUpperCase().charAt(0)) 
			{
			case 'Y':
				isUserFinished = true;
				break;
			case 'N':
				break;
			default:
				System.out.println("Invalid, please enter Y/N");
				break;
			}

		} while (isUserFinished == false);
	}

	public static void PlayRound() {

		do
		{
			if(newBoard.getIsWhitesTurn())
			{
				System.out.println("White's turn.");
			} else
			{
				System.out.println("Black's turn. ");
			}
			System.out.println("Please make a move: ");
			System.out.println("format- Kc3, c4 to move king from c3 to c4");
			
			String userInput = keyboard.nextLine();
			
			String[] moveParts = userInput.split(",");
			String oldSpace = moveParts[0].trim();
			String newSpace = moveParts[1].trim();
			System.out.println(oldSpace);
			System.out.println(newSpace);
			
			String piece = "";
			char oldColumnChar = ' ';
			int oldRow = 0;
			char newColumnChar = ' ';
			int newRow = 0;
			
			try {
				piece = Character.toString(oldSpace.charAt(0)).toUpperCase();
				oldColumnChar = oldSpace.charAt(1);
				oldRow = Character.getNumericValue(oldSpace.charAt(2));
				newColumnChar = newSpace.charAt(0);
				newRow = Character.getNumericValue(newSpace.charAt(1));
			} 
			catch(Exception e)
			{
				 System.out.println("Invalid input, please try again!");
			}
			
			int oldCol = newBoard.columnCharToInt(oldColumnChar);
			int newCol = newBoard.columnCharToInt(newColumnChar);
			oldRow--;
			newRow--;
			
			if(newBoard.correctPiece(piece, oldRow, oldCol)
					&& newBoard.validMove(piece, oldRow, oldCol, newRow, newCol))
			{
				System.out.println("Successful move.");
				newBoard.placePiece(piece, newRow, newCol);
				newBoard.removePiece(oldRow, oldCol);
			} else
			{
				System.out.println("Invalid move.");
			}
			
		} while (!newBoard.isGameOver());
	}

}
