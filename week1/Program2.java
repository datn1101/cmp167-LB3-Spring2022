/**
 *
 * @author Yanilda 
 * @version 0.1 
 * @description This is my second program 
 * @created 2.3.22
 *
 **/

import java.util.Scanner; // Import Scanner class 
public class Program2 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);//creating the scanner object
		int num1, num2, num3;
		
		System.out.println("Enter  first number");
		num1 = input.nextInt();
		
		System.out.println("Enter  second number");
		num2 = input.nextInt();
		
		//Calculate
		num3 = num1 + num2;
		//output 
		System.out.println("Result "+num3);

		input.close();
		
		System.out.print("Hello");
		System.out.println(" Is it me you're waiting for?");
		System.out.print("Ah, no, sorry my bad");
	}
}