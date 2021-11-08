package vn.devpro.bai1.bai1Object;

import java.util.Scanner;

public class HinhThangObject {
//	Cac thuoc tinh
	private double a;
	private double b;
	private double h;
//	Cac phuong thuc
	public void nhap() {
//		Phuong thuc Nhap du lieu vao
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap day lon a: ");
		a = scanner.nextDouble();
		System.out.print("Nhap day nho b: ");
		b = scanner.nextDouble();
		System.out.print("Nhap chieu cao h: ");
		h = scanner.nextDouble();
		
	}
	public double dienTich() {
//		Phuong thuc tinh dien tich
		// Tinh dien tich		
		double s = (a + b) * h / 2;		
		return s;
	}
	
	public void hienThi() {
//		 phuong thuc hien thi ket qua
		System.out.printf("Dien tich la %.3f", dienTich());
	}
	

}
