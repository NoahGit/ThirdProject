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
	//���Ӷ˿�
	static final int PORT = 8888;
	//���ӵ�ַ
	static final String HOST = "222.25.0.14";
	Socket socket;
	public EhcoClient() throws UnknownHostException, IOException{
		//�����ͻ����׽���
		socket = new Socket(HOST,PORT);
	}
	//send()����
	public void send() throws IOException{
		try {
			//�ͻ���������������������Ϣ
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter
					(socket.getOutputStream()));
			//�ͻ��������������շ�������Ϣ
			BufferedReader br = new BufferedReader(new InputStreamReader
					(socket.getInputStream()));
			//װ�����������ʱˢ��
			PrintWriter pw = new PrintWriter(bw,true);
			//�����û���Ϣ
			Scanner in = new Scanner(System.in);
			String msg = null;
			while((msg=in.next())!=null){
				//���͸���������
				pw.println(msg);
				//������������ص���Ϣ
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
