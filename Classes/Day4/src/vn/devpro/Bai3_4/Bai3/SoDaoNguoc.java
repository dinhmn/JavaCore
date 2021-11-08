package vn.devpro.Bai3_4.Bai3;

public class SoDaoNguoc {

//	Ham tim va tra ve so dao nguoc cua so nguyen duong n
	public static long soDaoNguoc(long n) {
		
		long m = 0, a;
		while (n > 0) {
			a = n % 10;
			m = m* 10 + a;
			n /= 10;
		}
		return m;
	}
	
	// Thuc hien nhap n, tim va in so dao nguoc so m la so dao nguoc cua n
	
	public static void thucHien() {
		long n;
		do {
			System.out.println("\tNhap so nguyen duong n: ");
			n = Long.parseLong(ThucThiCacBaiToan.scanner.nextLine());
		}while (n <= 0);
		
		long m = soDaoNguoc(n);
		System.out.println("\tSo dao nguoc cua " + n + " la: " + m);
	}
	
}
