
public class Room {
	int length;
	int width;
	int height;
	int floorArea;
	
	int roomNo;
	String color;
	
	// constructor
	//   - special method
	//	 - does not have return type, not even void
	//   - has the class name
	// 	 - is called automatically when the object is created, we do not call it explicitly using object/reference variable
	
	// this - refers to the current object
	
	// constructor overloading
	//		- multiple constructors with different arguments
	// constructor chaining
	//		- we can call one constructor from another constructor using this()
	
	Room(int length, int width, int height){
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	Room(int length, int width, int height, int roomNo){
		this(length, width, height);
//		this.length = length;
//		this.width = width;
//		this.height = height;
		this.roomNo = roomNo;
	}
	
	Room(int length, int width, int height, int roomNo, String color){
		this(length, width, height, roomNo);
//		this.length = length;
//		this.width = width;
//		this.height = height;
//		this.roomNo = roomNo;
		this.color = color;
	}
	
	int computeFloorArea() {
		floorArea = length * width;
		return floorArea;
	}
	
	int computeCostOfPainting(int rate) {
		int wallArea = 2 * height * (length + width);
		int cost = wallArea * rate;
		return cost;
	}
}
