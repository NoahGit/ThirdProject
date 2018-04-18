package deom02;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	int port = 8888;
	ServerSocket serverSocket;
	static int i = 0;
	
	public MyServer() throws IOException {
		//使用系统默认队列长度 50
		serverSocket = new ServerSocket(port);
		System.out.println("服务启动");
	}
	public void service(){
		/*Scanner i = new Scanner(System.in);
		//让程序等待，服务一直存在
		String msg = i.next();*/
		
		while(true){
			Socket socket = null;
			i++;
			//接受到此套接字的连接 
			try {
				
				socket = serverSocket.accept();
				System.out.println("Server> 新连接"+i+"："
				  +socket.getInetAddress()+" "+socket.getPort());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally{
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
	public static void main(String[] args) throws IOException {
		new MyServer().service();
		
	}	

}
