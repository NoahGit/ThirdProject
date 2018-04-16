package deom02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EhcoServer {
	ServerSocket serverSocket;
	private final int PORT = 8888;
	
	public EhcoServer() throws IOException{
		//创建服务器端套接字
		serverSocket = new ServerSocket(PORT);
		System.out.println("服务器启动。");
	}
	//servic()方法
	public void servic() throws IOException{
		Socket socket = null;
		while(true){
			try {
				//等待并取出用户连接，并创建套接字
				socket = serverSocket.accept();
				//客户端信息
				System.out.println("新连接，连接地址："+socket.getInetAddress()+":"+socket.getPort());
				//输入流，读取客户端信息
				BufferedReader br = new BufferedReader(new InputStreamReader
						(socket.getInputStream()));
				//输出流，向客户端写信息
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter
						(socket.getOutputStream()));
				//装饰输出流，true,每写一行就刷新输出缓冲区，不用flush
				PrintWriter pw = new PrintWriter(bw,true);
				//接收用户输入的信息
				String info = null;
				while((info=br.readLine())!=null){
					//输出用户发送的消息
					System.out.println(info);
					//向客户端返回用户发送的消息，println输出完后会自动刷新缓冲区
					pw.println("you said:"+info);
					//如果用户输入“quit”就退出
					if(info.equals("quit")){
						break;
					}
				}
				//如果客户端断开连接，则应捕获该异常，但不应中断整个while循环，使得服务器能继续与其他客户端通信 
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally{
				if(null!=socket){
					socket.close();
				}
			}
			
		}
	}
	public static void main(String[] args) {
		try {
			new EhcoServer().servic();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
