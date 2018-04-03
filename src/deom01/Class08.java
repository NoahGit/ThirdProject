package deom01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Class08 {
	public static void main(String[] args) throws IOException {
		File file = new File("F:/D/eee.txt");
		
		
		@SuppressWarnings("resource")
		FileInputStream fis = new FileInputStream(file);
//		int data;
//		while((data=fis.read())!=-1){
//			System.out.print((char)data+" ");
//		}
//		fis.close();
		/*System.out.println(file.getAbsolutePath());
		System.out.println(file.getCanonicalFile());
		System.out.println(file.getParent());
		System.out.println(file.getPath());
		System.out.println(file.getFreeSpace());*/
		System.out.println(file.length());
		byte[] b = new byte[(int)file.length()];
		for(int i=0;i<file.length();i++){
			b[i]=(byte)fis.read();
			//System.out.print(b[i]);
		}
		String s = new String(b);
		
		System.out.println(s);
		
		
		
	}
}
