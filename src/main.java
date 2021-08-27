import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		//this is like a scanner for user input
		Scanner in = new Scanner(System.in);
		
		//variable for inputing the operation that will be used
		char op = '*';
		
		System.out.println("What operation do you want to use?");
		op = in.next().charAt(0); //once again i have no idea what im doing, in.next? what...
		
		switch(op) {
		case '+':
			
			//defines the object of plus? i guess.. idk how to explain it
			plus plusObject = new plus();
			//calls the object so it executes the code from the class plus
			plusObject.plus();
			
			break;
			
		case '-':
			
			//defines the object of minus? i guess.. idk how to explain it
			minus minusObject = new minus();
			//calls the object so it executes the code from the class plus
			minusObject.minus();
			
			break;
			
		case '/':
			
			//defines the object of minus? i guess.. idk how to explain it
			divide divideObject = new divide();
			//calls the object so it executes the code from the class plus
			divideObject.divide();
			
			break;
			
		case '*':
			
			multiply multiplyObject = new multiply();
			multiplyObject.multiply();
		}
		
	}

}

//plus plusObject = new plus();
//plusObject.plus();
