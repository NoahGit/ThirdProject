package deom02;

public class Class01 extends Thread{
	public void run(){//����ִ�еĶ���
		long begin = System.currentTimeMillis();
		for(int a=0;a<50000000;a++){
			System.out.println(a);
		}
		long end = System.currentTimeMillis();
		System.out.println("��ʱ"+(end-begin)+"����");
	}
	
	public static void main(String[] args) {
		Class01 c01 = new Class01();
		c01.start();//�����̣߳�run��������ǰ�������ظ�����start
	}
}
