package deom02;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Myclient {
	public static void main(String[] args) {
		final int backlog=100;
		String host = "222.25.0.14";
		int port = 8888;
		Socket[] sockets = new Socket[backlog];
		//创建100个连接
		for(int i=0; i<backlog; i++){
			try {
				sockets[i] = new Socket(host,port);
				System.out.println("第"+(i+1)+"次连接成功！");
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("第"+(i+1)+"次连接失败！");
			}
		}
		for(Socket s:sockets){
			try {
				s.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
