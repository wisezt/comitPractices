package june29;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorVersion1 {

	// brief:
	// first map int value of user and computer to String.
	// second create a method to compare the string and return an result.
	// third use the string result map to final result.
	// comments: use String to delivery compare value it is easily making mistakes and difficult to debug.
	
	
	
	
	
	public static void main(String[] args){
	
		// Create the counting number of winning for user and computer
		int userWinTimes = 0;
		int computerWinTimers = 0;
		
		// Create loop for 3 times
		for(int i = 0; i < 3 ; i++){
			System.out.println("Please Enter:");
			System.out.println("1- For Rock");
			System.out.println("2- For Paper");
			System.out.println("3- For Scissor");
			System.out.print("Your choice:");
			Scanner scanner = new Scanner(System.in);
			
			// User input number
			int userInt = scanner.nextInt();
			
			
			// Map user number to String
			String userString = getString(userInt);
			System.out.print("You go " + userString );
			
			// Create computer number
			Random random = new Random();
			int computerInt = random.nextInt(3 - 1 + 1) + 1;	
			
			// Map computer number to String
			String computerString = getString(computerInt);
			
			System.out.print(". Computer goes " + computerString );
			
			
			// Compare the String value, return the result
			String  result = getResult(computerString, userString);
			
			
			// Increase the counting number
			if (result.equals("UserWin")) userWinTimes++;
			if (result.equals("ComputerWin")) computerWinTimers++;
			System.out.println("! You won " + userWinTimes + " times. Computer won " + computerWinTimers + " times.");
			
			// Print out the winner of this time.
			switch (result){
			case "UserWin": System.out.println("You won this time!");break;
			case "ComputerWin": System.out.println("You lose this time!");break;
			case "equal": System.out.println("NO one lose!");break;
			}
			System.out.println();
			
			
			
		}
		
			
		
		
	}
	
	// Create  method to map input value to String
	
	static String getString(int input){
		String string = "";
		switch(input){
		case 1: string = "Rock"; break;
		case 2: string = "Paper"; break;
		case 3: string = "Scissor"; break;
		default: System.out.println("The number should be 1 ~ 3.");
		}
		
		
		return string;
	}
	
	
	
	
	// Create the method to compare 
	static String getResult(String computerString, String userString){
			
		
		if (computerString == "Rock" && userString == "Rock") return "equal";
		if (computerString == "Rock" && userString == "Paper") return "UserWin";
		if (computerString == "Rock" && userString == "Scissor") return "ComputerWin";
		
		if (computerString == "Paper" && userString == "Scissor") return "UserWin";
		if (computerString == "Paper" && userString == "Paper") return "equal";
		if (computerString == "Paper" && userString == "Rock") return "ComputerWin";
		
		if (computerString == "Scissor" && userString == "Rock") return "UserWin";
		if (computerString == "Scissor" && userString == "Paper") return "ComputerWin";
		if (computerString == "Scissor" && userString == "Scissor") return "equal";
		
		return "GetResult wrong!";
	}
	
	
	
	
}
