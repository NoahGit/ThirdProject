package deom01;

public class FirstSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 2;
		//double y = Math.sqrt(x);
		double y = Math.pow(x, 2);
		System.out.println(y);
		System.out.println(Math.PI);
		System.out.println((int)x);
		System.out.println(Math.round(x));
		System.out.println((byte)300);
		int m = 7; 
		int n = 7; 
		int a = 2 * ++m; // now a is 16, m is 8 
		int b = 2 * n++; // now b is 14, n is 8 
		System.out.println(a+","+b);
		boolean mm = x != 0 && 1 / x > x + y; // no division by 0
		System.out.println(x+","+y);
		System.out.println(mm);
		int fourthBitFromRight = (n & 0b1000) / 0b1000;
		System.out.println(fourthBitFromRight);
		System.out.println(x += y += a);
	}

}
