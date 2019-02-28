import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChessBoardPanel extends JPanel
{
	public final int BOARD_SIZE = 8;
	private ChessPiece[][] boardState;

	public ChessBoardPanel()
	{
		int counter = 1;
		setLayout(new GridLayout(8, 8));
		boardState = new ChessPiece[BOARD_SIZE][BOARD_SIZE];

		for (int i = 0; i < boardState.length; i++)
		{
			counter--; // counter is used to make checker board pattern

			for (int j = 0; j < boardState[i].length; j++)
			{
				if(i == 0 || i == 7)
				{
					if(j == 0 || j == 7)
					{
						boardState[i][j] = ChessPiece.createRook();
					} else if(j == 1 || j == 6)
					{
						boardState[i][j] = ChessPiece.createKnight();
					} else if(j == 2 || j == 5)
					{
						boardState[i][j] = ChessPiece.createBishop();
					} else if(j == 3)
					{
						boardState[i][j] = ChessPiece.createKing();
					} else
					{
						boardState[i][j] = ChessPiece.createQueen();
					}
				}
				else if (i == 1 || i == 6)
				{
					boardState[i][j] = ChessPiece.createPawn();
				} else
				{
					boardState[i][j] = ChessPiece.createEmptyToken();
				}

				JButton newButton = new JButton(boardState[i][j].toString());

				if ((counter % 2) != 0)
				{
					newButton.setBackground(Color.black);
				}
				newButton.setHorizontalAlignment(JButton.CENTER);
				newButton.setForeground(Color.blue);
				newButton.setFont(newButton.getFont().deriveFont(20.0f));
				newButton.setOpaque(true);
				add(newButton);
				counter++;
			}
		}

		setBackground(Color.white);
		setPreferredSize(new Dimension(500, 500));
	}
}
