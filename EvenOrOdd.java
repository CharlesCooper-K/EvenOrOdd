package or;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		String word;
		
		System.out.print("Enter a number: ");
		num = input.nextInt();
		
		if (num % 2 == 0) {
			word = "even";
		} else {
			word = "odd";
		}
		
		System.out.printf("%d is %s", num, word);
	}

}
