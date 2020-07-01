import java.io.*;
import java.util.*;

class Life{
	

	
	// creates new empty board.
	public static char[][] createNewBoard(int rows, int cols) {
		char[][] board = new char[rows][cols];
		//type of the variable "board" is character. this initiates the variable
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				board[r][c] = '0';
				
				
			}
			// for every 'cell', it puts in a space.
			//end checking for column
		}
		//end checking for row
	return board;
	}
	//updates how the board should be created and ends method

//method for printing the board
	public static void printBoard(char[][] board) {
		for (int r = 0; r < board.length; r++) {
			for (int c = 0; c < board[r].length; c++) {
				System.out.printf("%c", board[r][c]);
				//%c is for character
			}
			System.out.println();
			//moves to next line
			
		}	
		System.out.println("\n\n-------------------------\n\n");
		//puts a line below the board
	}
	
	
	//sets the CELL (r,c) to value (basically changes one single space on the board)
	
	public static void setCell(char[][] board, int r, int c, char val) {
		if (r >= 0 && r < board.length && c >= 0 && c < board[r].length) {
			//setting boundaries; value won't print if it's outside the board
			board[r][c] = val;
		}
	}
	
	public static int countNeighbours(char[][] board, int r, int c) {
		int value = 0 ;
		

		if ( r+1 >= 0 && r+1 < board.length &&  c >= 0 && c < board[r].length) {
			if (board[r+1][c]=='X')
			value = value + 1;
		}
		
		if ( r-1 >= 0 && r-1 < board.length &&  c >= 0 && c < board[r].length) {
			if (board[r-1][c]=='X')
			value = value +1;
		}
		
		if ( r >= 0 && r < board.length &&  c+1 >= 0 && c+1 < board[r].length) {
			if (board[r][c+1]=='X')
				value = value + 1;
		}
		
		if ( r >= 0 && r < board.length &&  c-1 >= 0 && c-1 < board[r].length) {
			if (board[r][c-1]=='X')
				value = value + 1;
		}
		
		if ( r+1 >= 0 && r+1 < board.length &&  c+1 >= 0 && c+1 < board[r].length){
			if (board[r+1][c+1]=='X')
				value = value + 1;
		}
		
		if ( r+1 >= 0 && r+1 < board.length &&  c-1 >= 0 && c-1 < board[r].length){
			if (board[r+1][c-1]=='X')
				value = value + 1;
		}	
		
		if ( r-1 >= 0 && r-1 < board.length &&  c+1 >= 0 && c+1 < board[r].length){
			if (board[r-1][c+1]=='X')
				value = value + 1;
		}
		
		if ( r-1 >= 0 && r-1 < board.length &&  c-1 >= 0 && c-1 < board[r].length){
			
			if (board[r-1][c-1]=='X')
				value = value + 1;
		
		}
		
		return value;
	}
	
	public static char getNextGenCell(char[][] board, int r, int c){
		int value = countNeighbours(board, r, c);
		
		if (value == 2 || value == 3) {
			
			board[r][c] = '5';
			printBoard(board);
		
		}
		
	
		return '0';
	}
	
	

	public static char[][] generateNextBoard(char[][] board) {
		char newBoard[][] = new char[25][25];
		
		return newBoard;
	}
	
	
	public static void main(String[] args) {
		char[][] board;
		board = createNewBoard(25,25);
		setCell(board, 0, 24, 'X'); 
		setCell(board, 0, 22, 'X');
		setCell(board, 1, 24, 'X'); 		
		System.out.println(countNeighbours(board, 0, 23));
		printBoard(board);
	}
}