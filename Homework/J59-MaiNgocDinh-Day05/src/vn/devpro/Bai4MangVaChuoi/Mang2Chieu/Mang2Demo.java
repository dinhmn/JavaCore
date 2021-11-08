package vn.devpro.Bai4MangVaChuoi.Mang2Chieu;


import java.util.Iterator;
import java.util.Scanner;

public class Mang2Demo {
	static int m;
	static int n;
	static int[][] a;
	static int[][] b;
	static int[][] c;
	static Scanner scanner = new Scanner(System.in);
	
	public static void nhapMaTran() {
		System.out.println("Cho biet kich thuoc cua ma tran");
		System.out.print("\tSo dong m = "); 
		int m = Integer.parseInt(scanner.nextLine());
		System.out.print("\tSo cot n = ");
		int n = Integer.parseInt(scanner.nextLine());
		
		// Cap phat mang 2 chieu de luu tru cac phan tu du lieu cua ma tran
		// Moi phan tu mang (item) luu tru mot phan tu du lieu (element)
		a = new int[m][n];
		System.out.println("Nhap cac phan tu du lieu cua ma tran");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Nhap cac phan tu cua dong a[" + i +"]");
			for (int j = 0; j < a[i].length ; j++) {
				System.out.print("\tNhap phan tu a[" + i +"][" + j + "]: ");
				a[i][j] = Integer.parseInt(scanner.nextLine());
			
			}
			
		}
		
	}
	public static void hienThi() {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%7d", a[i][j]);
			}
			System.out.println("\n");
		}
	}
	
	public static void tongDong(){
		int tongDong = 0;
		for (int i = 0; i < a[0].length; i++) {
			tongDong += a[0][i];
		}
		int tongMax = tongDong;
		int chiSo = 0;
		for (int i = 0; i < a.length; i++) {
			tongDong = 0;
			for (int j = 0; j < a[i].length; j++) {
				tongDong += a[i][j];
			}
			if (tongDong > tongMax) {
				tongMax = tongDong;
				chiSo = i;
			}
		}
		System.out.println("Dong co tong lon nhat la a[" + chiSo + "] co tong la: " + tongMax);
	}
	public static void tongCot(){

		int[] d = new int[a[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				d[j] += a[i][j];
			}
		}
		
		int tongMax = d[0];
		int chiSo = 0;
		for (int i = 1; i < d.length; i++) {
			if (d[i] > tongMax) {
				tongMax = d[i];
				chiSo = i;
			}
		}
		System.out.println("Cot co tong cot lon nhat la d[" + chiSo +"] co tong la: " + tongMax);
	}

	public static void maTranChuyenVi() {
		b = new int[a[0].length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				b[j][i] = a[i][j];
			}
		}
		System.out.println("Ma tran chuyen vi cua ma tran A la");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.printf("%7d", b[i][j]);
			}
			System.out.println("\n");
		}
		
	}
	public static void nhanHaiMaTran() {
//		maTranChuyenVi();
		int[][] c = new int[a.length][b[0].length];
		System.out.println("Ket qua cua nhan hai ma tran la");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				int mul = 0;
				for (int k = 0; k < b.length; k++) {
					mul += a[i][k] * b[k][j];
				}
				c[i][j] = mul;
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhapMaTran();
		hienThi();
		tongDong();
		tongCot();
		maTranChuyenVi();
		nhanHaiMaTran();
	}

}
