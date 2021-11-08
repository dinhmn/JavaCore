package vn.devpro.Bai3_4.Bai3;

public class GiaiThua {

	public static void thucHien() {
		int n;
		
		System.out.println("\n---------Bai toan tinh n!----------");
		
		do {
			System.out.println("Nhap so nguyen duong n = ");
			n = Integer.parseInt(ThucThiCacBaiToan.scanner.nextLine());
		} while(n <= 0);
	
		System.out.println(n + "! = " + giaiThua(n));
	}
	
	
	public static long giaiThua(int n) {
		
		long t = 1;
		for (int i = 1; i <= n; i++) {
			t *= i;
		}
		return t;
	}
}
