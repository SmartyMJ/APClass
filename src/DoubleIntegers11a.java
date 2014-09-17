

// This program multiplies a given integer by two.

import java.util.Scanner;

public class DoubleIntegers11a 
{
	private static Scanner keyboard;

	public static void main(String[] args)
	{
		keyboard = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = keyboard.nextInt();
		System.out.println("2 * " + n + " = " + (n + n));
		
	}
}
