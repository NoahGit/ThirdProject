package deom01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Class13 {
	static File file=new File("F:/D/eee.txt");
	static File file1=new File("F:/D/fff.txt");
	final static String CART = "你好"; 
	public static void main(String[] args) throws IOException {
		/*FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis); //字符流
		*/	
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr,1024);   //带缓冲的字符流
		String str = null;
		while((str=br.readLine())!=null){  //每次读取一行字符
			System.out.println(str);
		}
		br.close();
		
		/*FileOutputStream fos = new FileOutputStream(file1);
		OutputStreamWriter osw = new OutputStreamWriter(fos);*/
		FileWriter fw = new FileWriter(file1);
		BufferedWriter bw = new BufferedWriter(fw, 1024);
		bw.write(CART);
		bw.newLine();  //换行
		bw.write("dasfkjdlas");
		bw.flush();
		bw.close();
		
		
	}
}
