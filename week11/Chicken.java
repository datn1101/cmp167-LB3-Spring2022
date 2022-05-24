
public class Chicken extends Bird {
	private char gender ;

		public Chicken() {
			super(); 
			super.setSpecies("Polish");
			this.gender ='h';
		}

		public Chicken(String species, int age, String colorOfFeather, char gender) {
			super(species, age, colorOfFeather); 
			this.gender = gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
		public char getGender() {
			return gender;
		}
		
		public boolean equals(Object obj) { 
			if(super.equals(obj) && obj instanceof Chicken) {
				Chicken otherChicken = (Chicken) obj; 
				return this.gender == otherChicken.gender;
			}
			return false;
		}
		@Override 
		public String toString() {
			
			return "Chicken Type:" +super.toString()+ ", gender: "+this.gender;
		}
		public static void main(String[] args) {
			
			Chicken ch1 = new Chicken(); 
			Chicken ch2 = new Chicken("Rhode Island Red", 1, "red", 'r'); 
			
			
			Chicken [] chickens = {ch1, ch2, new Chicken()};
			
			for(Chicken temp: chickens) {
				System.out.println(temp);
			}
			
			Chicken [] chickens100 = new Chicken[100];
			for(int i=0; i <chickens100.length; i++ ) {
				chickens100 [i] = new Chicken();
				chickens100 [i].setAge(2);
				System.out.println(chickens100[i]);
			}
	
		
	}
}

