package vn.devpro.Bai6.Bai3;

public class HocPhan {
	private int number;
	private String subjectCode;
	private String subjectName;
	private int creditNumber;
	private double subjectPoint;
	
	public void showSubject() {
		
		System.out.printf("|%-3d |%-11s |%-30s |%10d |%13.1f |%n",
				getNumber(), subjectCode, subjectName, creditNumber, subjectPoint);
	}

	
	public HocPhan() {
		super();
	}

	public HocPhan(String subjectCode, String subjectName, int creditNumber, double subjectPoint) {
		super();
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.creditNumber = creditNumber;
		this.subjectPoint = subjectPoint;
	}
	

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number + 1;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getCreditNumber() {
		return creditNumber;
	}

	public void setCreditNumber(int creditNumber) {
		this.creditNumber = creditNumber;
	}

	public double getSubjectPoint() {
		return subjectPoint;
	}

	public void setSubjectPoint(double subjectPoint) {
		this.subjectPoint = subjectPoint;
	}
	
	public double sumScore() {
		return subjectPoint * (double)creditNumber;
	}

	
}
