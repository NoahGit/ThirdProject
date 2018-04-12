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
				System.out.println(name+":ȡǮ�ɹ����³���Ʊ��"+drawAmount);
				account.setBalance(account.getBalance()-drawAmount);
				System.out.println(name+"--���Ϊ��"+account.getBalance());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else{
				System.out.println(name+":ȡǮʧ�ܣ����㣡");
			}
		}
		
	}
}
