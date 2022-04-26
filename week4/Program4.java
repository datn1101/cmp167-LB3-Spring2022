/**
 * 
 * @author datn1
 *
 */

import java.util.Scanner; 
import java.util.Random;

public class Program4 { 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		Random  rand = new Random();
	
		
	
		System.out.println("Welcome");
	
		System.out.println("How old are you?");
		
		int userChoice = input.nextInt();
		String status = null;

		//Winning 
		if ((userChoice >= 21)) {
			status = "You may drink!";
		}
		else if ( userChoice < 21) {
			status = "You cannot drink!";
		}
		// Lose 
		else {
			status = "You cannot drink!";
		}
			
		System.out.println(status); 

		input.close();

	}
}
