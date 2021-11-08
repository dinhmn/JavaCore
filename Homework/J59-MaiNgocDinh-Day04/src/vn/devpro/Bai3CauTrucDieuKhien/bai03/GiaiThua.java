package vn.devpro.Bai3CauTrucDieuKhien.bai03;

import java.io.IOException;

public class GiaiThua {
	public static void thucHien() {
	
		System.out.println("\n------Bai toan tinh n!---------");
		int n;
		do {
			System.out.println("Nhap so nguyen duong n = "); 
			n = Integer.parseInt(ThucThiCacBaiToan.sc.nextLine());
		} while (n <= 0);
		
		System.out.println(n + "! = " + giaiThua(n));
	}
	//
	public static long giaiThua(int n) {
		
		//n! = 1 x 2 x 3 x ... x n
		long t = 1;
		for (int i = 1; i <= n; i++ ) {
			t *= i;
		}
		return t;
	}
}
