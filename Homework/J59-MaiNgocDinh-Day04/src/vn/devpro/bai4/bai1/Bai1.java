package vn.devpro.bai4.bai1;

import java.util.Scanner;

public class Bai1 {
	static Scanner sc = new Scanner(System.in);
	public static void nhapDsDiem(double[] d) {
		System.out.println("Nhap diem cua cac thi sinh ");
		for (int i = 0; i < d.length; i++) {
			System.out.println("Nhap diem 3 mon cua thi sinh thu " + (i + 1));
			System.out.print("\t Diem toan: ");
			double toan = Double.parseDouble(sc.nextLine());
			System.out.print("\t Diem van: ");
			double van = Double.parseDouble(sc.nextLine());
			System.out.print("\t Diem anh: ");
			double anh = Double.parseDouble(sc.nextLine());
			d[i] = toan + van + 1.5 * anh;
		}
	}
	public static void hienThi(double[] d) {
		System.out.printf("%3s %3s %n", "STT", "Tot");
		for (int i = 0; i < d.length; i++) {
			System.out.printf("%-3d %-3.2f %n", (i+1), d[i]);
		} 
	}
	public static void sortASC(double[] d) {
		for (int i = 0; i < d.length; i++) {
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Nhap so thi sinh n = ");
		int n = Integer.parseInt(sc.nextLine());
		double[] d = new double[n];
		nhapDsDiem(d);
		hienThi(d);
	}

}
