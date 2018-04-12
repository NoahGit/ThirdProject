package deom02;

public class DrawThread extends Thread{
	private String name;
	private Account account;
	private double drawAmount;
	
	public DrawThread(String name, Account account, double drawAmount) {
		super();
		this.name = name;
		this.account = account;
		this.drawAmount = drawAmount;
	}
	
	public void run(){
		synchronized (account) {
			if(account.getBalance()>=drawAmount){
				System.out.println(name+":取钱成功！吐出钞票："+drawAmount);
				account.setBalance(account.getBalance()-drawAmount);
				System.out.println(name+"--余额为："+account.getBalance());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else{
				System.out.println(name+":取钱失败！余额不足！");
			}
		}
		
	}
}
