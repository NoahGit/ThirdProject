package deom01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Class11 {
	static File file=new File("F:/D/eee.txt");
	static File file1=new File("F:/D/fff.txt");
	final static String CART = "���"; 
	public static void main(String[] args) throws IOException {
		//���ַ�
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);
		int size = 0;
		while((size=isr.read())!=-1){ //�ж��Ƿ�ĩβ
			System.out.print((char)size);  //ת��Ϊ�ַ������
		}
		isr.close();
		
		//д�ַ�
		FileOutputStream fos = new FileOutputStream(file1);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		osw.write(CART);
		osw.write("\b");
		osw.write("��õ��˷�����ʡ��JFK��");
		osw.write("dasfdasf");
		osw.write("\r\n"); //����
		
		
		osw.write("43rewtg345645245");
		osw.flush();
		osw.close();
		
		
		
	}
}
