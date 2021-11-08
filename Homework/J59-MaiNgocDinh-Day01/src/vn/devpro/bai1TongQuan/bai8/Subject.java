package vn.devpro.bai1TongQuan.bai8;

import java.util.Scanner;

public class Subject {

	private String subjectCode;
	private String subjectName;
	private int  coefficient;
	private double points;
	
	public void inputInformationOfSubject() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the subject code as: "); subjectCode = scanner.nextLine();
		System.out.print("Enter the subject name as: "); subjectName = scanner.nextLine();
		System.out.print("Enter the coefficient of the subject as: "); coefficient = scanner.nextInt();
		System.out.print("Enter the point of the subject as: "); points = scanner.nextDouble();
	}
	
	public double totalPoints() {
		return coefficient * points;
	}
	
	
}
