//import java.util.Scanner;

public class TicTacToeClass
{
	// Instance Variables
	private char[][] board;
	private int turns;
	public int n;
	public boolean xWin, oWin;
	public boolean gato = false;

	// Constructors
	public TicTacToeClass()
	{
		board = new char[3][3];
		turns = 0;

		for ( int r=0; r<3; r++ )
			for ( int c=0; c<3; c++ )
				board[r][c] = ' ';
	}

	// Accessor Methods

	public boolean isWinner( char p )
	{
		for(int n = 0; n < 3; n++) {
			if(board[n][0] == p && board[n][1] == p && board[n][2] == p) {
				return true;
			}				
		}
		for(int n = 0; n < 3; n++) {
			if(board[0][n] == p && board[1][n] == p && board[2][n] == p) {
				return true;
			}		
		}

		if(board[0][0] == p && board[1][1] == p && board[2][2] == p) {
			return true;
		}

		if(board[0][2] == p && board[1][1] == p && board[2][0] == p) {
			return true;
		}
		return false;
	}
	    
	public boolean isFull()
	{
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == 'X' || board[i][j] == 'O') {
						return true;
				}
			}
		}

		return false;		
	}

	public boolean isCat()
	{
		if(!xWin && !oWin && n==9){
			gato = true;
		}
		return gato;
	}

	public boolean isValid( int r, int c )
	{
		if ( 0 <= r && r <= 2 && 0 <= c && c <= 2 )
			return true;
		else
			return false;
	}

	public int numTurns()
	{
		return turns;
	}

	public char playerAt( int r, int c )
	{
		if ( isValid(r,c) )
			return board[r][c];
		else
			return '@';
	}

	public void displayBoard()
	{
		System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		System.out.println("     0 1 2 ");
	}

	// Modifiers
	public void playMove( char p, int r, int c )
	{
		turns += 1;
		displayBoard();
	}

}