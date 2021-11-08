package vn.devpro.Bai4.Bai3;

import java.util.Scanner;

public class FamilyElectricityMoneyManagement {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Family[] fami = { new Family("Nam"),
						  new Family("Trung"),
						  new Family("Hoang"),
						  new Family("Quoc"),
						  new Family("Tinh"),
						  new Family("Thuan"),
						  new Family("Long"),
						  new Family("Manh"),
						  new Family("Hai"),
						  new Family("Hao")	
		};
		Electricity[] elec = {
					new Electricity(145.6),
					new Electricity(245.3),
					new Electricity(135.8),
					new Electricity(356.3),
					new Electricity(423.5),
					new Electricity(365.6),
					new Electricity(233.4),
					new Electricity(143.3),
					new Electricity(134.5),
					new Electricity(352.7)
					
		};
		
		int chon;
		do {
			System.out.println("---------------MENU HIEN THI-------------");
			System.out.println(" 1. Hien thi danh sach.");
			System.out.println(" 2. Hien thi 3 ho gia dinh tieu thu nhieu dien");
			System.out.println(" 3. Hien thi ho gia dinh co chu ho ten 'Truong");
			System.out.println(" 4. Sap xep theo bang chu cai");
			System.out.println(" 5. Sap xep theo so dien tang dan.");
			System.out.print("Nhap lua chon cua ban: ");
			
			chon = Integer.parseInt(scanner.nextLine());
			
			switch (chon) {
			case 1:
				break;

			default:
				break;
			}
			
		} while (true);
		
		
		
	}

}
