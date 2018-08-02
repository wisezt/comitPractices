package july30;

import java.util.Scanner;

public class Subsrestaurant  {
	

	
	
	
	public static void main(String[] args){
		double hamA, hamB, hamC, hamD, sandwich, sum;
		hamA = 1;
		hamB = 2;
		hamC = 3;
		hamD = 4;
		sandwich = 20;
		sum = sandwich;
		
		int hamACount, hamBCount, hamCCount, hamDCount;
		hamACount = 0;
		hamBCount = 0;
		hamCCount = 0;
		hamDCount = 0;
		loop:
		while(true){
		try{
		System.out.println("Please input 1~4 for the ham you need or other character for end");
		System.out.println("sandwich price is " + sandwich);
		System.out.println("1. Add HamA, price:" + hamA);
		System.out.println("2. Add HamB, price:" + hamB);
		System.out.println("3. Add HamC, price:" + hamC);
		System.out.println("4. Add HamD, price:" + hamD);
		System.out.print("Please in put your num:");
		
		switch(read()){
		case 1: sum += hamA;hamACount++;break;
		case 2: sum += hamB;hamBCount++;break;
		case 3: sum += hamC;hamCCount++;break;
		case 4: sum += hamD;hamDCount++;break;
		default:break loop;
		}
		System.out.println("The Total price is " + sum);
		System.out.println("1 sandwich wich " + hamACount + " hamA, "+ hamBCount + " hamB, "+ hamCCount + " hamC. "+ hamDCount + " hamD. ");
		
		System.out.println("\n\n");
		}catch(Exception e){
			break;}			
		}
		
		System.out.println("The Total price is " + sum);
		System.out.println("1 sandwich wich " + hamACount + " hamA, "+ hamBCount + " hamB, "+ hamCCount + " hamC. "+ hamDCount + " hamD. ");
	
		System.out.print("End");
		
		
	}
	
	public static int read(){
		Scanner scan = new Scanner(System.in);
		int chosenNum = scan.nextInt();
		return chosenNum;
		
		
	}
	
	
	

}
