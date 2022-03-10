/**
 * 
 * @author Dat
 * @version 0.1 
 * @created 2.10.22 
 * @description Variables and data types
 *
 **/

public class Program3 { 
	public static void main(String[] args) {
		int num1 = 10; 
		int num2 = 20;
		
		int result = num1 + num2; 
		System.out.println(num1+" + " +num2+ " = "+ result);

		
		result = num1-num2; 
		System.out.println(num1+" - " +num2+ " = "+ result);
		
		result = num1*num2; 
		System.out.println(num1+" * " +num2+ " = "+ result);


		result = num1/num2; 
		System.out.println(num1+" / " +num2+ " = "+ result);
		
		result = num1%num2;//modulus 
		System.out.println(num1+" % " +num2+ " = "+ result);

		byte num3 = 127; 
		System.out.println(num1 +num3);

		double num4 = 5.0; 
		double num5 = 2.0;
		
		double total = num4/num5; 
		System.out.println(num4+" / " +num5+ " = "+ total);

		total = num1/num5; 
		System.out.println(num1+" / " +num5+ " = "+ total);
		
		total = num1/num4; 
		System.out.println(num1+" / " +num4+ " = "+ total);
		
		total = num1-num4; 
		System.out.println(num1+" - " +num4+ " = "+ total);
		
		float num6 =3.5f;
		
		float total2= num1 -num6; 
		System.out.println(num1+" - " +num5+ " = "+ total2);
		
		String word= "75"; 
		int num7 = Integer.parseInt(word); 
		System.out.println(num7);
		
		char letter = 'a'; 
		System.out.println(letter - 0); 
		int num8 = 'a'+'b'; 
		System.out.println(num8); 
		num8 = 97; 
		char l = (char)num8; 
		System.out.println(1);
	}
}

