package vn.devpro.Bai3CauTrucDieuKhien.bai03;


public class PhanSoToiGian {
	public static int ucln(int a, int b) {
		if (a < b) {
			int t = a; 
				a = b; 
				b = t;
		}
		int r = a % b;
		while (r != 0) {
			a = b;
			b = r;
			r = a % b;
		}
		return b;
	}
	public static void thucThi() {
		int x, y;
		System.out.println("Nhap gia tri tu so va mau so");
		System.out.print("x = "); x = Integer.parseInt(ThucThiCacBaiToan
				.sc.nextLine());
		System.out.print("y = "); y = Integer.parseInt(ThucThiCacBaiToan
				.sc.nextLine());
		
		System.out.printf("Phan so toi gian cua %d/%d la: %d/%d %n", x, y, (x/ucln(x, y)), (y/ucln(x, y)));
	}
}
