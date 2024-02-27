package array;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] temperature = new int[7];
		 temperature[0] = 33;
		 temperature[1] = 34;
		 temperature[2] = 35;
		 temperature[3] = 33;
		 temperature[4] = 33;
		 temperature[5] = 32;
		 temperature[6] = 36;
		 // time complexity to fetch a data from the array when the index is known  - O(1)
		 // time complexity to fetch data from array with the value - O(n)
		 System.out.println(temperature[4]); // base address + (index * size of each element)
		 
		 int value = 36;
		 for(int data: temperature) {
			 if(data == value) {
				 System.out.println("found");
				 break;
			 }
		 }
		 
		 
	}

}
