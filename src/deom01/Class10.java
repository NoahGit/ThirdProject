package deom01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Class10 {
	public static void main(String[] args) throws IOException {
		//������
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
		//д����
//		FileOutputStream fos = new FileOutputStream(file1);
//		BufferedOutputStream bos = new BufferedOutputStream(fos);
//		String content1 = "���ǻ���������������ݣ�";
//		bos.write(content1.getBytes(),0,content1.getBytes().length);
//		bos.flush();
//		bos.close();
		/**
         * 1.�Ƚ��ļ��е����ݶ��뵽������������
         * 2.���������е�����ͨ�����������д�뵽Ŀ���ļ���
         * 3.�ر��������������
         */
		//�ȶ���д����ɸ��ƹ���
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
		System.out.println("ʹ�û���������ͻ���������ʵ���ļ��ĸ�����ϣ���ʱ��"+(end-begin)+"����");
		
		
		
		
		
		
	}
}
