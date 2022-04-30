# Classes - ADT: Written description of the attributes or behaviors of an object

## Mammalia Class: Warm blooded, Fur/hair, teeth, milk/ 
## Classifying/ grouping based on common features
	
	accessModifier class NameOfclass {

	}
	
## Attributes : instance variables

## Behaviors  : instance methods

# Instance/Object: Instance of the class

# Constructor: special method that shares the same name of the class and Instantiates the object and initializes the instance variables

# Setters: Mutators : modifies the values of the instance variables
# Getters: Accesors : Retrieves the values of the instance variables

# Example:
	
	public class House {
		private int numWindows; 
		private String color; 
		private int numDoors; 
		private int numRooms; 
		private double cost;
	
		public House () {
			this.numWindows = 1;
			this.color		 = "blue"; 
			this.numDoors 	 = 1; 
			this.numRooms 	 = 2;
			this.cost 		 = 250000.00;
		}
		
		public House( int numWindows, String color, numDoors, numRooms, cost){
			this.numWindows	= numWindows;
			this.color 		= color;
			this.numDoors 	= numDoors;
			this.numRooms 	= numRooms;
			this.cost 		= cost;
		}
		
		
		public void setNumWindows(int numWindows){
			this.numWindows = numWindows;
		}
		public void setColor(String color ) {
			this.color = color;
		}
		
		
		public int getNumWindows(){
			return this.numWindows;
		}
		
		public String getColor(){
			return this.color;
		}
		
		
	}

# Object Oriented Programming Language
# Encapsulation : restricting the access to instance data by encapsulating the data and providing the access through getters & setters mathods
# Abstraction
# Inheritance
# Polymorphism

			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

