
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class June22Homework21to30 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		checkAverageGrade();		//Q21
		increaseSalary();		//Q22
		get10MulTab();			//Q23
		getCalculator();		//Q24
		increaseSalGro();		//Q25
		getHighestSalary();		//Q26
		callanother();			//Q27
		callerQ28();			//Q28
		mainQ29();			//Q29 
		inputPassword();		//Q30

	}

//  21 - Make a program in JAVA such that given as data the enrollment and 5 grades of a student; Print the enrollment, the average and the word "approved" if the student has an average greater than or equal to 6, and the word "not approved" otherwise. Data: MAT, CAL1, CAL2, CAL3, CAL4, CAL5 Where: MAT is an integer variable that represents the student's enrollment. CAL1, CAL2, CAL3, CAL4 and CAL5 are real-type variables representing the student's 5 grades.
		static void checkAverageGrade(){
			System.out.println("Question 21:");
			int MAT = 10; // What is the enrollment used for?
			int CAL1 = 1;
			int CAL2 = 5;
			int CAL3 = 7;
			int CAL4 = 5;
			int CAL5 = 10;
			int ave = (CAL1 + CAL2 + CAL3 + CAL4 + CAL5)/5;
			System.out.println("The enrollment is " + MAT + "\nThe average grade is " + ave );
			if (ave >= 6) System.out.println("Approved£¡");
			else System.out.println("Not Approved!");
			System.out.println();
		}
//	22 - Make the program in JAVA such that given as a worker's salary, apply a 15% increase if your salary is less than $ 1000 and 12% otherwise. Print the new salary of the worker. Fact: SUE (variable of real type that represents the salary of the worker).
		static void increaseSalary(){
			System.out.println("Question 22:");
			int salary = 1001;
			if (salary < 1000 ) System.out.println("The new Salary is " + (salary * 1.15));
			else System.out.println("The new Salary is " + (salary * 1.12));
			System.out.println();
		}
		
//	23 - Make a program that prints the 10 multiplication tables.
		static void get10MulTab(){
			System.out.println("Question 23:");
			for (int i = 1 ; i <= 10 ; i++){
				for (int j = i ; j <= 10 ; j++){
				System.out.print(i + " * " + j + " = " + (i*j) + "\t");	
				}
				System.out.println();		
			}		
		}
		
//	24 - Make a calculator.
		static void getCalculator(){
			System.out.println("Question 24:");
			Scanner scanner1 = new Scanner(System.in);
			System.out.print("Please input first Number: ");
			double num1 = scanner1.nextInt();
			Scanner scanner2 = new Scanner(System.in);
			System.out.print("Please input Second Number: ");
			double num2 = scanner2.nextInt();
			Scanner scanner3 = new Scanner(System.in);
			System.out.print("Please input  operator +, -, / or * : ");
			String str = scanner3.nextLine();
			
			double res = 0;
			switch(str){
			 case "+": res = num1 + num2; System.out.println(num1 + " + " + num2 + " = " + res); break;
			 case "-": res = num1 - num2; System.out.println(num1 + " - " + num2 + " = " + res); break;
			 case "/": res = num1 / num2; System.out.println(num1 + " / " + num2 + " = " + res); break;
			 case "*": res = num1 * num2; System.out.println(num1 + " * " + num2 + " = " + res); break;
			 default: System.out.println("please input right operator.");
			}
			System.out.println();
		}
		
