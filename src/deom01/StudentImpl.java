package deom01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class StudentImpl extends Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5643680086689975364L;
	static File file1=new File("F:/D/fff.txt");
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student stu = new Student("����",25,'��'){

			/**
			 * 
			 */
			private static final long serialVersionUID = 1270450422417736611L;} ;
		Date date = new Date();
		System.out.println(date);
		//���л� д
		FileOutputStream fos = new FileOutputStream(file1);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(stu); //���л�һ��ѧ������
		oos.writeObject(date); //���л�һ��ʱ��
		oos.flush();
		oos.close();
		
		//�����л� ��
		FileInputStream fis = new FileInputStream(file1);
		@SuppressWarnings("resource")
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student stu2 = (Student) ois.readObject();
		System.out.println(stu2.getName()+"  "+stu2.getAge()+"  "+stu2.getSex());
		Date date2 = (Date) ois.readObject();
		System.out.println(date2);
		oos.close();
		
		
	}
	
}
