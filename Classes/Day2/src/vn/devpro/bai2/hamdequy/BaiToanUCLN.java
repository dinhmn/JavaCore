package vn.devpro.bai2.hamdequy;

public class BaiToanUCLN {

	public static int ucln(int a, int b) {
		if (a % b == 0) {
			return b;
		}else {
			return ucln(b, a % b);
		}
	}
	
	public static void main(String[] args) {
		int a = 18, b = 15;
		
		int c =25, d = 40;
		
		int uc1 = (a > b) ? ucln(a, b) : ucln(b, a);
		int uc2 = (c > d) ? ucln(c, d) : ucln(d, c);
		int uc = (uc1 > uc2) ? ucln(uc1, uc2) : ucln(uc2, uc1);
		System.out.println("UCLN 4 so la " + uc);
	}
}
