package deom01;

public class Class07 {
	public void go() throws Exception{
		throw new Exception("�׸��쳣,����һ��");
	}//�ֶ��������쳣
	public  int test2(){
		try {
		System.out.println("ִ�д����");
		return 1;
		} catch (RuntimeException e) {
		System.out.println("�쳣");
		return 2;
		}finally{
		System.out.println("finally����");
		}
		}

	
	public static void main(String[] args) {
		Class07 c7 = new Class07();
		try{
			c7.go();
		}catch (Exception e) {
			System.out.println("���ִ���! ����ԭ��"+e.getMessage());
		}
		
		c7.test2();
		
	}
		/*int num3=0;
		try {
			int  num1=10;
			int num2=0;
			num3 = num1/num2;
			System.out.println(num3);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("��������Ϊ0");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}*/
		/*int num3=0;;
		try {
		String s=null;
		System.out.println(s.length());
		int  num1=10;
		int num2=0;
		num3 = num1/num2;
		System.out.println(num3);
		} catch (ArithmeticException e) {
		System.out.println("��������Ϊ0");
		e.printStackTrace();
		}catch (NullPointerException e) {
		System.out.println("�ַ�������Ϊ��");
		e.printStackTrace();
		}*/

	
}
