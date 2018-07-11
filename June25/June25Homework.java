package June25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class June25Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		showAverage();
		
		
		
		
		
		
	
		
	}

	// 1 - Write a program that allows you to enter the height of 10 students,
	// then show the average height,
	// and how many elements are above average, how many are below average.
	public static void showAverage() {
		System.out.println("Question 1: Please input height of 10 students.");
		List<Double> list = new ArrayList<Double>();
		for (int i = 1; i <= 10; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Please input the height of No." + i + " :");
			list.add(scanner.nextDouble());
		}
		
		double sum = 0 ;
		double average = 0;
		for(double height: list){
			sum = sum + height;		
		}	
		average = sum / list.size();
		
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);
		
		
		int aboveAveNum = 0;
		int belowAveNum = 0;
		int equalAveNum = 0;
		
		for (double height: list){
			if (height > average) aboveAveNum++;
			else if (height < average) belowAveNum++;
			else if (height == average) equalAveNum++;	
		}
		
		System.out.println("There are " + aboveAveNum + " students above average height.");
		System.out.println("There are " + belowAveNum + " students below average height.");
		System.out.println("There are " + equalAveNum + " students equal average height.");
		
		
		
		
	
		
		
		

	}

	// 2 - Write an algorithm (Vehicles.java) that, from reading and storing in
	// vectors the commercial value of 20 vehicles and the type (family (1),
	// public transportation (2), load (3)), calculate the value based on:
	// • For vehicles with a value greater than 100 million, charge VAT of 20%,
	// for others VAT is 16%
	// • For vehicles type 1, with value up to 50 million, apply a discount
	// equivalent to 50% of the VAT charged
	// • For vehicles type 2 and 3, with a value higher than 80 million, apply
	// an additional cost of 5%
	// • For all vehicles, if the final value is less than 80 million, apply an
	// additional discount of 5% of the commercial value
	static List<Vehicle>  list = new ArrayList<Vehicle>();
	private static void inputVehicle(){
				
		do {
			int type = 0;
			double value =0;
			Scanner scanner = new Scanner(System.in);
			System.out.print("Please input vehicle type: ");
			type = scanner.nextInt();
			System.out.print("Please input vehicle value: ");
			value = scanner.nextDouble();
			if((type == -1) || (value == -1)) break;
			list.add(new Vehicle(value, type));			
		}while (true);
		
	}
	
	private static void showVehicleData(){
		for (Vehicle veh : list){
			if (veh.getValue() > 100 ) veh.setValueVAT(veh.valueVAT*1.2);
			else veh.setValueVAT(veh.valueVAT*1.16);
			
		//	if ((veh.type == 1) && (veh.value)
		
		}
		
		
	}
	
	
	 private static class Vehicle{
		double value; // unit: million;
		int type; // There are 3 types. 1, 2 ,3;
		double valueVAT;
		double valueAfterVATDisc;
		double valueAfterCommercialDisc;
		
		private Vehicle(double value, int type){
			this.value = value;
			this.type = type;
		}
			
		public double getValueAfterVATDisc() {
			return valueAfterVATDisc;
		}

		public void setValueAfterVATDisc(double valueAfterVATDisc) {
			this.valueAfterVATDisc = valueAfterVATDisc;
		}

		public double getValueAfterCommercialDisc() {
			return valueAfterCommercialDisc;
		}

		public void setValueAfterCommercialDisc(double valueAfterCommercialDisc) {
			this.valueAfterCommercialDisc = valueAfterCommercialDisc;
		}

		double getValue(){
			return value;
		}
		
		int getType(){
			return type;
		}
		
		void setValueVAT(double valueVAT){
			this.valueVAT = valueVAT;
		}
	
		double getValueVat(){
			return valueVAT;
		}
	}
	
	
	
	
	
	
	
	
	
	// 3 - (Poll.java) A survey was carried out to 15 students in a University
	// where the following information was requested: Photo ID #, SEX, SALARY,
	// JOB.
	// • PHOTO ID # (It's an integer)
	// • SEX (1 - Male 2 - Female)
	// • JOB (1 - If you work 2 - Do not work)
	// • SALARY (An integer value)
	// Write the algorithm that allows reading and storing the requested data in
	// arrays, then calculate and print:
	// • Percentage of men in the university
	// • Percentage of women in the university
	// • Percentage of men who work and average salary
	// • Percentage of working women and average salary
	//
	//

}
