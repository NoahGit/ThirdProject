package deom02;

public class Class01 extends Thread{
	public void run(){//具体执行的动作
		long begin = System.currentTimeMillis();
		for(int a=0;a<50000000;a++){
			System.out.println(a);
		}
		long end = System.currentTimeMillis();
		System.out.println("用时"+(end-begin)+"毫秒");
	}
	
	public static void main(String[] args) {
		Class01 c01 = new Class01();
		c01.start();//启动线程，run方法结束前不能再重复调用start
	}
}
