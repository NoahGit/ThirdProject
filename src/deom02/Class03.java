package deom02;

public class Class03 implements Runnable{
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<10; i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
			if(i==5){
				try {
					Thread.currentThread().wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(Thread.currentThread().getName().equals("Thread-2")){
				Thread.currentThread().notify();
			}
			
			//Thread.yield();
			//Thread.currentThread().interrupt();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("主线程默认优先级为："+Thread.currentThread().getPriority());
		Class03 c03 = new Class03();
		
		Thread t0 = new Thread(c03);
		//t0.setPriority(t0.MAX_PRIORITY);
		System.out.println("t0优先级为："+t0.getPriority());
		Thread t1 = new Thread(c03);
		//t1.setPriority(t1.MIN_PRIORITY);
		System.out.println("t1优先级为："+t1.getPriority());
		Thread t2 = new Thread(c03);
		//t2.setPriority(t2.MIN_PRIORITY);
		System.out.println("t2优先级为："+t2.getPriority());
		t0.start();
		t1.start();
		t2.start();
		//t1.join();
	}
}
