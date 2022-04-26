import java.util.Random;
public class Review {
		
	public static void main(String[] args) {
		Random r = new Random();
		int a, b, c; 
		a= 7; 
		b= 8; 
		c= 10;
		
		if (a>b) {
			System.out.println("A is greater"); 
		}else if (b<c ) {
			System.out.println("c is greater than b");
		}else {
			System.out.println("OK A is not greater than b and b is not less than c");
		}
		
		int the_number = r.nextInt(5)+ 1;
		
		switch(the_number) {
		
		case 1: {
			System.out.println("The value is 1"); 
			break;
		}
		case 2:{
			System.out.println("The value is 2"); 
			break;
		}
		case 3:{
			System.out.println("the value is 3"); 
			break;
		}
		default:
			System.out.println("default: The value is "+ the_number);
		}
	
	}

}
