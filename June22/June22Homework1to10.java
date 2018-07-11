

public class June22Homework1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printPhrase();	//Q1
		printInt();		//Q2
		printFloat();	//Q3
		printSum();		//Q4
		printSub();		//Q5
		printMul();		//Q6
		printDiv();		//Q7
		printNum3();	//Q8
		printNum9();	//Q9
		printNum10000();//Q10
	}


//	1 - Write a program in Java that prints the phrase "Hi, I already print sentences".
	static void printPhrase(){
		System.out.println("Question 1:");
		System.out.println("Hi, I already print sentences");
		System.out.println();
	}
	
//	2 - Write a program in Java that prints an int number, for example 273, or 597.
	static void printInt(){
		System.out.println("Question 2:");
		int i =888;
		System.out.println(i);
		System.out.println();
	}
	
//	3 - Write a program in Java that prints a float number, for example the 5.3, or the 7.5.
	static void printFloat(){
		System.out.println("Question 3:");
		float f = 2323.5f;
		System.out.println(f);
		System.out.println();
	}
	
//	4 - Write a program in Java that prints on the screen the sum of 1234 and 532.
	static void printSum(){
		System.out.println("Question 4:");
		int sum = 1234 + 532;
		System.out.println(sum);
		System.out.println();
	}
	

//	5 - Write a program in Java that prints the subtraction of 1234 and 532.
	static void printSub(){
		System.out.println("Question 5:");
		int sub = 1234 - 532;
		System.out.println(sub);
		System.out.println();
	}
	
//	6 - Write a program in Java that prints the multiplication of 1234 and 532 on screen.
	static void printMul(){
		System.out.println("Question 6:");
		int mul = 1234 * 532;
		System.out.println(mul);
		System.out.println();
	}
	

//	7 - Write a program in Java that prints the division of 1234 between 532.
	static void printDiv(){
		System.out.println("Question 7:");
		double div = 1234/532;
		System.out.println(div);
		System.out.println();
	}
	

//	8 - Write a program in Java that prints the numbers 1 to 3 on the screen.
	static void printNum3(){
		System.out.println("Question 8:");
		System.out.println(""+1+2+3);
		System.out.println();
	}
	

//	9 - Write a program in Java that prints the numbers 1 to 9 on the screen.
	static void printNum9(){
		System.out.println("Question 9:");
		for (int i = 1 ; i <=9 ; i++){
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
	}
//	10 - Write a program in Java that prints on the screen the numbers from 1 to 10,000.
	static void printNum10000(){
		System.out.println("Question 10:");
		for (int i = 1 ; i <=10000 ; i++){
			System.out.print(i + " ");
			if (i % 100 == 0) System.out.println();
		}
		System.out.println();
		
	}
		


	
	
	
	
	
	
	
	
	
	
	
}
