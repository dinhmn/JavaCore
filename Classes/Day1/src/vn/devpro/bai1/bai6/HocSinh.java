package vn.devpro.bai1.bai6;

import java.util.Scanner;

public class HocSinh {
	
	private String hoDem;
	private String ten;
	private int ngay, thang, nam;
	private String gioiTinh;
	private double diemTb;
	private String xldd;
	

	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\tNhap ho dem: "); hoDem = scanner.nextLine();
		System.out.print("\tNhap ten: "); ten = scanner.nextLine();
		System.out.println("\tNhap ngay sinh");
		System.out.print("\tNhap ngay: "); ngay = scanner.nextInt();
		System.out.print("\tNhap thang: "); thang = scanner.nextInt();
		System.out.print("\tNhap nam: "); nam = scanner.nextInt();
		// Xu ly troi lenh nhap chuoi
		scanner.nextLine();
		System.out.print("\tNhap gioi tinh: "); gioiTinh = scanner.nextLine();
		System.out.print("\tNhap diem tb: "); diemTb = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("\nNhap xep loai dao duc: "); xldd = scanner.nextLine();
		
		
	}
	public void hienThi() {
		System.out.printf("%-23s %02d-%02d-%4d %-9s %7.2f %-10s %n", hoDem + " " + ten,
				ngay, thang, nam, gioiTinh, diemTb, xldd);
	}
	
	
}
