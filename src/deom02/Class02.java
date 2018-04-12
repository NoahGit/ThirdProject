package deom02;

public class Class02 extends Thread{
	public void run(){
		for(int i=1;i<20;i++){
			System.out.println(currentThread().getName()+":"+i);
			try {
				sleep(2000);//睡眠1000毫秒，给其他线程机会
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Class02 c02 = new Class02();//创建第一个线程对象
		Class02 c0201 = new Class02();//创建第二个线程对象
		c02.start();
		c0201.start();
	}
}
