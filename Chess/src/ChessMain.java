import javax.swing.JFrame;
import java.util.Scanner;

public class ChessMain
{
	public static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Chess");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ChessBoardPanel newBoard = new ChessBoardPanel();
		frame.getContentPane().add(newBoard);
		
		frame.pack();
		frame.setVisible(true);
		
		boolean isUserFinished = false;
		String userInput = "";
		do
		{
			PlayRound();
			
			System.out.println("Are you finished playing?");
			userInput = keyboard.nextLine();				// add exception handling
			
			 switch (userInput.charAt(0)) {
             case 'y':
             case 'Y':
                 isUserFinished = true;
                 System.exit(0);
                 break;
             case 'n':
             case 'N':
            	 isUserFinished = false;
                 break;
             default:
                 System.out.println("Invalid, please enter y/n");
                 break;
         }
			
		} while(isUserFinished == false);
	}
	
	public static void PlayRound()
	{
		
	}

}

