
import java.util.Scanner;

public class June22Homework11to20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Question 11:");
		printNum1toNum2(5, 10);		//Q11
		System.out.println("Question 12:");
		printNum1toNum2(5, 15);		//Q12
		System.out.println("Question 13:");
		printNum1toNum2(5, 15000);	//Q13
		printHello(200);			//Q14
		printSquares();				//Q15
		inputThenSum100Num();		//Q16
		convertCADtoUSD();			//Q17
		findBigNum();				//Q18
		calculateNA(10, 20, 'k');	//Q19
		isPositive();				//Q20
		
	}

	
	
//	11 - Write a program in Java that prints the numbers from 5 to 10 on the screen.
//	12 - Write a program in Java that prints the numbers from 5 to 15 on the screen.
//	13 - Write a program in Java that prints on the screen the numbers from 5 to 15,000.
	
	static void printNum1toNum2(int num1, int num2){
		
		for(int i = num1; i <= num2; i++){
				System.out.print(i + " ");
				if (i % 500 == 0) System.out.println();			
		}
		System.out.println();
		System.out.println();
		
	}
	
//	14 - Write a program in Java that prints 200 times the word "hello". Note: in the source code that you write you must only enter once the word "hello".
	static void printHello(int times){
		System.out.println("Question 14:");
		for(int i = 1; i <= times; i++){
				System.out.print("Hello" + " ");
				if (i % 20 == 0) System.out.println();			
		}
		System.out.println();	
		System.out.println();
	}
	
//	15 - Exercise: Write a program in Java that prints the squares of the first 30 natural numbers on the screen.
	static void printSquares(){
		System.out.println("Question 15:");
		for(int i = 1 ; i <= 30 ; i++ ){
			System.out.println("The squares of " + i + " is " + (i*i));			
		}
		System.out.println();
	}
	
//	16 - Write a program in Java that reads an integer from the keyboard and makes the sum of the next 100 numbers, showing the result on screen.
	static void inputThenSum100Num(){
		System.out.println("Question 16:");
		System.out.print("Please input number here: ");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int sum = 0;
		for (int i = input+1; i <= input+100; i++){
			sum += i;
		}
		System.out.println("The sum of next 100 numbers by " + input + " is " + sum);
		System.out.println();
	}

//	17 - Write a program in Java that converts from canadian dollars to US dollars. You will receive a decimal number corresponding to the amount in CAD and will answer with the corresponding amount in US dollars. Take the quotation of the dollar today.
	static void convertCADtoUSD(){
		System.out.println("Question 17:");
		System.out.print("Please input CAD here: ");
		Scanner scanner = new Scanner(System.in);
		double rate = 0.76;
		double cad = scanner.nextInt();
		double usd = cad * rate ;
		System.out.println("CAD " + cad + " equals USD " + usd);
		System.out.println();
	}
	
	
//	18 - Write a program in Java that reads two numbers on the keyboard and say which is the largest and which is the smallest.
	static void findBigNum(){
		System.out.println("Question 18:");
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("Input first number here:");
		double num1 = scanner1.nextDouble();
		System.out.print("Input Secound number here:");
		double num2 = scanner2.nextDouble();
		double comparedNum = num1 -num2;
		if (comparedNum >0) System.out.println(num1 + " is the lagest number.");
		else if (comparedNum == 0 )System.out.println("We got two equal numbers");
		else if (comparedNum < 0)System.out.println(num2 + " is the lagest number.");
		System.out.println();
		
		
	}
	
//	19 - Write a Java program that does the following: declare a variable N of type int, a variable A of type double and a variable C of type char and assign to each one a value. The following screen displays:
//	The value of each variable. The sum of N + A. And A - N
	static void calculateNA(int n, int a, char c){
		System.out.println("Question 19:");
		System.out.println("N = " + n);
		System.out.println("A = " + a);
		System.out.println("C = " + c );
		int sum = n + a + a - n;
		System.out.println("The sum of N + A and A - N = " + sum);
		System.out.println();
		
	}
	
	
	
//	20 - Write a java program that declares an integer variable B and assign it a value. It then displays a message indicating whether the value of B is positive or negative. We will consider 0 as positive.
	static void isPositive(){
		System.out.println("Question 20:");
		int B = 88;
		boolean isPos = false;
		if (B >= 0)
		System.out.println("B is positive");
		else System.out.println("B is negative");
		System.out.println();
	}

	
	
}
