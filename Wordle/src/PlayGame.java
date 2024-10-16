import java.util.Scanner;

public class PlayGame
	{
		//static int check = 0;
		//static String rawAnswer = Integer.toString(check);
		static int counter = 0;
		static int turnCounter = 0;
		static String word = word();
		
		public static void main(String[] args)
			{
				intro();
				Board.prepareBoard();
				Board.displayBoard();
				userAnswer();
				Board.displayBoard();
				turnCounter ++;
				isWon();
				counter = 0;
				
				userAnswer();
				turnCounter ++;
				isWon();
				counter = 0;
				
				userAnswer();
				turnCounter ++;
				isWon();
				counter = 0;
				
				userAnswer();
				turnCounter ++;
				isWon();
				counter = 0;
				
				userAnswer();
				turnCounter ++;
				isWon();
				counter = 0;
				
				userAnswer();
				turnCounter ++;
				isWon();

			}
		
		public static void intro()
		{
			System.out.println("Hello! Lets play Wordle! Type in a five letter word and you have six tries to try and get it!");
		}
		
		public static String word()
		{
			int wordsNumber = (int)(Math.random()*3101);
			
			 String baseWord = Words.words[wordsNumber];
			 
			 System.out.println(baseWord);
			 
			 return baseWord;
		}
		
		public static void userAnswer()
		{
			
            Scanner userStringInput = new Scanner (System.in);
			
		  String guess = userStringInput.nextLine();
			
			guess = guess.toLowerCase();
			
			String[] splitGuess = guess.split("");
			String[] answer = word.split("");
			
			int row = 0;
			
					for (int col = 0; col < 5; col++)
						{
							Board.board[row][col].equals(splitGuess[col]);
							
							row ++;
						}
			
			for (int i = 0; i < 5; i++)
				{
					if (splitGuess[i].equals(answer[i]))
						{
							counter ++;
							
							System.out.println(splitGuess[i] +" is in the right spot.");
						}
					
					else if (splitGuess[i]!=(answer[i]))
						{
							if (word.contains(splitGuess[i]))
								{
									System.out.println(splitGuess[i] + " is in the word, but in the wrong spot.");
								}
							
							else
								{
									System.out.println(splitGuess[i] + " is not in the word.");
								}
						}			
					}
					
		}
		
		
		public static void isWon()
		{
			if (counter == 5)
				{
					System.out.println("\nCongrats! You win the game!");
					
					System.exit(0);
				}
			
			else if (turnCounter == 6)
				{
					System.out.println("\nYou Lose! hahahahahaha!");
					
					System.exit(0);
				}
			
		}

	}
