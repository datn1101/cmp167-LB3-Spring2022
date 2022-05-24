
public class BirdTest {
	public static void main(String[] args) {
		Bird bird1 = new Bird();
		Bird bird2 = new Bird("Chicken", 1, "red");
		Bird bird3 = new Bird(); 
		System.out.println(bird1); 
		System.out.println(bird2); 
		System.out.println(bird3); 
		System.out.println(bird1.equals(bird2));//false 
		System.out.println(bird1.equals(bird3));//true
	}
}
