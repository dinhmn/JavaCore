package vn.devpro.bai1TongQuan.bai7;

public class StaffManagement {
	public static void main(String[] args) {
		Staff staff = new Staff();
		//Staff staff2 = new Staff();
		
		
		
		System.out.println("Enter information of staff 1: ");
		staff.inputInformationOfStaff();
//		System.out.println("Enter information of staff 2: ");
//		staff2.inputInformationOfStaff();
		
		
		System.out.printf("%-12s %-8s %-23s %-13s %-15s %-14s %-9s %n",
						"Order number", "Staff code", "Full name", "Date of birth ", "Days of working", "Overtime hours", "Salary");
		int orderNumber = 1;
		System.out.printf("%-13d", orderNumber++);
		staff.showInformationAndSalaryOfStaff();
	}
}
