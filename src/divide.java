import java.util.Scanner;

public class divide {
	public void divide() {
		
		//this is like a scanner for user input or something like that i guess
		Scanner in = new Scanner(System.in);
				
		//asks the user for the value of the first number
		System.out.println("What is the value of the first number?");
		double num1 = in.nextDouble();
				
		//asks the user for the value of the second number
		System.out.println("What is the value of the second number?");
		double num2 = in.nextDouble();
				
		double result = 0; //the variable for the final result
				
		//does the actual calculations
		result = num1/num2;
				
		//prints out the calculation
		System.out.println("Your result is " + result); //u remember the variable result from before?
	}
}
