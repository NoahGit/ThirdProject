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
		Student stu = new Student("张三",25,'男'){

			/**
			 * 
			 */
			private static final long serialVersionUID = 1270450422417736611L;} ;
		Date date = new Date();
		System.out.println(date);
		//序列化 写
		FileOutputStream fos = new FileOutputStream(file1);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(stu); //序列化一个学生对象
		oos.writeObject(date); //序列化一个时间
		oos.flush();
		oos.close();
		
		//反序列化 读
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
