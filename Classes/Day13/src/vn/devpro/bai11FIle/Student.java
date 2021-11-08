package vn.devpro.bai11FIle;

import java.io.Serializable;

public class Student implements Serializable{

	private int code;
	private String name;
	private int age;
	private String gender;
	
	public Student(int code, String name, int age, String gender) {
		super();
		this.code = code;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [code=" + code + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
		
}
