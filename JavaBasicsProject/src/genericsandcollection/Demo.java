package genericsandcollection;
public class Demo {

	public static void main(String[] args) {
		Box box1 = new Box(300,200,100);
		//System.out.println(box1.toString());
		System.out.println(box1); // implicitly it calls the toString()
		
		//Box box2 = new Box(300.5, 200.75, 100.25);
		BoxGenerics<Double, Integer> box3 = new BoxGenerics<>(200.45, 150.56, 100, "abc");
		System.out.println(box3);
		
		BoxGenerics<Double, Double> box4 = new BoxGenerics<>(300.45, 200.59, 100.25, "lmn");
		System.out.println(box4);
	}
	

}
