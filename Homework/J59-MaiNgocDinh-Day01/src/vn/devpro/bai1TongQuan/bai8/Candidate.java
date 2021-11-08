package vn.devpro.bai1TongQuan.bai8;

import java.util.Scanner;

public class Candidate {

	private String identificationNumber;
	private String lastAndMiddleName;
	private String name;
	private int day, month, year;
	private Subject subject1;
	private Subject subject2;
	private Subject subject3;
	
	public void inputInformationOfCandidate() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the identification number as: "); identificationNumber = scanner.nextLine();
		System.out.print("Enter your last name as: "); lastAndMiddleName = scanner.nextLine();
		System.out.print("Enter your name as: "); name = scanner.nextLine();
		System.out.println("Enter your date of birth");
		System.out.print("Enter date of birth as: "); day = scanner.nextInt();
		System.out.print("Enter month of birth as: "); month = scanner.nextInt();
		System.out.print("Enter year of birth as: "); year = scanner.nextInt();
		System.out.println("Enter your subject as");
	}
	
	public double total() {
		return subject1.totalPoints() + subject2.totalPoints() * subject3.totalPoints();
	}
	
	public void showInformationOfCandidate() {
		System.out.printf("%-8s %-23s %02d-%02d-%4d %n", 
				identificationNumber, lastAndMiddleName + " " + name, day, month, year);
		
		
	}
	
}
