package or;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		// declare and initialize variables
		Scanner input = new Scanner(System.in);
		int num;
		String word;

		// ask user for input
		System.out.print("Enter a number: ");
		num = input.nextInt();

		// check to see if value is even or odd
		if (num % 2 == 0) {
			word = "even";
		} else {
			word = "odd";
		}

		// print number and if it's even or odd
		System.out.printf("%d is %s", num, word);
	}

}
