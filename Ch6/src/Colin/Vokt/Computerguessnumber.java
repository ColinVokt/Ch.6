package Colin.Vokt;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
/*
 * Colin Vokt
 * 11/18
 */
public class Computerguessnumber {

	public static void main(String[] args) {
		int low = 0;
		int high = 100;
		Scanner input = new Scanner(System.in);
		 int random = ThreadLocalRandom.current().nextInt(low,high);
		 System.out.println("Welcome to the guessing game");
		 
		System.out.println("Ente a number for the computer to guess");
		int num1 = input.nextInt();
		 
		 while (random != num1) {
			 
			 
			 if (random > num1) {
				 System.out.println("The computer guessed to high, subtracting by 10");
				high = high - 10;
			 }
			 else {
				 System.out.println("The computer guessed to low, adding by 10");
				low = low + 10;
			 }
			 num1 = input.nextInt();
		 }
		 
		 System.out.println("Congrats computer you guessed the right number! the number was " + num1);
					

	}

}
