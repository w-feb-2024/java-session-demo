
public class ClassesAndObjectsDemo {

	
	// class
	//	- sketch, blueprint, design, template
	//  - a class can contain
	//		- (instance/static)variables/ data members/ attributes/ properties
	//		- methods/ functions/ behaviour/ member functions
	//		- block of code
	
	
	// class Person{
	//		String gender;
	//		int age;
	//		String name;
	// 		double height;
	//		boolean talk(){}
	// 	    boolean run() {}
	//}
	public static void main(String[] args) {
		int mark;
		mark = 60;
		
//		Room diningRoom;
//		diningRoom = new Room();
		
		Room diningRoom = new Room(400, 200, 150);
		
//		diningRoom.length = 400;
//		diningRoom.width = 200;
//		diningRoom.height = 150;
//		
		
		System.out.println("Floor area : " + diningRoom.computeFloorArea());
		System.out.println("Cost of painting : " + diningRoom.computeCostOfPainting(2));
		
		
		Room studyRoom = new Room(200, 100, 150);
		
//		studyRoom.length = 200;
//		studyRoom.width = 100;
//		studyRoom.height = 150;
		
		System.out.println("Floor area : " + studyRoom.computeFloorArea());
		System.out.println("Cost of painting : " + studyRoom.computeCostOfPainting(2));
		
		System.gc();
		Runtime.getRuntime().gc();
	}

}
