package deom01;
import java.util.Scanner;

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
		
		String str = "Hello";
		String str1 = str.substring(0,3)+"p!";
		System.out.println("str1="+str1);
		String all = String.join("/",  "S", "M", "L", "XL"); 
		System.out.println(all);
		System.out.println(str.equals(all));
		System.out.println("hello".equalsIgnoreCase(str));
		System.out.println(str1.compareTo(str));;
		System.out.println(str != null);
		System.out.println(str.length() != 0);
		System.out.println(!str.equals("Hello"));
		System.out.println(str != null && !str.equals("") && str.length() != 0);
		str = str.toLowerCase();
		System.out.println(str);
		str = str.trim();
		System.out.println(str);
		System.out.println("str1="+str1);
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		System.out.println("sb="+sb);
		sb.append(str1);
		System.out.println("sb="+sb);
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("What's your name£¿");
		while(in.hasNext()){
			String name = in.nextLine();
			System.out.println("my name is "+name);
			if(name.equals("jot")){
				break;
			}
		}
		
		System.out.println("How old are you?");
		while(in.hasNext()){
			int age = in.nextInt();
			System.out.println("i'm "+age);
			if(age == 20){
				break;
			}
		}
	}
}
