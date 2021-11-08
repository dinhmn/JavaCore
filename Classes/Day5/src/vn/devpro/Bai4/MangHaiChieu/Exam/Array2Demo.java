package vn.devpro.Bai4.MangHaiChieu.Exam;

import java.util.Scanner;

public class Array2Demo {
	static int[][] a;
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void nhapMaTran() {
		System.out.println("Cho biet kich thuoc cua ma tran");
		System.out.print("\tSo dong m = "); 
		int m = Integer.parseInt(scanner.nextLine());
		System.out.print("\tSo cot n = ");
		int n = Integer.parseInt(scanner.nextLine());
		
		// Cap phat mang 2 chieu de luu tru cac phan tu du lieu cua ma tran
		// Moi phan tu mang (item) luu tru mot phan tu du lieu (element)
		a = new int[m][n];
		System.out.println("Nhap cac phan tu du lieu cua ma tran");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Nhap cac phan tu cua dong a[" + i +"]");
			for (int j = 0; j < a[i].length ; j++) {
				System.out.print("\tNhap phan tu a[" + i +"][" + j + "]: ");
				a[i][j] = Integer.parseInt(scanner.nextLine());
			
			}
			
		}
		
	}
	public static void hienThi() {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%7d", a[i][j]);
			}
			System.out.println("\n");
		}
	}
//	public static void total() {
//		int max = 0;
//		int total = 0 , chiso = 0;
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				total +=a[i][j];
//			}
//			if (total > max) {
//				max = total;
//				total = 0;
//				chiso = i;
//			}
//		}
//		System.out.println("Dong co tong lon nhat la: " + chiso  + " co tong: " + max);
//	}
	public static void tongDong() {
//		Tinh tong cua dong dau tien(a[0])
		int tongDong = 0;
		for (int j = 0; j < a[0].length; j++) {
			tongDong +=a[0][j];
		}
//		Khoi tao vi tri dang co tong max, va tong max
		int tongMax = tongDong;
		int vtMax =0;
//		Duyet tu dong thu 2(a[1]) tro di de tinh tong moi dong
//		Voi moi tong tinh duoc ban so sanh voi tongMax va gia tri moi 
//		neu gia tri moi lon hon tongMax hien dang co
		for (int i = 0; i < a.length; i++) {
			// Tinh 
			tongDong = 0;
			for (int j = 0; j < a[i].length; j++) {
				tongDong += a[i][j];
			}
//			So sanh tong moi (tong dong a[i]) voi tong max dang co
			if (tongDong > tongMax) {
				tongMax = tongDong;
				vtMax = i;
			}
		}
		System.out.println("Dong a[" + vtMax + "] co tong lon nhat");
		System.out.println("Tong do la " + tongMax);
	}
	public static void tongCot() {
		int tongCot = 0;
		for (int i = 0; i < a.length; i++) {
			tongCot +=a[i][0];
		}
		int vtMax = 0;
		int tongMax = tongCot;
//		for (int j = 0; j < a.length; j++) {
//			
//		}
		System.out.println(a.length);
	}
	
	public static void main(String[] args) {
		nhapMaTran();
		System.out.println("Ma tran so ban vua nhap la");
		hienThi();
//		total();
//		tongDong();
		tongCot();
	}

}
