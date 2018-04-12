package deom01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Class10 {
	public static void main(String[] args) throws IOException {
		//读数据
		File file=new File("F:/D/eee.txt");
		File file1=new File("F:/D/fff.txt");
//		FileInputStream fis = new FileInputStream(file);
//		BufferedInputStream bis = new BufferedInputStream(fis);
//		String content= "";
//		byte[] buffer = new byte[1024];
//		int flag = 0;
//		while((flag=bis.read(buffer))!=-1){
//			content+=new String(buffer,0,flag);
//		}
//		System.out.println(content);
//		bis.close();
		//写数据
//		FileOutputStream fos = new FileOutputStream(file1);
//		BufferedOutputStream bos = new BufferedOutputStream(fos);
//		String content1 = "我是缓冲输出流测试数据！";
//		bos.write(content1.getBytes(),0,content1.getBytes().length);
//		bos.flush();
//		bos.close();
		/**
         * 1.先将文件中的内容读入到缓冲输入流中
         * 2.将输入流中的数据通过缓冲输出流写入到目标文件中
         * 3.关闭输入流和输出流
         */
		//先读再写，完成复制功能
		long begin = System.currentTimeMillis();
		FileInputStream fis =new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream(file1);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int size = 0;
		byte[] buffer = new byte[1024];
		while((size=bis.read(buffer))!=-1){
			bos.write(buffer, 0, size);;
		}
		bos.flush();
		bis.close();
		bos.close();
		
		long end= System.currentTimeMillis();
		System.out.println("使用缓冲输出流和缓冲输入流实现文件的复制完毕！耗时："+(end-begin)+"毫秒");
		
		
		
		
		
		
	}
}
