package june29;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorVersion2 {

	// Summary:
	// There are 3 parts.
	// First, create Enum to store Rock, Paper and Scissor 
	// and also create an Enum method to compare the Enum value.
	// Second, create a method to convert input number into Enum.
	// Third, make a loop for putting the number, comparing value and print result.
	
	
	
	
	
	
	
	// Create the Enum about ROCK, PAPER and SCISSOR
	static enum Rps {
		ROCK, PAPER, SCISSOR;
		
		// Create an method of comparing the Enum and return an String result.\
		// May be it is better to define an Enum for equal, won and lose.
		String compareRps(Rps rps) {
			String result = "";			
			if (this.equals(rps))
				result = "equal";
			else if (this.equals(ROCK) && (rps.equals(PAPER)))
				result = "lose";
			else if (this.equals(ROCK) && (rps.equals(SCISSOR)))
				result = "won";
			else if (this.equals(PAPER) && (rps.equals(SCISSOR)))
				result = "lose";
			else if (this.equals(PAPER) && (rps.equals(ROCK)))
				result = "won";
			else if (this.equals(SCISSOR) && (rps.equals(ROCK)))
				result = "lose";
			else if (this.equals(SCISSOR) && (rps.equals(PAPER)))
				result = "won";
			return result;
		}
	}

	
	// Create an method of converting the inputed number into Enum
	static Rps getRps(int input) {
		Rps rps = Rps.PAPER;
		switch (input) {
		case 1:
			rps = Rps.ROCK;
			break;
		case 2:
			rps = Rps.PAPER;
			break;
		case 3:
			rps = Rps.SCISSOR;
			break;
		}
		return rps;
	}

	
	
	public static void main(String[] args) {
		
		// Create the count for users winning times
		int userCount = 0;
		
		// Create the count for computer's winning times
		int comCount = 0;
		
		// Loop 3 times for inputing computer and user Number.
		for (int i = 0; i < 3; i++) {
			System.out.println("Please Enter:");
			System.out.println("1- For Rock");
			System.out.println("2- For Paper");
			System.out.println("3- For Scissor");
			System.out.print("Your choice:");
			
			// Input user Number
			Scanner scanner = new Scanner(System.in);
			int userInput = scanner.nextInt();
			
			//Convert user Number into Enum.
			Rps userRps = getRps(userInput);
			
			//Print out user's input
			System.out.print("you go " + userRps + " . ");
			
			// Create a random number for computer.
			Random random = new Random();
			int computerInput = random.nextInt(3 - 1 + 1) + 1;
			
			// Convert the computer's number into Enum.
			Rps comRps = getRps(computerInput);
			System.out.println("Computer go " + comRps + " . ");

		
			// Create the compared result. 
			// user's compares to computer's
			String comparedResult = userRps.compareRps(comRps);
			

			
			
			//Increase the count and print the result.
			switch(comparedResult){
			case "won": userCount ++; 
						System.out.println("You win this time"); 
						break;
			case "lose": comCount ++; 
						System.out.println("Computer win this time"); break;
			case "equal":System.out.println("No one lose!");break;
			}
			
			//Print the winning times for both; 
			System.out.print("You won " + userCount + " times. ");
			System.out.println("Computer won " + comCount + "times. ");
			System.out.println();
			
		}
		
	
		
	}

}
