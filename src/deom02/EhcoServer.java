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
		//�������������׽���
		serverSocket = new ServerSocket(PORT);
		System.out.println("������������");
	}
	//servic()����
	public void servic() throws IOException{
		Socket socket = null;
		while(true){
			try {
				//�ȴ���ȡ���û����ӣ��������׽���
				socket = serverSocket.accept();
				//�ͻ�����Ϣ
				System.out.println("�����ӣ����ӵ�ַ��"+socket.getInetAddress()+":"+socket.getPort());
				//����������ȡ�ͻ�����Ϣ
				BufferedReader br = new BufferedReader(new InputStreamReader
						(socket.getInputStream()));
				//���������ͻ���д��Ϣ
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter
						(socket.getOutputStream()));
				//װ���������true,ÿдһ�о�ˢ�����������������flush
				PrintWriter pw = new PrintWriter(bw,true);
				//�����û��������Ϣ
				String info = null;
				while((info=br.readLine())!=null){
					//����û����͵���Ϣ
					System.out.println(info);
					//��ͻ��˷����û����͵���Ϣ��println��������Զ�ˢ�»�����
					pw.println("you said:"+info);
					//����û����롰quit�����˳�
					if(info.equals("quit")){
						break;
					}
				}
				//����ͻ��˶Ͽ����ӣ���Ӧ������쳣������Ӧ�ж�����whileѭ����ʹ�÷������ܼ����������ͻ���ͨ�� 
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
