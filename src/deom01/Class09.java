package deom01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Class09 {
	public static void main(String[] args) throws IOException {
		File file1 = new File("F:/D/eee.txt");
		File file2 = new File("F:/D/fff.txt");
		FileInputStream fis = new FileInputStream(file1);
		FileOutputStream fos = new FileOutputStream(file2);
		final int SIZE = 1024;
		byte[] buff = new byte[SIZE];
		int len = fis.read(buff);
		while(len!=-1){
			fos.write(buff, 0, len);
			len=fis.read(buff);
		}
		fis.close();
		fos.flush();
		fos.close();
		
		
	}
	
}
