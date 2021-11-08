package vn.devpro.bai2ToanTu.bai4;

import java.util.Scanner;

public class CitizenManagement {

	public static Citizen inputInfo() {
		Scanner scanner = new Scanner(System.in);
		Citizen ci = new Citizen();
		System.out.println("\n\tEnter the information about the citizen");
		System.out.print("\nEnter the id card of the citizen: "); ci.idCard = scanner.nextLine();
		System.out.print("Enter the last name of the citizen: "); ci.lateName = scanner.nextLine();
		System.out.print("Enter the name of the citizen: "); ci.name = scanner.nextLine();
		System.out.print("Enter the date of birth about citizen: "); ci.dateOfBirth = scanner.nextLine();
		System.out.print("Enter the gender of citizen: "); ci.gender = scanner.nextLine();
		System.out.print("Enter the address of citizen: "); ci.address = scanner.nextLine();
		System.out.print("Enter the phone number of citizen: "); ci.phoneNumber = scanner.nextLong();
		
		return ci;
		
	}

	public static void showsInfor(Citizen c) {
		System.out.println("\n\tShow the information of citizen");
		System.out.println("\tID card: " + c.idCard);
		System.out.println("\tName: " + c.lateName + " " + c.name);
		System.out.println("\tDate: " + c.dateOfBirth);
		System.out.println("\tGender: " + c.gender);
		System.out.println("\tAddress: " + c.address);
		System.out.println("\tPhone number: " + c.phoneNumber);

	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Citizen citizen1;
		Citizen citizen2;
		Citizen citizen3;
		
		System.out.println("Input information of citizen 1");
		citizen1 = inputInfo();
		System.out.println("Input information of citizen 2");
		citizen2 = inputInfo();
		System.out.println("Input information of citizen 3");
		citizen3 = inputInfo();
		
		System.out.println("Show information");
		showsInfor(citizen1);
		System.out.println();
		showsInfor(citizen2);
		System.out.println();
		showsInfor(citizen1);
		
		
		
		
	}

}
