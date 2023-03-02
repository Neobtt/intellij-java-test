package dio.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Type the first number: ");
		a = scan.nextInt();
		System.out.println("Type the second number: ");
		b = scan.nextInt();
		
		int addition = addition(a,b);
		int subtraction = subtraction(a,b);
		double division = division(a,b);
		int multiplication = multiplication(a,b);
		
		System.out.println("Addition" + addition);
		System.out.println("Subtraction" + subtraction);
		System.out.println("Division" + division);
		System.out.println("Multiplication" + multiplication);
	}

	public static int addition(int a, int b) {
		return a + b;
	}
	public static int subtraction(int a, int b) {
		return a - b;
	}
	public static int division(int a, int b) {
		return a / b;
	}
	public static int multiplication(int a, int b) {
		return a * b;
	}
	
	
}
