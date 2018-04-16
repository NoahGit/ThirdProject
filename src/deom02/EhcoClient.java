package deom02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EhcoClient {
	//连接端口
	static final int PORT = 8888;
	//连接地址
	static final String HOST = "222.25.0.14";
	Socket socket;
	public EhcoClient() throws UnknownHostException, IOException{
		//创建客户端套接字
		socket = new Socket(HOST,PORT);
	}
	//send()方法
	public void send() throws IOException{
		try {
			//客户端输出流，向服务器发消息
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter
					(socket.getOutputStream()));
			//客户端输入流，接收服务器消息
			BufferedReader br = new BufferedReader(new InputStreamReader
					(socket.getInputStream()));
			//装饰输出流，及时刷新
			PrintWriter pw = new PrintWriter(bw,true);
			//接受用户信息
			Scanner in = new Scanner(System.in);
			String msg = null;
			while((msg=in.next())!=null){
				//发送给服务器端
				pw.println(msg);
				//输出服务器返回的消息
				System.out.println(br.readLine());
				if(msg.equals("quit")){
					break;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(null!=socket){
				socket.close();
			}
		}
	}
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		new EhcoClient().send();
	}
}
