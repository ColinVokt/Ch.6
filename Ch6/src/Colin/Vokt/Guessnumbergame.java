package Colin.Vokt;
import java.util.Scanner;
/*
 * Colin Vokt
 * 11/18
 */

public class Guessnumbergame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int attempts = 0;
		
		System.out.println("Welcome! You must guess the number im thinking, Good Luck!");
		
			
		
		int num1 = (int)(Math.random() * 100);
		
		System.out.println("Enter a number between 1 and 100");
		
		int guess = input.nextInt();
		
		while (guess != num1) {
			attempts++;
			
			if (guess > num1) {
				System.out.println("Guess lower!");
			}
			
			else {
				System.out.println("Guess Higher!");
			}
			if (attempts == 10) {
				
			}
			guess = input.nextInt();
		}
		
			System.out.println("Congrats you guess the right number! the number was " + num1 + 
					" and you guessed " + attempts + " times.");
		
		
	}

}
