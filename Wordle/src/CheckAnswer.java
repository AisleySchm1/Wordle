import java.util.Scanner;

public class CheckAnswer
	{
		public static void checkAnswer()
		{
			Scanner userStringInput = new Scanner (System.in);
			
			String answer = userStringInput.nextLine();
			
			answer = answer.toLowerCase();
			
			String[] check = answer.split("");
			
			switch(answer)
			{
				case "a":
				case "b":
				case "c":
				case "d":
				case "e":
				case "f":
				case "g":
				case "h":
				case "i":
				case "j":
				case "k":
				case "l":
				case "m":
				case "n":
				case "o":
				case "p":
				case "q":
				case "r":
				case "x":
				case "t":
				case "u":
				case "v":
				case "w":
				case "x":
				case "y":
				case "z":
				
			}
		}
	}
