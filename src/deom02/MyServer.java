package deom02;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	int port = 8888;
	ServerSocket serverSocket;
	static int i = 0;
	
	public MyServer() throws IOException {
		//ʹ��ϵͳĬ�϶��г��� 50
		serverSocket = new ServerSocket(port);
		System.out.println("��������");
	}
	public void service(){
		/*Scanner i = new Scanner(System.in);
		//�ó���ȴ�������һֱ����
		String msg = i.next();*/
		
		while(true){
			Socket socket = null;
			i++;
			//���ܵ����׽��ֵ����� 
			try {
				
				socket = serverSocket.accept();
				System.out.println("Server> ������"+i+"��"
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
