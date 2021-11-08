package vn.devpro.bai7TruuTuong.app05;

import java.util.Scanner;

public class QuanLyNhanVien {
	
	static NhanVien[] list;
	
	public static void nhapDs() {
		Scanner sc = new Scanner(System.in);
		int chon;
		System.out.println("Nhap danh sach nhan vien (chon 1 - nhap NVSX, 2 - nhap NVVP) ");
		for (int i = 0; i < list.length; i++) {
			System.out.println("Nhap nhan vien thu " + (i + 1));
			System.out.print("Nhap NVSX chon 1, NVVP chon 2: ");
			chon = Integer.parseInt(sc.nextLine());
			
			if (chon == 1) {
				list[i] = new NhanVienSx();
			}
			else {
				list[i] = new NhanVienVp();
			}
			list[i].nhap();
		}
	}
	
	public static void hienThiDs() {
		System.out.println("\n\t\tHien thi danh sach");
		System.out.printf("%3s %-12s %-25s %11s %10s %13s %10s %14s %n",
				"STT", "Ma Nhan Vien", "Ho ten", "Nam Vao Lam", "San Pham", "Muc Luong", "Ngay Nghi", "Luong");
		int stt = 1;
		for (NhanVien nv : list) {
			System.out.printf("%-3d", stt++);
			nv.hienThi();
		}
	}
	
	public static double tongLuongMoiThang() {
		double tong = 0;
		for (NhanVien nv : list) {
			tong += nv.luong();
		}
		return tong;
	}
	
	public static void main(String[] args) {
		System.out.print("Nhap so nhan vien: ");
		list = new NhanVien[Integer.parseInt(NhanVien.sc.nextLine())];
		nhapDs();
		hienThiDs();
		System.out.printf("\t\t\tTong luong moi thang cong ty phai tra la: %,16.2f", tongLuongMoiThang());
	}
	
}
