package vn.devpro.bai3.baitap1;

import java.util.Scanner;

public class BaiTap01 {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Xay dung menu
		int chon;
		do {
					System.out.println("===============CHUONG TRINH GIAI QUYET CAC BAI TOAN CO BAN==================");
		System.out.println("Hay chon mot bai toan bang cach bam phim so");
		System.out.println("\tBai toan 1, bam phim so 1");
		System.out.println("\tBai toan 2, bam phim so 2");
		System.out.println("\tBai toan 3, bam phim so 3");
		System.out.println("\tBai toan 4, bam phim so 4");
		System.out.println("\tThoat, bam phim so 0");
		System.out.print("Nhap lua chon cua ban: ");
		chon = Integer.parseInt(new Scanner(System.in).nextLine());
		
			switch (chon) {
			case 1: baiToan1(); break;
			case 2: baiToan2(); break;
			case 3: baiToan3(); break;
			case 4: baiToan4(); break;
			case 0: 
				System.out.println("Da thoat khoi chuong trinh");
				return;
			default:
				System.out.println("Lua chon khong hop le");
			}
		}while(true);

		
		
	}

	private static void baiToan1() {
		//Giai phuong trinh bac 2
		System.out.println("-----------Giai phuong trinh bac 2------------");
		System.out.print("\tNhap he so a: ");
		double a = Double.parseDouble(scanner.nextLine());
		if (a == 0) {
			System.out.print("Phuong trinh bac 2 khong xac dinh khi a =  0");
		}
		else {
			System.out.print("\tNhap he so b: ");
			double b = Double.parseDouble(scanner.nextLine());
			System.out.print("\tNhap he so c: ");
			double c = Double.parseDouble(scanner.nextLine());
			double delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phuong trinh bac hai vo nghiem");
			}
			else if (delta == 0) {
				double x1, x2;
				x1 = x2 = -b /2 /a;
				System.out.printf("Phuong trinh co nghiem kep x1 = x2 = %.3f%n", x1);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / 2 / a;
				double x2 = (-b - Math.sqrt(delta)) / 2 / a;
				System.out.println("Phuong trinh co hai nghiem phan biet");
				System.out.printf("\tx1 = %.3f %n \tx2 = %.3f %n", x1, x2);
			}
		}
				
		
		
	}

	private static void baiToan2() {
		double point;
		System.out.println("------------Xep loai hoc tap cua hoc sinh------------");
		System.out.println("\nNhap diem cua hoc sinh: ");
		point = Double.parseDouble(scanner.nextLine());
		if (point < 0 || point > 10) {
			System.out.println("Diem khong hop le (0 -> 10 la diem hop le)");
		}
		else {
			if (point >= 8) {
				System.out.println("Hoc sinh xep loai gioi");
			} else if (point >=7) {
				System.out.println("Hoc sinh xep loai kha");
			} else if (point >= 5) {
				System.out.println("Hoc sinh xep loai trung binh");
			} else {
				System.out.println("Hoc sinh xep loai yeu");
			}
		}
	}

	private static void baiToan3() {
		// TODO Auto-generated method stub
		System.out.println("Oh no");
	}

	private static void baiToan4() {

		System.out.println("--------Xac dinh so ngay trong thang------------");
		System.out.println("Nhap thang (1 -> 12): ");
		int thang = Integer.parseInt(scanner.nextLine());
		switch (thang) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31 ngay");
			break;
			
		case 4: case 6: case 9: case 11:
			System.out.println("30 ngay");
			break;
		case 2:
			System.out.println("Nhap nam: ");
			int nam = Integer.parseInt(scanner.nextLine());
			if ( nam % 4 == 0) {
				System.out.println("29 ngay");
			} else {
				System.out.println("28 ngay");
			}
			break;
		default:
			System.out.println("Thang khong hop le: ");
		}
		
	}

}
