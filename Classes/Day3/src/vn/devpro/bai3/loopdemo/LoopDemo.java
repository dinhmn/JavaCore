package vn.devpro.bai3.loopdemo;

import java.util.Scanner;

public class LoopDemo {

	public static int soChuSo(long n) {
		int d = 0;
		while( n != 0) {
			d++;
			n /= 10; // giam n di 10 lan
			
		}
		return d;
	}
	
	// Ham nhap diem, nhap diem khong hop le, yeu cau nhap lai
	static Scanner sc = new Scanner(System.in);
	public static double nhap() {
		double diem;
		
		do {
			System.out.println("Nhap diem (0 -> 10): ");
			diem = Double.parseDouble(sc.nextLine());
		} while (diem < 0 || diem > 10);
		
		return diem;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long n = 12345678901l;
//		
//		System.out.println("So chu so cua " + n + " la: " + soChuSo(n));
		
		double diem = nhap();
		System.out.println("Cam on!");
		
	}

}
