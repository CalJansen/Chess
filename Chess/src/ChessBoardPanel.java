import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

import javax.swing.*;

public class ChessBoardPanel extends JPanel
{
	public final int BOARD_SIZE = 8;
	private Square[][] boardState = new Square[BOARD_SIZE][BOARD_SIZE];
	private JLabel[][] boardStateLabel = new JLabel[BOARD_SIZE][BOARD_SIZE];
	private boolean isWhitesTurn;
	
	public boolean getIsWhitesTurn()
	{
		return this.isWhitesTurn;
	}
	
	public boolean validMove(String piece, int oldRow, 
					int oldCol, int newRow, int newCol)
	{

		return true;
	}
	
	public boolean correctPiece(String piece, int row, int col)
	{
		String boardPiece = boardStateLabel[row][col].getText();
		if(Objects.equals(piece, boardPiece))
		{
//			if(getIsWhitesTurn() && 
//					//boardStateLabel[row][col].getColor() == "white")
//			{
//				return true;
//			} else
//			{
//				if(!getIsWhitesTurn() &&
//						//boardStateLabel[row][col].getColor() == "black")
//				{
//					return true;
//				}
//			}
		}
		return true;
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
	
	public void setBoard()
	{
		for(int row = 0; row < boardState.length; row++)
		{
			for(int column = 0; column < boardState[row].length; column++)
			{
				boardState[row][column] = new Square(new Coordinate(row, column));
			}
		}
	}
	
	public ChessBoardPanel()
	{
		int counter = 1;
		setLayout(new GridLayout(8, 8));
		setBoard();
		
		for (int row = 0; row < boardState.length; row++)
		{
			counter--; // counter is used to make checker board pattern

			for (int column = 0; column < boardState[row].length; column++)
			{
				if(row == 0)
				{	
					if(column == 0 || column == 7)
					{
						boardState[row][column].setPiece(new Rook('W'));
					} else if(column == 1 || column == 6)
					{
						boardState[row][column].setPiece(new Knight('W'));
					} else if(column == 2 || column == 5)
					{
						boardState[row][column].setPiece(new Bishop('W'));
					} else if(column == 3)
					{
						boardState[row][column].setPiece(new King('W'));
					} else
					{
						boardState[row][column].setPiece(new Queen('W'));
					}
				}
				else if (row == 1)
				{
					boardState[row][column].setPiece(new Pawn('W'));
				} 
				else if (row == 6)
				{
					boardState[row][column].setPiece(new Pawn('B'));
				}
				else if (row == 7)
				{
					if(column == 0 || column == 7)
					{
						boardState[row][column].setPiece(new Rook('B'));
					} else if(column == 1 || column == 6)
					{
						boardState[row][column].setPiece(new Knight('B'));
					} else if(column == 2 || column == 5)
					{
						boardState[row][column].setPiece(new Bishop('B'));
					} else if(column == 3)
					{
						boardState[row][column].setPiece(new King('B'));
					} else
					{
						boardState[row][column].setPiece(new Queen('B'));
					}
				}

				JLabel newLabel = new JLabel();
				newLabel.setText(boardState[row][column].toString());
				boardStateLabel[row][column] = newLabel;
				
				if ((counter % 2) == 0)
				{
					newLabel.setBackground(Color.DARK_GRAY);
				} else
				{
					newLabel.setBackground(Color.LIGHT_GRAY);
				}
				if(row < 2) 
				{
					newLabel.setForeground(Color.WHITE);
				} else if(row > 5)
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
