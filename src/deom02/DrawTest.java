package deom02;

import java.util.Timer;
import java.util.TimerTask;

public class  DrawTest {
	public static void main(String[] args) {
		Account account1 = new Account("0001",1000);
		DrawThread dt1 = new DrawThread("张明", account1, 800);
		DrawThread dt2 = new DrawThread("王方", account1, 200);
		//定时器试运行
		System.out.println("10秒后执行：");
		//定时器对象
		final Timer timer = new Timer();
		//定时器要执行的任务对象
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				dt1.start();
				dt2.start();
				timer.cancel();//不取消的话，定时任务执行完后进程一直存在
			}
		};
		//10000毫秒后执行任务
		timer.schedule(task, 10000);
		
	}
}
