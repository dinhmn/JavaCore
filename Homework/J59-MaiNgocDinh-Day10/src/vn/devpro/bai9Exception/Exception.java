package vn.devpro.bai9Exception;

import java.util.Scanner;

public class Exception {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int chon;
		do {
			System.out.println("\n----------------DANG NHAP/DANG KY---------------");
			System.out.println("\t1. Dang ky");
			System.out.println("\t2. Dang nhap");
			System.out.println("\t0. Thoat chuong trinh");
			System.out.print("Nhap lua chon cua ban: ");
			
			chon = Integer.parseInt(sc.nextLine());
			
			switch (chon) {
			case 1:
				dangKy();
				break;
			case 2:
				dangNhap();
				break;
			case 0:
				System.out.println("Thoat khoi chuong trinh");
				break;
			default:
				System.out.println("Moi ban chon lai");
			}
			
		} while (true);
		
	}

	private static void dangKy() {
		
		
	}

	public static void taiKhoan(User u) {
		if (u.getTaiKhoan().length() < 8) {
			throw new IllegalArgumentException("Nhap sai dinh dang");
		} else {
			
		}
	}
	
	private static void dangNhap() {
		
		
	}
}
