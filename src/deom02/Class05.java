package deom02;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;

public class Class05 {
	public static void main(String[] args) throws IOException {
		InetAddress ia = InetAddress.getLocalHost();
		System.out.println(ia.getHostName());
		System.out.println(ia.getHostAddress());
		
		InetAddress ia2=InetAddress.getByName("DESKTOP-A6U0T0F"); //ͨ�������������Ϣ
		System.out.println(ia2.getHostAddress());
		
		InetAddress ia3=InetAddress.getByAddress(new byte[]{(byte)222,(byte)25,0,14}); //ͨ������IP�����Ϣ
		System.out.println(ia3.getHostName());
		
		InetAddress ia4=InetAddress.getByName("www.163.com"); //����������DNS��ѯIp
		System.out.println("163 IP:"+ia4.getHostAddress());
		
		BufferedReader br = null;
		FileWriter fw = null;
		URL u = new URL("https://mail.163.com"); //���������Դ
		InputStream is = u.openStream();//���URL������������
		InputStreamReader isr = new InputStreamReader(is);
		br=new BufferedReader(isr);//��ȡ����װ�ַ���
		fw=new FileWriter("D://111.html"); //����Ϊ�ļ�
		String str = null;
		while((str=br.readLine())!=null){
			System.out.println(str);
			fw.write(str);
		}
		br.close();
		fw.flush();
		fw.close();
	}
}
