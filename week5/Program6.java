/**
 * 
 * @author datn1
 *
 */
public class Program6 {
	public static void main (String[] args) {
		// Calculate the sum of 10 numbers from 1 to 10 
		int sum = 0; 
		for( int i = 1; i <= 10; i++) {
			sum += i;// sum = sum + i;
		}
		System.out.println("The sum is "+ sum);
		
		/*
		 1 + 2 = 3 + 3 = 6 + 4 = 10 +5 = 15 +6 =21 +7 = 28 + 8 = 36 + 9= 45 +10 = 55
		 
		 */
		
		// Write a for loop to calculate the sum of all the numbers between 20 and 150
		int newsum = 0; 
		for( int i = 20; i <= 150; i++) {
			newsum += i;// sum = sum + i;
		}
		System.out.println("The sum is "+ newsum);
		

	}
}
