/*
______________________
		Bird
 _____________________
 - species :String
 - age : int
 - colorOfFeather:String
 _____________________
 + Constructors
 + setter & getters
 + equals(obj Object):boolean
 + toString() : boolean
 + sing(): void
 _____________________
 
 
 */
public class Bird {
	//Attributes 
	private String species; 
	private int age; 
	private String colorOfFeather;
	
	//Behaviors 
	//constructors 
	public Bird() {
		this.species = "Cockatiel"; 
		this.age = 4; 
		this.colorOfFeather="yellow";
	}
	public Bird(String species, int ages, String colorOfFeather) {
		this.species = species; 
		this.age = age; 
		this.colorOfFeather= colorOfFeather;
	}

	
	//setters
	public void setSpecies(String species) {
		this.species =species;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setColorOfFeather(String colorOfFeather) {
		this.colorOfFeather = colorOfFeather;
	}
	
	public String getSpecies() {
		return species;
	}
	public int getAge() {
		return age;
	}
	public String getColorOfFeather() {
		return colorOfFeather;
	}
	
	public boolean equals(Object obj) {
		if(obj == this) return true;
		if(obj==null) return false;
		
		if (obj instanceof Bird) {
			Bird otherBird= (Bird)obj;
			return otherBird.species.equals(this.species)&& otherBird.age == this.age
					&& otherBird.colorOfFeather.equals(this.colorOfFeather);
		}
		return false;
	}
	
	public String toString() {
		
		return "Bird: species: "+this.species+", age: "+this.age+", color of feather: "+this.colorOfFeather;
	}


}

