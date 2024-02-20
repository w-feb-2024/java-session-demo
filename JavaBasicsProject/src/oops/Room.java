package oops;

public class Room {
	private int length;
	private int width;
	private int height;
	private int floorArea;
	
	private int roomNo;
	private String color;
	
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
	
	public Room(int length, int width, int height){
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public Room(int length, int width, int height, int roomNo){
		this(length, width, height);
//		this.length = length;
//		this.width = width;
//		this.height = height;
		this.roomNo = roomNo;
	}
	
	public Room(int length, int width, int height, int roomNo, String color){
		this(length, width, height, roomNo);
//		this.length = length;
//		this.width = width;
//		this.height = height;
//		this.roomNo = roomNo;
		this.color = color;
	}
	
	// getter/accessors - read access to the private variable
	public int getLength() {
		return length;
	}
	
	// setter/mutator - write access to the private variable
	public void setLength(int length) {
		this.length = length;
	}
	
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getFloorArea() {
		return floorArea;
	}

	public void setFloorArea(int floorArea) {
		this.floorArea = floorArea;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int computeFloorArea() {
		floorArea = length * width;
		return floorArea;
	}
	
	public int computeCostOfPainting(int rate) {
		int wallArea = 2 * height * (length + width);
		int cost = wallArea * rate;
		return cost;
	}
}
