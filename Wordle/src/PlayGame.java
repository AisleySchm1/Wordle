import java.util.Scanner;
java.util.scanner;
public class PlayGame
	{

		public static void main(String[] args)
			{	
				intro();
				Board.prepareBoard();
				Board.displayBoard();
				Words.wordBank();

			}
		
		public static void intro()
		{
			System.out.println("Hello! Lets play Wordle! Type in a five letter word and you have six tries to try and get it!");
		}
		
		public static void userAnswer()
		{
			int wordsNumber = (int)(Math.random()*3107);
			
		 String word = Words.words[wordsNumber];
			
            Scanner userStringInput = new Scanner (System.in);
			
		  String guess = userStringInput.nextLine();
			
			guess = guess.toLowerCase();
			
			String[] check = guess.split(" ");
			String[] answer = word.split(" ");
			
			for (int i = 0; )
		}
		
		public static void
		
		public static void lettersLeft()
		{
			
		}
		
		public static void isWon()
		{
			
		}

	}
