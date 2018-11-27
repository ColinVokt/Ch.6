package Colin.Vokt;

import java.util.Scanner;


/*
 * Colin Vokt
 * 11/18
 */

public class Subtractiongame {

	public static void main(String[] args) {
		final int NUMBER_OF_QUESTIONS=5;
		int correctCount = 0;
		int count = 0;
		String output = " ";
		long startTime = System.currentTimeMillis();
		
		Scanner input = new Scanner(System.in);
		
		while ( count < NUMBER_OF_QUESTIONS ) {
			//Generate 2 random single-digit integers
			int number1 = (int)(Math.random() * 100); 
			int number2 = (int)(Math.random() * 100);
			// If number1 < number2, Swap number1 and number2
			if ( number1 < number2 ) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
			//Prompt the student to answer "What is number1 - number2
			System.out.println("What is " +number1+ " - " +number2+ "?");
			int answer = input.nextInt();
			
			// Grade the answer and display the result
			if (number1- number2 == answer) {
				System.out.println("Your correct!");
				correctCount ++;
			}
			else {
				System.out.println("Your Wrong!\n" + number1 + " - " + number2 + " should be " + (number1 - number2));
			}
			// Increase the question count
			count++;
			output += "\n" + number1 + " - " + number2 + " = " + answer +
					((number1 - number2 == answer) ? " correct" : " wrong");
		}
		long endTime = System.currentTimeMillis();
		long testTime= endTime - startTime;
		System.out.println("Correct count is " + correctCount + "\nTest time is " +
		testTime /1000 + " seconds\n" + output);
		
		
		
		
		
	}

}
