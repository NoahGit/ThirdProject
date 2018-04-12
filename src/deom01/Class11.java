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
	final static String CART = "你好"; 
	public static void main(String[] args) throws IOException {
		//读字符
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);
		int size = 0;
		while((size=isr.read())!=-1){ //判断是否到末尾
			System.out.print((char)size);  //转换为字符并输出
		}
		isr.close();
		
		//写字符
		FileOutputStream fos = new FileOutputStream(file1);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		osw.write(CART);
		osw.write("\b");
		osw.write("你好点了伐就拉省的JFK了");
		osw.write("dasfdasf");
		osw.write("\r\n"); //换行
		
		
		osw.write("43rewtg345645245");
		osw.flush();
		osw.close();
		
		
		
	}
}
