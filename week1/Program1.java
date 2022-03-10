/**
 *
 * @author Dat
 * @version 0.1 
 * @description This is my first program 
 * @created 2.3.22
 *
 **/
/*
 * hello 
 * this is 
 * a multi-line 
 * comment
 */

import java.util.Scanner; // Import Scanner class
public class Program1{
	
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);//creating the scanner object
		
		System.out.println("This is my first program!"); 
		System.out.println("Ok, please enter your name:"); 
		String name = input.nextLine(); 
		String message = "Hello, " + name + ", It is so nice to meet you!"; //+ is to concatenate 
		System.out.println(message);

		input.close();
	}
	
}

