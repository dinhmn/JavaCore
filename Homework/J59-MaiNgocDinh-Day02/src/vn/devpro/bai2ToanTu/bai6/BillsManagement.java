package vn.devpro.bai2ToanTu.bai6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BillsManagement {

	static Scanner scanner = new Scanner(System.in);
	static Merchandise[] merchandises = new Merchandise[5];
	static Bills bills = new Bills();
//	static DecimalFormat df = new DecimalFormat("###,###.##");
	public static Merchandise inputInfoOfMer() {
		Merchandise merchandise = new Merchandise();
		
//		System.out.println("Enter information of the merchandise");
		System.out.print("Enter merchandise name: ");	merchandise.merchandiseName = scanner.nextLine();
		System.out.print("Enter merchandise quantity: "); merchandise.merchandiseQuantity = scanner.nextInt();
		System.out.print("Enter merchandise price: ");	merchandise.merchandisePrice = scanner.nextLong();
		
		return merchandise;
	}
	
	public static void showInfoMer(Merchandise mer) {
		
//		System.out.print("\nMerchandise name: " + mer.merchandiseName);
//		System.out.print("\nMerchandise quantity: " + mer.merchandiseQuantity);
//		System.out.print("\nMerchandise price: " + mer.merchandisePrice);
//		System.out.print("\nConvert money: " + (mer.merchandiseQuantity * mer.merchandisePrice));
		System.out.printf("%-15s %-10d %-12d %-12d %n",
			mer.merchandiseName, mer.merchandiseQuantity, mer.merchandisePrice, (mer.merchandiseQuantity * mer.merchandisePrice));
	}
	
	public static Merchandise[] inputArrayMer() {
		
		for (int i = 0; i < merchandises.length; i++) {
			System.out.println("\nEnter information of the merchandise " + (i + 1));
			merchandises[i] = inputInfoOfMer();
			scanner.nextLine();
		}
		
		return merchandises;
		
	}
	
	public static double totalMerchandiseMoney() {
		double total = 0;
		
		for (int i = 0; i < merchandises.length; i++) {
			total += merchandises[i].merchandiseQuantity * merchandises[i].merchandisePrice;
		}
		return total;
		
	}
	
	public static void showsArrayMer() {
		System.out.println("\n\n\tShow information of the merchandise was inputted");
		System.out.printf("%-15s %-10s %-12s %-12s %n", "Name", "Quantity", "Price", "Money");
		for (int i = 0; i < merchandises.length; i++) {
			showInfoMer(merchandises[i]);
		}
		
	}

	public static Bills inputBills() {
		
		System.out.print("Enter number of bills:  "); bills.billsNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the name of customer: "); bills.clientName = scanner.nextLine();
		System.out.print("Enter customer's purchase date: "); bills.purchaseDate = scanner.nextLine();		
		merchandises = inputArrayMer();
		
		return bills;
	}
	
	public static void showInformationOfBills(Bills bills) {
		
		System.out.println("\n\tThe information of the customer bills");
		System.out.print("\nNumber of bills: " + bills.billsNumber);
		System.out.print("\nName of customer: " + bills.clientName);
		System.out.print("\nCustomer's purchase date: " + bills.purchaseDate);
		
		showsArrayMer();
		
		System.out.print("\nTotal amount: " + totalMerchandiseMoney());
		System.out.print("\nTotal payable (with VAT): " + (totalMerchandiseMoney() * 0.1 + totalMerchandiseMoney()));
	}
	
	public static void main(String[] args) {
		
		Bills bills;
		bills = inputBills();
		
		showInformationOfBills(bills);
		
		
	}
	
}
