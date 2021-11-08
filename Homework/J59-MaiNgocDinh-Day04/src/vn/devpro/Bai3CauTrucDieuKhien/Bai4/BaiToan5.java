package vn.devpro.Bai3CauTrucDieuKhien.Bai4;

public class BaiToan5 {

	public static void thucThi() {
		int n;
		int s = 1;
		System.out.print("Nhap n: ");
		n = Integer.parseInt(ThucThi.scanner.nextLine());
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%d\t%n", fibonacii(s));
			s++;
		}
		
	}
	
	public static int fibonacii(int n) {
		if (n <= 2) {
			return 1;
		} 
		else return fibonacii(n-1) + fibonacii(n-2);
		
	}
	
}
