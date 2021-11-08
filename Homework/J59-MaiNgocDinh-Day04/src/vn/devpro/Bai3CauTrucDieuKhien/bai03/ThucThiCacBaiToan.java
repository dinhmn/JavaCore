package vn.devpro.Bai3CauTrucDieuKhien.bai03;

import java.util.Scanner;

public class ThucThiCacBaiToan {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			System.out.println("=============MENU=============");
			System.out.println("|  1. Thuc hien bai toan mot  |");
			System.out.println("|  2. Thuc hien bai toan hai  |");
			System.out.println("|  3. Thuc hien bai toan ba   |");
			System.out.println("|  4. Thuc hien bai toan bon  |");
			System.out.println("|  0. Thoat khoi chuong trinh |");
			System.out.println("-------------------------------");
			System.out.println("chon chuc nang: ");
			int chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1:
				GiaiThua.thucHien();
				break;
			case 2:
				SoDaoNguoc.thucHien();
				break;
			case 3:
				EmuX.thucHien();
				break;
			case 4:
				PhanSoToiGian.thucThi();
				break;
			case 0:
				return;

			default:
				System.out.println("nhap khong hop le!!!");

			}
		} while (true);
	}
}
