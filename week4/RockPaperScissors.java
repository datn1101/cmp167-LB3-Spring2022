/**
 * 
 * @author datn1
 *
 */

import java.util.Scanner; 
import java.util.Random;

public class RockPaperScissors { 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		Random  rand = new Random();
	
		
		int pcChoice = rand.nextInt(3) + 1;
	
		System.out.println("Welcome to Rock Paper and Scissors 3000");
	
		System.out.println("Enter 1 for Scissors, 2 for Rock, 3 for Paper");
		
		int userChoice = input.nextInt();
		String status = null;

		//Winning 
		if ((userChoice == 1 && pcChoice == 3) || (userChoice==2 && pcChoice ==1 ) || (userChoice == 3 && pcChoice ==2 )) {
			status = "You win!";
		}
		//Tie 
		else if ( userChoice == pcChoice) {
			status = "Tie!";
		}
		// Lose 
		else {
			status = "You lose!";
		}
			
		System.out.println(status); 
		System.out.println("You chose: "+ userChoice);
		System.out.println("PC chose: "+ pcChoice);

		input.close();

	}
}
