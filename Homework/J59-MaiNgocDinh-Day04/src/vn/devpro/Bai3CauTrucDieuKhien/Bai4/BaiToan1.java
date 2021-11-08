package vn.devpro.Bai3CauTrucDieuKhien.Bai4;

public class BaiToan1 {

	public static void thucThi() {
		int n;
		System.out.print("Nhap so n: ");
		n = Integer.parseInt(ThucThi.scanner.nextLine());
		if (soNguyenTo(n)) {
			System.out.print(n + " la so nguyen to\n");
		} else {
			System.out.print(n + " khong la so nguyen to\n");
		}
	}
	
	public static boolean soNguyenTo(int n) {
		if ( n < 2) {
			return false;
		}
		for (int i = 2; i < (n - 1); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
