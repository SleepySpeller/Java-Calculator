import java.util.Scanner;

public class plus {
	public void plus() {
		
		//this is like a scanner for user input or something like that i guess
		Scanner in = new Scanner(System.in);
		
		//asks the user for the value of the first number
		System.out.println("What is the value of the first number?");
		double num1 = in.nextDouble();
		
		//asks the user for the value of the second number
		System.out.println("What is the value of the second number?");
		double num2 = in.nextDouble();
		
		double result = 0; //the variable for the final result
		
		result = num1+num2;
		
		System.out.println("Your result is " + result);
	}
}
