
public class Board
	{
		
		static String [][] board = new String [7][6];
		
		 public static void prepareBoard()
			    {
			      for (int row = 0; row < board.length; row ++)
			      {
			        System.out.println();
			       for (int col = 0; col < board[0].length; col ++) 
			         {
			         board[row][col] = " ";
			         }
			    }
			    }

			    public static void displayBoard()
			  {
			    System.out.println(" WORDLE ");
			    System.out.println("- - - - - - - - - - -");
			    System.out.println("| "+board[0][0]+" | "+board[0][1]+" | "+board[0][2]+" | "+board[0][3]+" | "+board[0][4]+" | ");
			    System.out.println("- - - - - - - - - - -");
			    System.out.println("| "+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+" | "+board[1][3]+" | "+board[1][4]+" | ");
			    System.out.println("- - - - - - - - - - -");
			    System.out.println("| "+board[2][0]+" | "+board[2][1]+" | "+board[2][2]+" | "+board[2][3]+" | "+board[2][4]+" | ");
			    System.out.println("- - - - - - - - - - -");
			    System.out.println("| "+board[3][0]+" | "+board[3][1]+" | "+board[3][2]+" | "+board[3][3]+" | "+board[3][4]+" | ");
			    System.out.println("- - - - - - - - - - -");
			    System.out.println("| "+board[4][0]+" | "+board[4][1]+" | "+board[4][2]+" | "+board[4][3]+" | "+board[4][4]+" | ");
			    System.out.println("- - - - - - - - - - -");
			    System.out.println("| "+board[5][0]+" | "+board[5][1]+" | "+board[5][2]+" | "+board[5][3]+" | "+board[5][4]+" | ");
			    System.out.println("- - - - - - - - - - -");
			    
//			    int row = 0;
//				
//						for (int col = 0; col < 5; col++)
//							{
//								Board.board[row][col].equals(splitGuess[col]);
//								
//								row ++;
//							}
			  }
	}
