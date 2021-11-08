package vn.devpro.bai2.bai3;

import java.util.Scanner;

public class StudentManagement {

	public static Student nhap() {
		Scanner scanner = new Scanner(System.in);
		Student hs = new Student();
		System.out.println("Nhap cac thong tin cho hoc sinh");
		System.out.print("\tMa hoc sinh: "); hs.maHs = scanner.nextLine();
		System.out.print("\tHo dem: "); hs.hoDem = scanner.nextLine();
		System.out.print("\tTen: "); hs.ten = scanner.nextLine();
		System.out.print("\tNgay sinh (ngay-thang-nam): ");
		hs.ngaySinh = scanner.nextLine();
		System.out.print("\tDiem toan: "); hs.toan = scanner.nextDouble();
		System.out.print("\tDiem van: "); hs.van = scanner.nextDouble();
		System.out.print("\tDiem ly: "); hs.ly = scanner.nextDouble();
		System.out.print("\tDiem hoa: "); hs.hoa = scanner.nextDouble();
		System.out.print("\tDiem su: "); hs.su = scanner.nextDouble();
		System.out.print("\tDiem dia: "); hs.dia = scanner.nextDouble();
		System.out.print("\tDiem sinh: "); hs.sinh = scanner.nextDouble();
		System.out.print("\tDiem tieng anh: "); hs.anh = scanner.nextDouble();
		System.out.print("\tDiem giao duc cong dan: "); hs.gdcd = scanner.nextDouble();
		
		return hs;
	}
	
	public static double diemTb(Student hs) {
		return (2 * hs.toan + 2* hs.van + hs.ly +hs.hoa + hs.su + hs.dia + hs.sinh +  hs.anh + hs.gdcd);
	}
	
	public static void hienThi(Student hs) {
		System.out.println("Thong tin ve hoc sinh vua nhap");
		System.out.println("\tMa hoc sinh: " + hs.maHs);
		System.out.println("\tHo va ten: " + hs.hoDem + " " + hs.ten);
		System.out.println("\tNgay sinh: " + hs.ngaySinh);
		System.out.printf("\tDiem toan: %.1f%n", hs.toan);
		System.out.printf("\tDiem van: %.1f%n", hs.van);
		System.out.printf("\tDiem ly: %.1f%n" , hs.ly);
		System.out.printf("\tDiem hoa: %.1f%n" , hs.hoa);
		System.out.printf("\tDiem su: %.1f%n" , hs.su);
		System.out.printf("\tDiem dia: %.1f%n" , hs.dia);
		System.out.printf("\tDiem sinh: %.1f%n" , hs.sinh);
		System.out.printf("\tDiem anh: %.1f%n" , hs.anh);
		System.out.printf("\tDiem gdcd: %.1f%n" , hs.gdcd);
		System.out.printf("\tDiem TB: %.2f%n" , diemTb(hs));
		
	}
	
	public static void main(String[] args) {
		Student st;
		st = nhap();
		hienThi(st);
	}
	
}
