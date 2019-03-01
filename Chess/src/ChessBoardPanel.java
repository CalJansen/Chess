import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

import javax.swing.*;

public class ChessBoardPanel extends JPanel
{
	public final int BOARD_SIZE = 8;
	private ChessPiece[][] boardState;
	private JLabel[][] boardStateLabel;
	private boolean isWhitesTurn;
	
	public boolean getIsWhitesTurn()
	{
		return this.isWhitesTurn;
	}
	
	public boolean correctPiece(String piece, int row, int col)
	{
		String boardPiece = boardStateLabel[row][col].getText();
		if(Objects.equals(piece, boardPiece))
		{
			return true;
		}
		return false;
	}
	
	public int columnCharToInt(char column)
	{
		char columnUpper = Character.toUpperCase(column);
		
		switch(columnUpper)
		{
			case 'A':
				return 0;
			case 'B':
				return 1;
			case 'C':
				return 2;
			case 'D':
				return 3;
			case 'E':
				return 4;
			case 'F':
				return 5;
			case 'G':
				return 6;
			case 'H':
				return 7;
			default:
				return -1;
		}
	}
	
	public boolean isGameOver()
	{
		return false;				// implement later
	}
	
	public void placePiece(String piece, int row, int col)
	{
		boardStateLabel[row][col].setText(piece);
		if(isWhitesTurn)
		{
			boardStateLabel[row][col].setForeground(Color.WHITE);
		}
		else
		{
			boardStateLabel[row][col].setForeground(Color.BLACK);
		}
		isWhitesTurn = !isWhitesTurn;
	}
	
	public void removePiece(int row, int col)
	{
		boardStateLabel[row][col].setText(" ");
	}
	
	public ChessBoardPanel()
	{
		int counter = 1;
		setLayout(new GridLayout(8, 8));
		boardState = new ChessPiece[BOARD_SIZE][BOARD_SIZE];
		boardStateLabel  = new JLabel[BOARD_SIZE][BOARD_SIZE];

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

				JLabel newLabel = new JLabel();
				newLabel.setText(boardState[i][j].toString());
				boardStateLabel[i][j] = newLabel;
				
				if ((counter % 2) == 0)
				{
					newLabel.setBackground(Color.DARK_GRAY);
				} else
				{
					newLabel.setBackground(Color.LIGHT_GRAY);
				}
				if(i < 2) 
				{
					newLabel.setForeground(Color.WHITE);
				} else
				{
					newLabel.setForeground(Color.BLACK);
				}

				newLabel.setHorizontalAlignment(JButton.CENTER);
				newLabel.setFont(newLabel.getFont().deriveFont(20.0f));
				newLabel.setOpaque(true);
				add(newLabel);
				counter++;
			}
		}

		setBackground(Color.white);
		setPreferredSize(new Dimension(500, 500));
		isWhitesTurn = true;
	}
	
}
