package vn.devpro.bai4MangVaChuoi.MangVd1;

import java.util.Scanner;

public class SuDungMang01 {

	static Scanner scanner = new Scanner(System.in);
	public static void nhapMang(int[] a) {
		System.out.println("Nhap du lieu cho mang");
		for (int i = 0; i < a.length; i++) {
			System.out.print("\ta[" + i +"] = ");
			a[i] = Integer.parseInt(scanner.nextLine());
		}
	}
	
	public static void hienThi(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	public static void timKiem(int[] a, int x) {
		int d = 0;
		int i = 0;
		// Tim so x xuat hien dau tien trong mang
		while (i < a.length && a[i] != x) {
			i++;
		}
		// 
		if (i == a.length) {
			//Truong hop vuot qua mang, nghia la x khong xuat hien 
			System.out.println("So " + x + " khong xuat hien trong mang");
		} else {
			// x co xuat hien trong mang
			System.out.println("So " +  x + " co xuat hien trong mang");
			System.out.print("O cac vi tri co chi so la: ");
			d = 0;
			for (; i <a.length ; i++) {
				if (a[i] == x) {
					System.out.print(i + " ");
					d++;
				}
			}
			System.out.println("\nSo lan xuat hien la " + d);
		}
	}
	
	public static void main(String[] args) {
		int n;
		System.out.println("So phan tu du lieu can nhap: ");
		n = Integer.parseInt(scanner.nextLine());
		int[] a = new int[n];
		nhapMang(a);
		System.out.println("Mang vua nhap: ");
		hienThi(a);
		System.out.println("\nNhap so x can tim x: ");
		int x = Integer.parseInt(scanner.nextLine());
		timKiem(a, x);
		
	}

}
