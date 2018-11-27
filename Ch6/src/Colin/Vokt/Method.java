package Colin.Vokt;

import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		template(input);

	}

	private static void template(Scanner input) {
		
		
		String answer = "";
		while (answer.equals("")) {
			
		
		System.out.println("Would you like to go to the forest the house of the lake");
		answer = input.nextLine();
		if (answer.equals("forest") {
			break;
			else {
				System.out.println("thats not a good response");
				answer = "";
			}
		}
		
	}

}
}