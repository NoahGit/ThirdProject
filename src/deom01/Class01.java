package deom01;

public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1 ;System.out.println("i = "+i);
		int j = i++ ;System.out.println("i = "+i);
		if((i==(++j))&&((i++)==j)){
			i += j ;System.out.println("i = "+i);
		}
		System.out.println("i = "+i);
	}

}
