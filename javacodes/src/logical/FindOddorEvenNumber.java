package logical;

import java.util.Scanner;

public class FindOddorEvenNumber {

	public static void main(String[] args) {

		// basicScenario();
		inputFromUserScenario();
	}

	static void basicScenario() {

		int[] number = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < number.length; i++) {

			if (number[i] % 2 == 0) {
				System.out.println(number[i] + " Is even Number");
			} else {
				System.out.println(number[i] + " Is Odd Number");
			}

		}

	}

	static void inputFromUserScenario() {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int userInput = reader.nextInt();

		if (userInput % 2 == 0) {
			System.out.println(userInput + " Is even Number");
		} else {
			System.out.println(userInput + " Is Odd Number");
		}
	}
}