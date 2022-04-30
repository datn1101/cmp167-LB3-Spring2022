/**
 * 
 * @author datn1
 *
 */
	public class House {
		//Instance Variables
		private int numWindows; 
		private String color; 
		private int numDoors; 
		private int numRooms; 
		private double cost;
	
		//Constructors
		public House(){
			this.numWindows = 1;
			this.color		= "blue"; 
			this.numDoors 	= 1; 
			this.numRooms 	= 2;
			this.cost 		= 250000.00;
		}
		
		public House( int numWindows, String color, int numDoors, int numRooms, double cost){
			this.numWindows	= numWindows;
			this.color 		= color;
			this.numDoors 	= numDoors;
			this.numRooms 	= numRooms;
			this.cost 		= cost;
		}
		
		//Setters
		public void setNumWindows(int numWindows){
			this.numWindows = numWindows;
		}
		public void setColor(String color ) {
			this.color = color;
		}
		
		//Create setters for numDoors. numRooms, cost
		public void setnumDoors(int numDoors) {
			this.numDoors = numDoors;
		}
		
		//Getters
		public int getNumWindows(){
			return this.numWindows;
		}
		
		public String getColor(){
			return this.color;
		}
		
		
		//Create getters for numDoors. numRooms, cost
}