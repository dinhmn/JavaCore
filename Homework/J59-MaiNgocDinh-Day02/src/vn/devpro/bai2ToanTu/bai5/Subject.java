package vn.devpro.bai2ToanTu.bai5;

public class Subject {
	
	String subjectCode;
	String subjectName;
	double subjectCoefficient;
	double subjectPoint;
	
	
	public double total() {
		return subjectCoefficient * subjectPoint;
	}
}
