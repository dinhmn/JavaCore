package vn.devpro.Bai7ClassAndObject.Bai1;

import java.util.Scanner;

public  class Employee {

	static Scanner scanner = new Scanner(System.in);
	
	protected int code;
	protected String surname;
	protected String name;
	protected Date dateOfBirth;
	protected int yearWorking;
	
	public void nhap() {
		System.out.print("Nhap ma nhan vien: "); code = Integer.parseInt(scanner.nextLine());
		System.out.print("Nhap ho cua ten: "); surname = scanner.nextLine();
		System.out.print("Nhap ten: "); name = scanner.nextLine();
		System.out.println("Nhap ngay-thang-nam");
		dateOfBirth = new Date();
		System.out.print("Nhap ngay: "); dateOfBirth.setDay(Integer.parseInt(scanner.nextLine()));
		System.out.print("Nhap ngay: "); dateOfBirth.setMonth(Integer.parseInt(scanner.nextLine()));
		System.out.print("Nhap ngay: "); dateOfBirth.setYear(Integer.parseInt(scanner.nextLine()));
		System.out.print("Nhap nam lam viec: "); yearWorking = Integer.parseInt(scanner.nextLine());
	}
	
	public void hienThi() {
		System.out.printf("%-8s %-23s %2d-%2d-%4d %12d ", code, name + " " + surname,
				dateOfBirth.getDay(),dateOfBirth.getMonth(),dateOfBirth.getYear(), yearWorking);
	}
	
	public Employee() {
		super();
	}

	public Employee(int code, String surname, String name, Date dateOfBirth, int yearWorking) {
		super();
		this.code = code;
		this.surname = surname;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.yearWorking = yearWorking;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getYearWorking() {
		return yearWorking;
	}

	public void setYearWorking(int yearWorking) {
		this.yearWorking = yearWorking;
	}
	
	
	
}
