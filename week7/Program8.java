/**
 * 
 * @author datn1
 * @created 3.17.22
 * 
 */
import java.util.Arrays;

public class Program8 {
	public static void main(String[] args) {
		String [] names = {"Maria", "Azis", "Galin", "Galena" }; 
		
		System.out.println(names[1]); // -> Azis
		
		names[0] = "Celine Dion"; //{"Celine Dion", "Azis", "Galin", "Galena" }
		
		int aLength = names.length; // 4 
		System.out.println(aLength);
		
		System.out.println(names[3]); // Galena,
		
		//Last index ==> length - 1 
		System.out.println(names[names.length - 1 ]); // Galena 
		//----------------------------------------------------------------------------------
		int [] numbers = new int[100]; 
		numbers [0] = 54;
		
		//----------------------------------------------------------------------------------
		double [] balances = new double[]{45.23, 46.85, 50.47}; 
		System.out.println(balances.length); // 3 
		//----------------------------------------------------------------------------------
		for (int i = 0; i < balances.length; i++) {
			balances[i] = balances[i]*100;
		}
		
		System.out.println(Arrays.toString(balances));
		
		double sum = 0.0; 
		for (double balance: balances)
			sum += balance;
		System.out.println("Total balance "+sum);
		
		System.out.print("[ "); 
		for (double balance: balances)
			System.out.print(balance +"  ");
		System.out.println("]");
		//Write lines of code to calculate the average of the sum of the elements inside balances
		 double average = sum/balances.length;
		 
	     System.out.println("Average of elements of Balances: "+ average);
		
	}
}
		
		
		