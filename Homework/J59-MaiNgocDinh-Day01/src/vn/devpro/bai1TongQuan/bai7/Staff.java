package vn.devpro.bai1TongQuan.bai7;

import java.util.Scanner;

public class Staff {

	private String staffCode;
	private String name;
	private String dateOfBirth;
	private int numberOfWorkingDaysInTheMonth;
	private int overtimeHours;
	
	public void inputInformationOfStaff() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\t\tEnter information of staff");
		System.out.print("Enter a staff code:  "); staffCode = scanner.nextLine();
		System.out.print("Enter a full name and last name:  "); name = scanner.nextLine();	
		System.out.print("Enter the date of bỉth:  "); dateOfBirth = scanner.nextLine();
		System.out.print("Enter the number of working days of the month:  "); numberOfWorkingDaysInTheMonth = scanner.nextInt();
		System.out.print("Enter overtime hours:  "); overtimeHours = scanner.nextInt();
	}
	
	public long salaryOfStaff() {
		return numberOfWorkingDaysInTheMonth * 350000 + overtimeHours * 45000;
	}
	public void showInformationAndSalaryOfStaff() {
		System.out.printf("%-8s %-23s %-13s %-15d %-14d %-9d", 
				staffCode, name, dateOfBirth, numberOfWorkingDaysInTheMonth, overtimeHours, salaryOfStaff());
	}
	
}
