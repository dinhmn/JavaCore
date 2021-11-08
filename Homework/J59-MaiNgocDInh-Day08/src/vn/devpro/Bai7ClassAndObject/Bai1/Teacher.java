package vn.devpro.Bai7ClassAndObject.Bai1;

public class Teacher extends Employee {

	private Subject subject;
	private double coefficientsSalary;
	private double salary;
	private int numberOfTeachingHours;
	
	public double calcuSalary() {
		return coefficientsSalary * 1150000 + numberOfTeachingHours * 60000;
	}
	
	public void nhap() {
		super.nhap();
		subject = new Subject();
		System.out.print("Nhap ma giao vien: "); subject.setCode(Integer.parseInt(Employee.scanner.nextLine()));
		System.out.print("Nhap ten giao vien: "); subject.setName(Employee.scanner.nextLine());
		System.out.print("Nhap he so luong: "); coefficientsSalary = Double.parseDouble(Employee.scanner.nextLine());
		System.out.print("Nhap so gio day: "); numberOfTeachingHours = Integer.parseInt(Employee.scanner.nextLine());
	}
	
	
	public void hienThi() {
		setSalary(calcuSalary());
		super.hienThi();
		System.out.printf("%12d %12s % %19.2f %,15.2f %13d %n", subject.getCode(), subject.getName(),coefficientsSalary, salary, numberOfTeachingHours);
	}
	

	public Teacher() {
		super();
	}

	public Teacher(int code, String surname, String name, Date dateOfBirth, int yearWorking, Subject subject,
			double coefficientsSalary, int numberOfTeachingHours) {
		super(code, surname, name, dateOfBirth, yearWorking);
		this.subject = subject;
		this.coefficientsSalary = coefficientsSalary;
		this.numberOfTeachingHours = numberOfTeachingHours;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public double getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(double coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getNumberOfTeachingHours() {
		return numberOfTeachingHours;
	}

	public void setNumberOfTeachingHours(int numberOfTeachingHours) {
		this.numberOfTeachingHours = numberOfTeachingHours;
	}
	

	
	
}
