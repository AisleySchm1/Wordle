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
			
			for (int i = 0; i < 5; i++)
				{
					if (check[i] == answer[i])
						{
							System.out.println(check + " is the correct answer! You win!");
						}
					
					else if (check[i] != answer[i])
						{
							for (int s = 0; s < check.length; s++)
								{
									if()
								}
						}
				}
		}
		
		
		public static void lettersLeft()
		{
			
		}
		
		public static void isWon()
		{
			
		}

	}
