package july4;

import java.util.Scanner;

public class BattleshipGame2 {

	public static void main(String[] args) {
		
		// Welcome information
		
		
		
		
		
		// initial the player's array
		for (int i = 0 ; i < playerBoatArray.length ; i++){
			playerBoatArray[i] = ' ';
		}
		

		// show ship
		showBoat(playerBoatArray);
		
		// input boat number
		playerInputBoatNum();
		
		// show players boat
		System.out.println("Player's Boats");
		showBoat(playerBoatArray);
		
		
		// initial the Computer's array
		for (int i = 0 ; i < computerBoatArray.length ; i++){
			computerBoatArray[i] = ' ';
		}
		
		// computer create boat
		computerCreateBoat();
		
		// computer show boat
		System.out.println("\n\n Computer's Boats");
		
	
		showBoat(computerBoatArray);
		
		// fight rounds
		int round = 1;
		//loop the fight
		while (checkResult() == false){
			System.out.println("\n");
			
			
			// print out round number
			System.out.println("Round: " + round);
			
			
			// player choose to shoot
			
			playerShoot();
			
			//computer choose to shoot
			computerShoot();
			
			// Show both boat
			

			// show players boat
			System.out.println("Player's Boats");
			showBoat(playerBoatArray);	
			System.out.println("Computer's Boats");
			showBoat(computerBoatArray);
			
			
			
			
			// check the result 
			checkResult();
			round++;
		}
		
		
		
		

		
		
		
		
		
		

	}
	
	
	// show the boat 
	public static void showBoat(char[] array){
		
		// show first line
		for (int i = 0 ; i < 10 ; i++){
			System.out.print(" =====");
		}
		
		// line feed
		System.out.println();
	
		// show second line
		for (int i = 0 ; i < 10 ; i++){

		
				
				//print second line
				System.out.print("|  ");
				
				//print third line
				System.out.print(array[i]);
				
				// print the forth of numbers
				System.out.print("  ");
				
			
			}
		
		// last separate sign '|' for second line
		System.out.print("|");
		
		// line feed
		System.out.println();
		
			// show third line
				for (int i = 0 ; i < 10 ; i++){
					System.out.print(" =====");
				}
		
		//line feed
				System.out.println();
		for (int i = 0 ; i < 10 ; i++){
			
				// print the forth of numbers
				System.out.print("   " + (i+1) + "  ");
				
			}
		System.out.println();

	}
	
	// show mark
	public static void showMark(int i){
		String Mark = "";
		
		System.out.print(Mark);
		
	}
	
	
	// player's boat Number 
	static char[] playerBoatArray = new char[10];
	
	// computer's boat Number
	static char[] computerBoatArray = new char[10];
	
	// create computer's boat 
	static void computerCreateBoat(){
		int shortBoatNum = (int) (Math.random()*10);
		computerBoatArray[shortBoatNum] = '*';
		
		int longBoatNum = (int) (Math.random()*9);
		while (longBoatNum == shortBoatNum || (longBoatNum + 1) == shortBoatNum ){
			longBoatNum = (int) (Math.random()*10);
		}
		computerBoatArray[longBoatNum] = '*';
		computerBoatArray[longBoatNum+1] = '*';
	}
	
	
		
				
	
	
	
	// read data
	public static void playerInputBoatNum(){
		Scanner scanner = new Scanner(System.in);
		
		// input short boat number
		System.out.print("Enter a spot for the short boat (1 - 10):");
		int shortBoatNum = scanner.nextInt();
				
		playerBoatArray[shortBoatNum-1] = '*';
		
		// input long boat number
		System.out.print("Enter a spot for the head of your long boat (1-10):");
		int longBoatNum = scanner.nextInt();
		while (longBoatNum == shortBoatNum || (longBoatNum+1) == shortBoatNum){
			System.out.println("Short Boat have already taken No." + shortBoatNum);
			System.out.print("Please reenter a number for long boat:");
			longBoatNum = scanner.nextInt();
		}
		if (longBoatNum == 10){
			playerBoatArray[longBoatNum-1] = '*';
			playerBoatArray[longBoatNum-2] = '*';
			
		}else {

			playerBoatArray[longBoatNum-1] = '*';
			playerBoatArray[longBoatNum] = '*';
			
		}
		
		
	}
	
	static int playerBoatNum = 3;
	static int comBoatNum = 3;
	
	 
	
	static void playerShoot(){
		Scanner scanner = new Scanner(System.in);
		
		// input short boat number
		System.out.print("Please choose (1 ~ 10) to shoot:");
		int shootNum = scanner.nextInt();
		if (computerBoatArray[shootNum-1] == '*') {
			comBoatNum--;
			System.out.println("You got a perfect shoot");
		}
	
		
		computerBoatArray[shootNum-1] = '-';
	}
	
	
	static int comShootCount = 0;
	static void computerShoot(){
		int shootNum =  (int) (Math.random()*10);
		
		
		while (playerBoatArray[shootNum] == '-' ){
			shootNum =  (int) (Math.random()*10);
		}
		System.out.println("Computer shoots:" + (shootNum +1));
		if (playerBoatArray[shootNum] == '*'){
			playerBoatNum--;
			System.out.println("Computer got a perfect shoot!");
		}
		
		
		playerBoatArray[shootNum] = '-';
		
		
	}
	
	
	static boolean checkResult(){
		boolean result = false;
		
		if (comBoatNum == 0 && playerBoatNum == 0){
			System.out.println("You and Computer, both lost all boats.");
		}else if (comBoatNum == 0) {result = true;
		System.out.println("Player Win!");
		} else if (playerBoatNum == 0){
			result = true;
			System.out.println("Computer win!");
		} else System.out.println("fight is continue...");
		
		
		
		return result;
	}
	
	
	

	
	
	
}
