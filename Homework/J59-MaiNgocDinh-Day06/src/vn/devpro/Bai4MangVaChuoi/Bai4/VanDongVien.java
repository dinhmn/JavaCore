package vn.devpro.Bai4MangVaChuoi.Bai4;

import java.util.Scanner;

public class VanDongVien {
	
	static Scanner scanner = new Scanner(System.in);
	
	static String[] str = {"Hoang", "Trung", "Nam", "Thang", "Hai", "Quoc", "Tinh", 
						"Hao", "Long", "Manh"};
	static int[][] a = {
			{145, 168, 185},
			{153, 178, 195},
			{154, 168, 195},
			{156, 189, 215},
			{153, 197, 232},
			{156, 185, 214},
			{158, 167, 243},
			{153, 169, 257},
			{152, 185, 154},
			{150, 175, 156},
			
	};
	
	public static int tongTT(int n) {
		int tong = 0;
		for (int i = 0; i < a[0].length; i++) {
			tong += a[n][i];
		}
		return tong;
	}
	
	public static void hienThi(String[] str, int[][] a) {
		System.out.printf("%-3s %-8s %5s %5s %5s %7s %n", "STT", "Ho va ten", "Lan 1", "Lan 2", "Lan 3", "Tong TT");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%-3d %-9s %5d %5d %5d %7d %n", (i + 1), str[i], a[i][0], a[i][1], a[i][2], tongTT(i));
		}
	}
	public static void sort(String[] str, int[][] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (tongTT(i) < tongTT(j)) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
					for (int k = 0; k < a[0].length; k++) {
						int temp1 = a[i][k];
							a[i][k] = a[j][k];
							a[j][k] = temp1;
					}
				}
			}
		}
	}
	public static void luaChon2() {	
		int tongMax = tongTT(0);
		int chiSo = 0;
		
		for (int i = 1; i < a.length; i++) {
			if (tongMax < tongTT(i)) {
				tongMax = tongTT(i);
				chiSo = i;
			}
		}
		System.out.printf("%-3s %-9s %4s %4s %4s %6s %n", "STT", "Ho va ten", "Lan1", "Lan2", "Lan3", "TongTT");
		System.out.printf("%-3d %-9s %4d %4d %4d %6d %n", (chiSo + 1), str[chiSo], a[chiSo][0], a[chiSo][1], a[chiSo][2], tongTT(chiSo));
	}

	public static void luaChon3() {
		String[] str1 = str.clone();
		int[][] a1 = a.clone();
		sort(str1, a1);
		int dem = 0;
		System.out.printf("%-3s %-9s %5s %5s %5s %7s %n", "STT", "Ho va ten", "Lan 1", "Lan 2", "Lan 3", "Tong TT");
		for (int i = 0; i < a1.length && i < 3; i++) {
				System.out.printf("%-3d %-9s %5d %5d %5d %7d %n", (i + 1), str1[i], a1[i][0], a1[i][1], a1[i][2], tongTT(i));
		}
		
	}
	
	public static void luaChon4() {
		System.out.println("Da sap xep roi xem lai danh sach di kia");
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((str[i].substring(0, 1)).compareTo(str[j].substring(0, 1)) > 0) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
					for (int k = 0; k < a[0].length; k++) {
						int temp1 = a[i][k];
							a[i][k] = a[j][k];
							a[j][k] = temp1;
					}
				}
				if ((str[i].substring(0, 1)).compareTo(str[j].substring(0, 1)) == 0) {
					if (str[i].compareTo(str[j]) > 0) {
						String temp = str[i];
						str[i] = str[j];
						str[j] = temp;
						for (int k = 0; k < a[0].length; k++) {
							int temp1 = a[i][k];
								a[i][k] = a[j][k];
								a[j][k] = temp1;
						}
					}
				}
			}
		}
	}
	public static void luaChon5() {
		System.out.printf("%-3s %-8s %5s %5s %5s %7s %n", "STT", "Ho va ten", "Lan 1", "Lan 2", "Lan 3", "Tong TT");
		int dem = 0;
		for (int i = 0; i < a.length; i++) {
			if ((str[i].substring(0, 1).compareTo("T")) == 0) {
				System.out.printf("%-3d %-9s %5d %5d %5d %7d %n", (i + 1), str[i], a[i][0], a[i][1], a[i][2], tongTT(i));
				dem = i;
			}
		}
		if (dem == 0) {
			System.out.println("\nKhong ton tai van dong vien bat dau bang chu 'T' ");
		}
		
	}
	

	public static void luaChon6(String k) {
		int chiSo = 0;
		System.out.printf("%-3s %-8s %4s %4s %4s %6s %n", "STT", "Ho va ten", "Lan1", "Lan2", "Lan3", "TongTT");
		for (int i = 0; i < a.length; i++) {
			if (str[i].indexOf(k) >= 0) {
				chiSo = i;
				System.out.printf("%-3d %-9s %4d %4d %4d %6d %n", (i + 1), str[i], a[i][0], a[i][1], a[i][2], tongTT(i));
			}
		}
		if (chiSo == 0) {
			System.out.println("\nKhong ton tai van dong vien co van 'an' ");
		}
	}
	public static void luaChon7() {
		System.out.println("Da sap xem lai roi do !");
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (str[i].length() > str[j].length()) {
						String temp = str[i];
						str[i] = str[j];
						str[j] = temp;
						for (int k = 0; k < a[0].length; k++) {
							int temp1 = a[i][k];
								a[i][k] = a[j][k];
								a[j][k] = temp1;
						}
				}
			}
		}
	}
	public static void luaChon8() {
		int chiSo = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (tongTT(i) == tongTT(i + 1)) {
				chiSo = i + 1;
				System.out.printf("%-3s %-8s %4s %4s %4s %6s %n", "STT", "Ho va ten", "Lan1", "Lan2", "Lan3", "TongTT");
				System.out.printf("%-3d %-9s %4d %4d %4d %6d %n", (i + 1), str[i + 1], a[i + 1][0], a[i + 1][1], a[i + 1][2], tongTT(i + 1));
				break;
			}
		}
		if (chiSo == 0) {
			System.out.println("Khong ton tai van dong vien thu 2 co cung thanh tich voi van dong vien thu 1. ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choose;
		
		do {
			System.out.println("|==================================MENU QUAN LY===============================|");
			System.out.println("| Chon 1: Hien thi danh sach van dong vien va tong thanh tich.                |");
			System.out.println("| Chon 2: Hien thi thong tin ve van dong vien co tong TT cao nhat.            |");
			System.out.println("| Chon 3: Hien thi 3 van dong vien co tong thanh tich cao nhat.               |");
			System.out.println("| Chon 4: Sap xep danh sach theo ten.                                         |");
			System.out.println("| Chon 5: HIen thi danh sach van dong vien bat dau bang chu 'T'.              |");
			System.out.println("| Chon 6: Hien thi danh sach van dong vien co van 'an'.                       |");
			System.out.println("| Chon 7: Sap xep danh sach van dong vien trong chieu dai cua ten tang dan.   |");
			System.out.println("| Chon 8: Hien thi danh sach cac van dong vien co cung tong TT va xep thu hai.|");
			System.out.println("| Chon 0: Thoat khoi chuong trinh.                                            |");
			System.out.println("|=============================================================================|");
			System.out.print("Nhap lua chon cua ban: ");
			choose = Integer.parseInt(scanner.nextLine());
			
			switch (choose) {
			case 1:
				hienThi(str, a);
				break;
			case 2:
				luaChon2();
				break;
			case 3:
				luaChon3();
				break;
			case 4:
				luaChon4();
				break;
			case 5:
				luaChon5();
				break;
			case 6:
				luaChon6("an");
				break;
			case 7:
				luaChon7();
				break;
			case 8:
				luaChon8();
				break;
			case 0:
				System.out.println("Da thoat khoi chuong trinh.");
				return;
			default:
				break;
			}
			
		}while(true);
		
	}

}
