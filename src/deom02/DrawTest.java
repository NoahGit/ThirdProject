package deom02;

import java.util.Timer;
import java.util.TimerTask;

public class  DrawTest {
	public static void main(String[] args) {
		Account account1 = new Account("0001",1000);
		DrawThread dt1 = new DrawThread("����", account1, 800);
		DrawThread dt2 = new DrawThread("����", account1, 200);
		//��ʱ��������
		System.out.println("10���ִ�У�");
		//��ʱ������
		final Timer timer = new Timer();
		//��ʱ��Ҫִ�е��������
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				dt1.start();
				dt2.start();
				timer.cancel();//��ȡ���Ļ�����ʱ����ִ��������һֱ����
			}
		};
		//10000�����ִ������
		timer.schedule(task, 10000);
		
	}
}
