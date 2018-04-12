package deom01;

import java.io.Serializable;

public abstract class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -759029620999299120L;
	String name = "ÕÅÈý";
	int age = 23;
	char sex = 'ÄÐ';
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age, char sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
}
