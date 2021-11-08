package vn.devpro.bai2.bai2;

import java.util.Scanner;

public class Fibonaci {
	
	public static int f(int n) {
		if (n <= 2) {
			return 1;
		}
		else {
			return f(n-1) + f(n-2);
		}
	}
	public static void hienThiDayFibonaci(int n) {
		for (int i = 1; i < n; i++) {
			//array_type array_element = array[i];
			System.out.print(f(i) + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so tu nhien n: ");
		n = Integer.parseInt(scanner.nextLine());
		System.out.print("Day " + n + " so fibonaci: ");
		hienThiDayFibonaci(n);
	}

}
