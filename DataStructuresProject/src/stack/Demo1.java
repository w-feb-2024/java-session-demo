package stack;

public class Demo1 {

	public static void main(String[] args) {
		StackArray stackArray = new StackArray(5);
		stackArray.push(45);
		stackArray.push(35);
		stackArray.push(65);
		
		System.out.println(stackArray);
		stackArray.pop();
		stackArray.pop();
		System.out.println(stackArray);
		
		System.out.println(stackArray.peek());
		

	}

}
