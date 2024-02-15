
public class OperatorDemo {

	// operators
			// 1. Arithmetic operators - + - * / %
			// 2. Relation operators > < >= <= == !=
			// 3. Logical operators && || !
			// 4. Assignment operator =
			// 5. Arithmetic assignment operator += -+ /+ *= %=
			//				int a = 10;
			//				a = a + 2; 
			//				a += 2;
			// 6. ternary operator
			//		int a = 10, b = 20;
			//		int c = a>b?a:b;
			// 7. increment / decrement , prefix/postfix operators
			//			++, --
			// 8. bitwise operators
			// 			& | ^ <<(left shift) >>(right shift) >>>(unsigned right shift)
	
	public static void main(String[] args) {
		int a = 10;
		int b = 25;
		int c = a>b?a:b;
		String result = b%a==0?"Divisible":"Not Divisible";
		System.out.println("String result = b%a==0?\"Divisible\":\"Not Divisible\"");
		System.out.println(result);

		
		int i = 5;
		i = i + 1;
		i++;
		++i;
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i);
		System.out.println(i++);
		System.out.println(i);
		
		byte num1 = 5;
		byte num2 = 7;
		byte result1 = (byte)(num1 & num2);
		// 0000 0101
		// 0000 0111
		// 0000 0101 = 5
		System.out.println("5&7=" + result1);
		
		byte result2 = (byte)(num1 << 2);
		// 0000 0101
		// 0000 1010
		// 0001 0100 = 20
		
		System.out.println("5<<2=" + result2);
		
		byte result3 = (byte)(num1 >> 2);
		// 0000 0101
		// 0000 0010
		// 0000 0001 = 1
		// whatever is the higher order bit >> fills it up with that number
		System.out.println("5>>2=" + result3);
		
		byte result4 = (byte)(num1 >>> 2);
		// irrespective of whatever is the higher order bit >>> fills it up with 0
		System.out.println("5>>>2=" + result4);
		
	}

}