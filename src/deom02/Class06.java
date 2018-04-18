package deom02;

import java.io.IOException;
import java.net.Socket;

public class Class06 {
	static String host = "222.25.0.14";
	static int scope= 1024;
	public static void scan(String host,int scope){
		if(scope<=0 || scope>65535){
			System.out.println("�˿ڱ�����0-65536֮��");
			return;
		}
		Socket socket= null;
		for(int port=1;port<scope;port++){
			try {
				socket = new Socket(host,port);
				System.out.println("�˿ڣ�" + port + ",��ռ��");
			} catch (IOException e) {
				System.out.println("�˿ڣ�" + port + "�������ӣ�");
			}finally{
				if(socket!=null){
					try {
						socket.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Class06.scan(host, scope);
	}
}
