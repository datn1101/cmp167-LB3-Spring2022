import java.util.Scanner; 
import java.util. Random;
public class Lottery { 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		Random rand = new Random();

		System.out.println("Welcome to Lottery 3000");
		System.out.println("Enter the number to play with: ");
		int userNumber = input.nextInt();
		System.out.println("How much is wager: "); 
		double wager = input.nextDouble(); 
		System.out.println(); 
		System.out.println("Lottery Started ...");
		
		double userEarnings = 0.0;
		for(int i = 0; i < 3; i++) {
			System.out.println("Number "+(i+1)); 
			int number =rand.nextInt(10)+1; 
			System.out.println(" # " +number);

			if( number == userNumber) {
				System.out.println("Congrats you win!");
				
				if(i==0) {
					userEarnings = userEarnings+(wager*100);
				}
				else if (i==1) {
					userEarnings = userEarnings+(wager*50); 
				}else {
					userEarnings = userEarnings+(wager*10);
				}
				
			}
			else {
				System.out.println(" You lose");
			}
		}
		
		System.out.println("Earnings $ "+ userEarnings);
	}
	
}

