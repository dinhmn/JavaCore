package vn.devpro.bai1.bai3;

import java.util.Scanner;

public class BieuThuc {

	private int a;
	private int b;
	private double x;
	
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap so nguyen a: ");
		a = scanner.nextInt();
		System.out.println("Nhap so nguyen b: ");
		b = scanner.nextInt();
		System.out.println("Nhap so thuc x: ");
		x = scanner.nextDouble();
	}
	// Phuong thuc tinh gia tri bieu thuc (Luu y:  a = 16, a / 10 = 1; gia tri can la 1.6)
	// float y = 1.9f;
	
	public double giaTriBieuThuc() {
		// a/ 10.0
		// 
		return ((double)a / 10) + Math.pow(a, b) - Math.sin((Math.PI * x)/3)/ Math.sqrt(Math.pow(a +b, 2)+5)
				+ Math.log(Math.pow(a, 2) + 1)  - Math.log(4 * Math.pow(x, 2 *a) + 3)/Math.log(3) / 2.55;
		
	}
	public void hienThi() {
		System.out.printf("Gia tri bieu thuc la %.5f", giaTriBieuThuc());
	}
}

