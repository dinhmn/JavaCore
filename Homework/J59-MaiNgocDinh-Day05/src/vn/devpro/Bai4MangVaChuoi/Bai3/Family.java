package vn.devpro.Bai4MangVaChuoi.Bai3;

import java.util.Scanner;


public class Family {

	static Scanner scanner = new Scanner(System.in);
	
	static int n;
	static String[] name;
	static double[][] elec;
	
	public static void inputNumberList() {
		System.out.print("Nhap so luong ho gia dinh: ");
		n = Integer.parseInt(scanner.nextLine());
	}
	
	public static void inputNameOfFamily() {
		inputNumberList();
		name = new String[n];
		System.out.println("\nNhap ten cac ho gia dinh");
		
		for (int i = 0; i < name.length; i++) {
			System.out.print("Ten ho gia dinh thu " + (i + 1) + ": ");
			name[i] = scanner.nextLine();
		}
	}
	public static void inputElectricOfFamily() {
		elec = new double[n][3];
		System.out.println("\nNhap so tien dien cua moi gia dinh");
		
		for (int i = 0; i < elec.length; i++) {
			System.out.print("Nhap tien dien cua gia dinh thu " + (i + 1) + ": ");
			elec[i][0] = Double.parseDouble(scanner.nextLine());
		}
	}
	public static double totalElec(double elec) {
		if ( elec <= 50 ) {
			return elec * 1678;
		}
		else if (elec <= 100 ) {
			//Trong muc 2
			return 50 * 1678 + (elec-50) * 1734;
		}
		else if ( elec <= 200) {
			return 50 * 1678 + 50 * 1734 + (elec - 100) * 2014;
			
		}else if ( elec <= 300) {
			return 50 * 1678 + 50 * 1734 + 100 * 2014 + (elec-200) * 2536;
			
		}else if ( elec <= 300) {
			return 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (elec-300) * 2834;
			
		}else {
			return 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + 100 * 2834 +(elec - 400) * 2927;
		}
		
	}
	public static void totalMoneyElectricOfFamily() {
		for (int i = 0; i < elec.length; i++) {
			elec[i][1] = totalElec(elec[i][0]);
		}
	}
	public static void showList() {

		System.out.printf("%3s %-8s %9s %12s %n", "STT", "Ho va ten", "So dien", "Tien dien");
		for (int i = 0; i < elec.length; i++) {
			System.out.printf("%-3d %-8s %9.1f %,12.2f %n", (i+1), name[i], elec[i][0], elec[i][1]);
		}
	}
	public static void sort() {
		for (int i = 0; i < elec.length - 1; i++) {
			for (int j = i + 1; j < elec.length; j++) {
				if (elec[i][1] < elec[j][1]) {
					String temp = name[i];
					name[i] = name[j];
					name[j] = temp;
					for (int k = 0; k < elec[0].length; k++) {
						double temp1 = elec[i][k];
						elec[i][k] = elec[j][k];
						elec[j][k] = temp1;
					}
				}
			}
		}
	}
	
	public static void showThreeMoneyElecMax() {
		sort();
		System.out.printf("%3s %-8s %9s %12s %n", "STT", "Ho va ten", "So dien", "Tien dien");
		for (int i = 0; i < elec.length; i++) {
			if (i < 3) {
				System.out.printf("%-3d %-8s %9.1f %,12.2f %n", (i+1), name[i], elec[i][0], elec[i][1]);
			} else break;
		}
	}
//	chua fix duoc
	public static void hienThiTen(String str) {
		System.out.printf("%3s %-8s %9s %12s %n", "STT", "Ho va ten", "So dien", "Tien dien");
		for (int i = 0; i < elec.length; i++) {
			if (name[i].compareToIgnoreCase(str) == 0) {
				System.out.printf("%-3d %-8s %9.1f %,12.2f %n", (i+1), name[i], elec[i][0], elec[i][1]);
			}
		}
	}
	// Sap xep danh sach
	public static void sortABC() {
		for (int i = 0; i < elec.length - 1; i++) {
			for (int j = i + 1; j < elec.length; j++) {
				if ((name[i].substring(0, 1)).compareTo(name[j].substring(0, 1)) > 0) {
					String temp = name[i];
					name[i] = name[j];
					name[j] = temp;
					for (int k = 0; k < elec[0].length; k++) {
						double temp1 = elec[i][k];
						elec[i][k] = elec[j][k];
						elec[j][k] = temp1;
					}
				}
			}
		}
	}
	public static void sortElec() {
		for (int i = 0; i < elec.length - 1; i++) {
			for (int j = i + 1; j < elec.length; j++) {
				if (elec[i][0] > elec[j][0]) {
					String temp = name[i];
					name[i] = name[j];
					name[j] = temp;
					for (int k = 0; k < elec[0].length; k++) {
						double temp1 = elec[i][k];
						elec[i][k] = elec[j][k];
						elec[j][k] = temp1;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Chuong trinh tinh tien dien moi gia dinh");
		inputNameOfFamily();
		inputElectricOfFamily();
		totalMoneyElectricOfFamily();
		int choose;
		do {
			System.out.println("|======================== Menu Hien Thi =====================|");
			System.out.println("| Chon 1: Hien thi danh sach cac ho gia dinh.                |");
			System.out.println("| Chon 2: Hien thi 3 ho gia dinh co so kwh nhieu nhat.       |");
			System.out.println("| Chon 3: Hien thi chu gia dinh ten Truong.                  |");
			System.out.println("| Chon 4: Sap xep danh sach ho gia dinh theo bang chu cai.   |");
			System.out.println("| Chon 5: Sap xep danh sach theo so dien tang dan.           |");
			System.out.println("| Chon 0: Thoat khoi chuong trinh.                           |");
			System.out.println("|------------------------------------------------------------|");
			System.out.print("Nhap tuy chon cua ban: ");
			choose = Integer.parseInt(scanner.nextLine());
			
			switch (choose) {
			case 1:
				showList();
				break;
			case 2: 
				showThreeMoneyElecMax();
				break;
			case 3: 
				hienThiTen("Truong");
				break;
			case 4:
				sortABC();
				break;
			case 5:
				sortElec();
				break;
			case 0:
				System.out.println("Da thoat khoi chuong trinh.");
				return;
			default:
				System.out.println("Nhap sai tuy chon.\nVui long nhap lai!!!!");
				break;
			}
		}while (true);
		
		
		
	}


}
