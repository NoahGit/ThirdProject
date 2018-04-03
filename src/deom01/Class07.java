package deom01;

public class Class07 {
	public void go() throws Exception{
		throw new Exception("抛个异常,测试一下");
	}//手动创建新异常
	public  int test2(){
		try {
		System.out.println("执行代码块");
		return 1;
		} catch (RuntimeException e) {
		System.out.println("异常");
		return 2;
		}finally{
		System.out.println("finally代码");
		}
		}

	
	public static void main(String[] args) {
		Class07 c7 = new Class07();
		try{
			c7.go();
		}catch (Exception e) {
			System.out.println("出现错误! 错误原因："+e.getMessage());
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
			System.out.println("除数不能为0");
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
		System.out.println("除数不能为0");
		e.printStackTrace();
		}catch (NullPointerException e) {
		System.out.println("字符串不能为空");
		e.printStackTrace();
		}*/

	
}