//	25 - Calculate the salary increase for a group of employees of a company considering the following criteria: 
//		If the salary is less than $ 1,000.00: Increase 15% If the salary is greater than or equal to $ 1,000.00: Increase 12% 
//		The program must do The following: - Save the new salaries in the arrangement 
//		- Calculate the payroll - Print the salaries from the settlement
		static void increaseSalGro(){
			System.out.println("Question 25:");
			Scanner scanWorkersNum = new Scanner(System.in);
			System.out.print("Please input the number of works: ");
			int workersNum = scanWorkersNum.nextInt();
			List<Double> listOldSalary = new ArrayList<>();
			double salary = 0;
			for (int i = 0 ; i < workersNum ; i++){
				System.out.println("Please input No." + (i+1) +" worker's salary: "  );
				Scanner scanSalary = new Scanner(System.in);
				salary = scanSalary.nextDouble();
				listOldSalary.add(salary);
						
			}
			
			

			List<Double> listNewSalary = new ArrayList<>();
			for (int i = 0 ; i < workersNum ; i++){
				if (listOldSalary.get(i) < 1000 ) listNewSalary.add(listOldSalary.get(i)*1.15);
				else listNewSalary.add(listOldSalary.get(i)*1.12);		
			}
			
			for (int i = 0 ; i < workersNum ; i++){
				System.out.println("Worker No." + (i+1) + "The old salary is " + listOldSalary.get(i) + "The new salary is " + listNewSalary.get(i));									
			}
			System.out.println();
		}
		
		
		
		
		
		

		
//	26 - Make a program that asks for the salary of N workers (first you must ask how many workers there are) and print the one with the highest salary.
		static void getHighestSalary(){
			System.out.println("Question 26:");
			Scanner scanworkersNum = new Scanner(System.in);
			System.out.print("Please input workers number: ");
			int workersNum = scanworkersNum.nextInt();
			
			Map<Integer, Double> mapWorkers = new HashMap<>();
			Map<Integer, Double> mapHighest = new HashMap<>();
			mapHighest.put(0, 0.0);
			for (int i = 1 ; i <= workersNum ; i++){
				Scanner scansalary = new Scanner(System.in);
				System.out.print("Please input No." + i + " worker's salary: ");
				mapWorkers.put(i, scansalary.nextDouble());	
				if (mapWorkers.get(i) > mapHighest.get(0)) mapHighest.put(0, mapWorkers.get(i)); //find the highest Salary
			}
			
	
			for (int i = 1 ; i <= workersNum ; i++){
				if (mapWorkers.get(i) == mapHighest.get(0)) mapHighest.put(i, mapWorkers.get(i));// put all the highest Salary workers into the mapHighest.
			
			}

			mapHighest.forEach((k, v) ->{ if (k != 0)System.out.println("The highest Salary worker is No." + k + ". \nThe Salary is " + v );});
			System.out.println();
		}
		
		
//	27 - Write an algorithm that calls another, and the call prints a value.
		static void callanother(){
			System.out.println("Question 27:");
			beCalled();
			System.out.println();
		}
		static void beCalled(){
			System.out.println("I am the beCalled!");
		}
		
		
//	28 - Write an algorithm that calls another name "add", which receives 2 numbers. The summation algorithm must add its parameters. The algorithm you invoke must receive that value and display it on the screen.
		static void callerQ28(){
			System.out.println("Question 28:");
			int num1 = 24;
			int num2 = 25;
			add(num1, num2);
			System.out.println();
		}
		static void add(int num1, int num2){
			 
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		}
		
//	29 - Write an algorithm and a sub-algorithm. Write two variables with the same name and the compiler does not show error.
		static void mainQ29(){
			System.out.println("Question 29:");
			{int i = 5;}
			int i = 10;	
			System.out.println();
		}
		

		
//	30 - Write a program that asks for a numerical password and allows three attempts. If the user enters the correct password, it shows "Correct!" And run any program, after the message. Otherwise the program should display "Wrong password". Then finish the program immediately.
		static void inputPassword(){
			System.out.println("Question 30:");
			System.out.println("This password is COMIT");
			String password = "COMIT";
			
			for (int i = 0 ; i < 3 ; i++){
				Scanner scanpw = new Scanner(System.in);
				System.out.print("Please input password: ");
				String inputpw = scanpw.nextLine();
				if (inputpw.equals(password)) {newMethod();break;}
				if (i == 2)System.out.println("Wrong password");
			}
			System.out.println();
		}
		static void newMethod(){
			System.out.println("The password is right");
		}
	
	
	
	
}
