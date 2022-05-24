/*
 * Person
 * ----------------------
 * - name: String 
 * - age: int 
 * - money: double 
 * - hunger: int
 * ----------------------
 * +eat(food : int): void
 * +speak (message: String): void
 * 
 * 
 */
public class Person {
	private String name; 
	private int age;
	private double money;
	private int hunger;
	
	public Person() {
		this.name = "Dawn"; 
		this.age = 0; 
		this.money = 50.50;
		this. hunger = 1;
	}

	
	public Person(String name, int age, double money, int hunger) {
		this.name = name;
		this.age = age;
		this.money = money;
		this.hunger = hunger;
	}

	
	public String getName() {
		return name;
	}


	
	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getMoney() {
		return money;
	}


	public void setMoney(double money) {
		this.money = money;
	}


	public int getHunger() {
		return hunger;
	}


	public void setHunger(int hunger) {
		this.hunger = hunger;
	}
	public void eat(int food) {
		this.hunger -=food;
		speak("Yummy!");
	}
	public void speak(String message) {
		System.out.println(this.name + ": "+message  );
	}
	
	
	@Override
	public String toString() {
		
		return "Person: name:" +getName();
	}
	
	
}




