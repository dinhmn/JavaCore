package vn.devpro.bai4.vd2;

import java.util.Scanner;

public class SuDungMang2 {

	
	public static void main(String[] args) {
		System.out.print("Nhap so nguyen duong: ");
		long n = Long.parseLong(new Scanner(System.in).nextLine());
		long m = n;
		byte[] b = new byte[32];
		int i = b.length - 1;
		while (n > 0) {
			b[i] = (byte)(n % 2);
			n = n/2;
			i--;
		}
		
		System.out.println(m + " = ");
		for (i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
		
	}
	
}
